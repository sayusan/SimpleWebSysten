package com.qdenbs.db.table.entity;

import java.math.BigDecimal;

public class FileKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.file.ticket_number
     *
     * @mbg.generated
     */
    private BigDecimal ticketNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.file.ticket_number
     *
     * @return the value of public.file.ticket_number
     *
     * @mbg.generated
     */
    public BigDecimal getTicketNumber() {
        return ticketNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.file.ticket_number
     *
     * @param ticketNumber the value for public.file.ticket_number
     *
     * @mbg.generated
     */
    public void setTicketNumber(BigDecimal ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}