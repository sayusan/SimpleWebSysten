//*******************************************************************************
// Copyright (c) 2020 KYUSHU ELECTRIC POWER CO., INC. All Rights Reserved.
//
// システム名       ：NW高大受付システム
// サブシステム名   ：
//
//===============================================================================
// 変更日        変更者                     変更内容
//===============================================================================
// 2020.04.01    xxxxxxxx.xxxxxxxx[QBS]     新規作成
//*******************************************************************************
package com.qdenbs.db.mybatis.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * エンティティクラス名変更
 * （MyBatis自動生成プラグイン）
 * @author xxxxxxxx.xxxxxxxx[QBS]
 * @version 1.0
 */
public class BeanClassNamePlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable table) {
        super.initialized(table);

        String entityName = table.getBaseRecordType();
        table.setBaseRecordType(entityName + "Entity");

//        String mapperName = table.getMyBatis3JavaMapperType();
//        table.setMyBatis3JavaMapperType(mapperName.replaceAll("Mapper$", "Dao"));

    }

}
