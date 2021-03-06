package com.naiyin.loansystem.web.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter2 implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        Date date=null;
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
            date=df.parse(s);
        } catch (ParseException e) {
            System.out.println("日期转换器解析异常！");
        }
        return date;
    }
}
