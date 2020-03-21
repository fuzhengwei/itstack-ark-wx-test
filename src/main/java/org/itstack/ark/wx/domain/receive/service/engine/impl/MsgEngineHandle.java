package org.itstack.ark.wx.domain.receive.service.engine.impl;

import org.apache.commons.lang3.StringUtils;
import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.model.MessageTextEntity;
import org.itstack.ark.wx.domain.receive.service.engine.EngineBase;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.itstack.ark.wx.infrastructure.util.XmlUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Service("msgEngineHandle")
public class MsgEngineHandle extends EngineBase {

    @Value("${wx.config.originalid:gh_95b2229b90fb}")
    private String originalId;

    @Override
    public String process(BehaviorMatter request) throws Exception {
        LogicFilter router = super.router(request);
        if (null == router) return null;
        String resultStr = router.filter(request);
        if (StringUtils.isBlank(resultStr)) return "";
        //反馈信息[文本]
        MessageTextEntity res = new MessageTextEntity();
        res.setToUserName(request.getOpenId());
        res.setFromUserName(originalId);
        res.setCreateTime(String.valueOf(System.currentTimeMillis() / 1000L));
        res.setMsgType("text");
        res.setContent(resultStr);
        return XmlUtil.beanToXml(res);
    }

}
