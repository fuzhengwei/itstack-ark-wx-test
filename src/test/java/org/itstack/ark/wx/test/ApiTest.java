package org.itstack.ark.wx.test;

import com.alibaba.fastjson.JSON;
import org.itstack.ark.wx.domain.receive.model.MessageTextEntity;
import org.itstack.ark.wx.infrastructure.util.XmlUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Pattern;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
public class ApiTest {

    private final static String defaultAnswer = "您好！\n" +
            "\n" +
            "我是bugstack虫洞栈的作者：付政委，如果您有什么需求，欢迎留言。\n" +
            "\n" +
            "获取专题案例源码，请按需回复以下数字编号1、2、3...：\n" +
            "0、资源下载，NetAssist网络调试助手等\n" +
            "1、netty案例\n" +
            "2、rpc案例\n" +
            "3、用Java实现jvm源码\n" +
            "4、基于JavaAgent的全链路监控案例\n" +
            "5、iot-gateway案例源码\n" +
            "6、DDD落地\n" +
            "7、SpringCloud专题\n" +
            "8、itstack-ark-wx，微信公众号开发\n";

    public static void main(String[] args) throws ParseException {
        boolean res = Pattern.matches("[0-9A-Za-z]{6}", "dbcAd0");
        System.out.println(res);
    }



}
