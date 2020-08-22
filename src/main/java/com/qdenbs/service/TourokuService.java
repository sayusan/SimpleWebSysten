package com.qdenbs.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qdenbs.bean.TicketBean;
import com.qdenbs.db.table.entity.SyainEntity;
import com.qdenbs.db.table.entity.SyainExample;
import com.qdenbs.db.table.entity.TicketEntity;
import com.qdenbs.db.table.mapper.SyainMapper;
import com.qdenbs.db.table.mapper.TicketMapper;

/**
 * 新規登録 Service
 * @author 33448
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TourokuService {

    @Autowired
    private SyainMapper syainMapper;

    @Autowired
    private TicketMapper ticketMapper;

    SyainExample example = new SyainExample();

    /*
     * ユーザーを検索（プルダウン用）
     */
    public List<SyainEntity> selectSyain(){
        example.createCriteria().getAllCriteria();
        return syainMapper.selectByExample(example);
    }


    /*
     * チケット登録
     */
    public int registTicket(TicketBean ticketBean) {
        TicketEntity ticketEntity = new TicketEntity();
        Date date = new Date();
        try {
            // 新規登録
            ticketEntity.setStatus(ticketBean.getStatus());
            ticketEntity.setTitle(ticketBean.getTitle());
            ticketEntity.setText(ticketBean.getText());
            ticketEntity.setTanto(ticketBean.getTanto());
            ticketEntity.setKosu(ticketBean.getKosu());
            ticketEntity.setRegistDt(date);
            ticketEntity.setUpdateDt(date);
            ticketMapper.insertTicket_(ticketEntity);
            System.out.print("regist complete!");

            // 自動採番されたIDを取得
            BigDecimal id = ticketEntity.getTicketNumber();
            System.out.print(id);

            return id.intValue();

        }catch(Exception e) {
            System.out.print(e.getMessage());
            return 0;
        }
    }

//    /*
//     * 添付ファイル登録
//     */
//    public int registFile(MultipartFile file, TicketBean ticket) {
//        // ファイル登録先のディレクトリ
//        File uploadDir = null;
//
//        if (!file.getOriginalFilename().isEmpty()) {
//            // fileテーブル登録用Entityクラス
//            FileEntity fileEntity = new FileEntity();
//
//            // ファイル保管
//            try {
//                uploadDir = mkdirs(uploadDirPath, ticketNo.toString());
//                File uploadFile = new File(uploadDir.getPath(), Utils.getFileName(file.getOriginalFilename()));
//                uploadFile.createNewFile();
//                byte[] bytes = file.getBytes();
//                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(uploadFile));
//                bos.write(bytes);
//                bos.close();
//
//                // fileテーブル登録内容の設定
//                BigDecimal ticketNumber = new BigDecimal(ticket.getId());
//                fileEntity.setTicketNumber(ticketNumber);
//                fileEntity.setFilePath(uploadFile.getPath());
//                fileEntity.setFileName(file.getOriginalFilename());
//                fileEntity.setFileSize(String.valueOf(file.getSize()));
//                fileEntity.setFileTitle("ファイル説明文");
//
//                // fileテーブルへ登録
//                insLen = registDataMapper.insertFile(fileEntity);
//                if (insLen == 0) {
//                    System.out.println("ファイル情報の登録に失敗しました");
//                    transactionManager.rollback(transactionStatus);
//
//                    // レスポンス情報の作成
//                    Map<String, Object> errorCause = new HashMap<String, Object>();
//                    errorCause.put("cause", "ファイル情報の登録に失敗しました");
//                    errorCauseList.add(errorCause);
//                    response.setErrorCauseList(errorCauseList);
//                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
//                }
//
//            } finally {
//            }
//        }
//    }
}
