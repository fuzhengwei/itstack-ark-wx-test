package org.itstack.ark.wx.domain.receive.service.logic.impl;

import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Service("answer")
public class AnswerFilter implements LogicFilter {

    @Resource
    private Map<String, String> answerMap;

    @Override
    public String filter(BehaviorMatter request) {
        String content = request.getContent();
        String res = answerMap.get(content);
        if (null != res) return res.replaceAll("#br","\n");
        return answerMap.get("default").replaceAll("#br","\n");
    }

}
