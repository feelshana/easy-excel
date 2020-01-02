package me.about.poi;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class User {

    @ExcelColumn(name = "年龄")
    private int age;
    @ExcelColumn(name = "姓名")
    private String username;
    @ExcelColumn(name = "公司")
    private String company;
    @ExcelColumn(name = "地址")
    private String address;
    @ExcelColumn(name = "生日")
    private Date birthday;
    @ExcelColumn(name = "薪水")
    private BigDecimal salary;

}
