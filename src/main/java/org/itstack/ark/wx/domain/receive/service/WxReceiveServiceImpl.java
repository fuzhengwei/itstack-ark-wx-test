package org.itstack.ark.wx.domain.receive.service;

import org.itstack.ark.wx.application.WxReceiveService;
import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.service.engine.Engine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Service("wxReceiveService")
public class WxReceiveServiceImpl implements WxReceiveService {

    @Resource(name = "msgEngineHandle")
    private Engine msgEngineHandle;

    @Override
    public String doReceive(BehaviorMatter behaviorMatter) throws Exception {
        return msgEngineHandle.process(behaviorMatter);
    }

}
