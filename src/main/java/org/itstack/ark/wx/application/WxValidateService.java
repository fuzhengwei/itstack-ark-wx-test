package org.itstack.ark.wx.application;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
public interface WxValidateService {

    boolean checkSign(String signature, String timestamp, String nonce);

}
