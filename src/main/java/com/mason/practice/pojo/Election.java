/*
 * Copyright (C), 2019-2021, XXX
 * FileName: Election
 * Author:   HangHangLi
 * Date:     2021/9/12 20:04
 * Description: 选举人信息实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mason.practice.pojo;


import java.io.Serializable;
/**
实现序列化以满足ehcache存储要求
 * @author hanghangli
 */
public class Election implements Serializable {
    private String stockAbbr;
    private String stockCode;

    public String getStockAbbr() {
        return stockAbbr;
    }

    public void setStockAbbr(String stockAbbr) {
        this.stockAbbr = stockAbbr;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

}
