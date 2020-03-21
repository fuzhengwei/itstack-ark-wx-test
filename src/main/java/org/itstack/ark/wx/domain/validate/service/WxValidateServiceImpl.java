package org.itstack.ark.wx.domain.validate.service;

import org.itstack.ark.wx.application.WxValidateService;
import org.itstack.ark.wx.infrastructure.util.sdk.SignatureUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Service("wxValidateService")
public class WxValidateServiceImpl implements WxValidateService {

    private Logger logger = LoggerFactory.getLogger(WxValidateServiceImpl.class);

    @Value("${wx.config.token}")
    private String token;

    @Override
    public boolean checkSign(String signature, String timestamp, String nonce) {
        return SignatureUtil.check(token, signature, timestamp, nonce);
    }

}
