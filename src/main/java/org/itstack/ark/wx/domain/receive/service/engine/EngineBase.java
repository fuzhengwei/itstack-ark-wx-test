package org.itstack.ark.wx.domain.receive.service.engine;

import org.apache.commons.lang3.StringUtils;
import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
public class EngineBase extends EngineConfig implements Engine {

    @Override
    public String process(BehaviorMatter request) throws Exception {
        throw new RuntimeException("未实现消息引擎服务");
    }

    /**
     * 消息类型&业务内容路由器
     *
     * @param request 消息内容
     * @return 返回消息处理器
     */
    protected LogicFilter router(BehaviorMatter request) {

        Map<String, LogicFilter> logicGroup = logicFilterMap.get(request.getMsgType());

        // 事件处理
        if ("event".equals(request.getMsgType())) {
            return logicGroup.get(request.getEvent());
        }

        // 内容处理
        if ("text".equals(request.getMsgType())) {
            // 文章解锁处理
            if (StringUtils.isNoneBlank(request.getContent()) && request.getContent().length() == 6 && Pattern.matches("[0-9A-Za-z]{6}", request.getContent())) {
                return logicGroup.get("unlock");
            }
            //应答回复
            return logicGroup.get("answer");
        }

        return null;
    }

}
