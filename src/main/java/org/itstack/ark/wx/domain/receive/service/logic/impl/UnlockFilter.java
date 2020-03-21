package org.itstack.ark.wx.domain.receive.service.logic.impl;

import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.repository.IUserAuthGrantRepository;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 * 博客文章解锁
 */
@Service("unlock")
public class UnlockFilter implements LogicFilter {

    @Autowired
    private IUserAuthGrantRepository userAuthGrantRepository;

    @Override
    public String filter(BehaviorMatter request) {
        try {
            userAuthGrantRepository.grantAuth(request.getOpenId(), request.getContent().toUpperCase());
        } catch (DuplicateKeyException ignored) {}
        return "恭喜你已经解锁bugstack虫洞栈全部文章！";
    }

}
