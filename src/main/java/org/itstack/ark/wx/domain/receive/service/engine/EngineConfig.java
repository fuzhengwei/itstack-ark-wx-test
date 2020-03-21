package org.itstack.ark.wx.domain.receive.service.engine;

import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.itstack.ark.wx.domain.receive.service.logic.impl.AnswerFilter;
import org.itstack.ark.wx.domain.receive.service.logic.impl.SubscribeFilter;
import org.itstack.ark.wx.domain.receive.service.logic.impl.UnlockFilter;
import org.itstack.ark.wx.domain.receive.service.logic.impl.UnsubscribeFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
public class EngineConfig {

    @Resource(name = "answer")
    private AnswerFilter answerFilter;
    @Resource(name = "subscribe")
    private SubscribeFilter subscribeFilter;
    @Resource(name = "unlock")
    private UnlockFilter unlockFilter;
    @Resource(name = "unsubscribe")
    private UnsubscribeFilter unsubscribeFilter;

    static Map<String, Map<String, LogicFilter>> logicFilterMap;

    @PostConstruct
    public void init() {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("text", new HashMap<String, LogicFilter>() {{
            put("answer",answerFilter);
            put("unlock", unlockFilter);
        }});
        logicFilterMap.put("event", new HashMap<String, LogicFilter>() {
            {
                put("subscribe", subscribeFilter);
                put("unsubscribe", unsubscribeFilter);
            }
        });
    }

}
