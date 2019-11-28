package com.example.demo.easyexcel;

import java.io.Serializable;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import lombok.Data;

/**
 *
 *
 */
@SuppressWarnings("serial")
@Data
public class ExcelModel extends BaseRowModel implements Serializable{
    @ExcelProperty(value = "金额" ,index = 0)
    private String amount;

    @ExcelProperty(value = "类型",index = 1)
    private String desc;


}
