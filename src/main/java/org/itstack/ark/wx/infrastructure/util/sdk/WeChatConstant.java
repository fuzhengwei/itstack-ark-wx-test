package org.itstack.ark.wx.infrastructure.util.sdk;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
public class WeChatConstant {
    /**
     * 请求消息类型
     */
    // 文本
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";
    // 图片
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";
    // 语音
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";
    // 视频
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";
    // 地理位置
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";
    // 链接
    public static final String REQ_MESSAGE_TYPE_LINK = "link";
    // 小视频
    public static final String REQ_MESSAGE_TYPE_SHORTVIDEO ="shortvideo";
    // 事件
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";
    // 事件 - 关注
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
    // 事件 - 取消关注
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";
    // 事件 - 扫描带参数的二维码
    public static final String EVENT_TYPE_SCAN = "scan";
    // 事件 - 上报地理位置
    public static final String EVENT_TYPE_LOCATION = "location";
    // 事件 - 点击底部菜单
    public static final String EVENT_TYPE_CLICK = "click";
    // 事件 - 自定义菜单URl视图
    public final String EVENT_TYPE_VIEW ="VIEW";
    // 事件 - 模板消息送达情况提醒
    public final String EVENT_TYPE_TEMPLATESENDJOBFINISH="TEMPLATESENDJOBFINISH";
    /**
     * 响应消息类型
     */
    // 文本
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";
    // 文本
    public static final String RESP_MESSAGE_TYPE_IMAGE ="image";
    // 语音
    public static final String RESP_MESSAGE_TYPE_VOICE = "voice";
    // 音乐
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";
    // 图文
    public static final  String RESP_MESSAGE_TYPE_NEWS = "news";
    // 视频
    public static final String RESP_MESSAGE_TYPE_VIDEO ="video";
    /**
     * 基本信息
     */
    // 发送方微信账号
    public static final String FROM_USER_NAME = "FromUserName";
    // 接收方微信账号
    public static final String TO_USER_NAME = "ToUserName";
    // 消息id
    public static final String MSG_ID = "MsgId";
    // 消息类型
    public static final String MSG_TYPE = "MsgType";
    // 消息内容
    public static final String CONTENT = "Content";
    // 消息发送时间
    public static final String CREATE_TIME = "CreateTime";
    // 事件类型
    public static final String EVENT = "Event";

}