package org.itstack.ark.wx.domain.receive.repository;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
public interface IUserAuthGrantRepository {

    // 授权认证
    void grantAuth(String openId, String token);

    // 撤销认证
    void revokeAuth(String openId);

}
