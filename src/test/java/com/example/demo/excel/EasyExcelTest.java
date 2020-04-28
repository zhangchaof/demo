package com.example.demo.excel;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.demo.easyexcel.EasyExcelUtil;
import com.example.demo.easyexcel.ExcelModel;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 单元测试
 *
 * @author Lynch
 */
public class EasyExcelTest {
    public static void main(String[] args) throws Exception {
        //writeExcel();
        readExcel();
    }

    /**
     * 写入Excel
     *
     * @throws FileNotFoundException
     * @author
     */
    private static void writeExcel() throws FileNotFoundException {
        List<ExcelModel> excelModelList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            ExcelModel excelModel = new ExcelModel();
            excelModel.setAmount("1000" + i);
            excelModel.setDesc(i + "");
            excelModelList.add(excelModel);
        }

        long beginTime = System.currentTimeMillis();
        OutputStream out = new FileOutputStream("D:/aaa.xlsx");
        EasyExcelUtil.writeExcelWithModel(out, excelModelList, ExcelModel.class, ExcelTypeEnum.XLSX);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("总共耗时 %s 毫秒", (endTime - beginTime)));

        excelModelList = null;
    }

    /**
     * 读取Excel
     *
     * @throws FileNotFoundException
     */
    private static void readExcel() throws FileNotFoundException {
        try {
            InputStream inputStream = new FileInputStream("D:\\User\\Desktop\\data.xlsx");
            //读入文件，每一行对应一个 Model，获取 Model 列表
            List<ExcelModel> objectList = EasyExcelUtil.readExcelWithModel(inputStream, ExcelModel.class, ExcelTypeEnum.XLSX);
            BigDecimal orin = new BigDecimal("0");
            System.out.println("objectList = " + objectList.size());
            for (ExcelModel excelModel : objectList) {
                if("银行转存".equals(excelModel.getDesc()) || "银行转取".equals(excelModel.getDesc())) {
                    String amount = excelModel.getAmount();
                    orin = orin.add(new BigDecimal(amount.trim()));
                }
            }
            System.out.println(orin);
        } catch (IOException e) {
            System.err.println("******************************");
            e.printStackTrace();
        }
    }


    @Test
    public void testList() {
        List list = new ArrayList();
        list.add("1");
        list.add(0,"2");
        list.add(0,"3");
        System.out.println("list = " + list);
    }
}