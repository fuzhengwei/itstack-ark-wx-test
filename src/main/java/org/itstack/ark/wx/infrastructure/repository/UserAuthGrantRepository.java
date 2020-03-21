package org.itstack.ark.wx.infrastructure.repository;

import org.itstack.ark.wx.domain.receive.repository.IUserAuthGrantRepository;
import org.itstack.ark.wx.infrastructure.dao.UserAuthDao;
import org.itstack.ark.wx.infrastructure.po.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Repository("userAuthGrantRepository")
public class UserAuthGrantRepository implements IUserAuthGrantRepository {

    @Autowired
    private UserAuthDao userAuthDao;

    @Override
    public void grantAuth(String openId, String token) {
        UserAuth userAuthReq = new UserAuth();
        userAuthReq.setOpenId(openId);
        userAuthReq.setToken(token);
        userAuthReq.setUuid(openId + "_" + token);
        userAuthDao.insert(userAuthReq);
    }

    @Override
    public void revokeAuth(String openId) {
        userAuthDao.delete(openId);
    }

}
