package org.itstack.ark.wx.domain.receive.service.logic.impl;

import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 * 关注微信公众号
 */
@Service("subscribe")
public class SubscribeFilter implements LogicFilter {

    private final String content = "嗨！终于等到你的到来 /:rose。我是小傅哥，每周推送原创优质技术文章，你可以从这里学习到；手写RPC、手写Mybatis、JVM、Netty、Agent、公众号开发、架构设计、源码分析和算法等核心技术。\n" +
            "\n" +
            "微信：fustack \n" +
            "博客：https://bugstack.cn\n" +
            "Github：https://github.com/fuzhengwei\n" +
            "\n" +
            "你用剑、我用刀，好的代码都很烧，望你不吝出招。";

    @Override
    public String filter(BehaviorMatter request) {
        return content;
    }

}
