package org.itstack.ark.wx.domain.receive.service.logic.impl;

import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.repository.IUserAuthGrantRepository;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 * 取消关注公众号
 */
@Service("unsubscribe")
public class UnsubscribeFilter implements LogicFilter {

    @Autowired
    private IUserAuthGrantRepository userAuthGrantRepository;

    @Override
    public String filter(BehaviorMatter request) {
        userAuthGrantRepository.revokeAuth(request.getOpenId());
        return null;
    }
    
}
