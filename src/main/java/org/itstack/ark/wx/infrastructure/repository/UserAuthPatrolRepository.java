package org.itstack.ark.wx.infrastructure.repository;

import org.itstack.ark.wx.domain.lockauth.repository.IUserAuthPatrolRepository;
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
@Repository("userAuthPatrolRepository")
public class UserAuthPatrolRepository implements IUserAuthPatrolRepository {

    @Autowired
    private UserAuthDao userAuthDao;

    @Override
    public boolean isTokenExist(String token) {
        UserAuth userAuth = userAuthDao.queryUserAuth(token);
        return null != userAuth;
    }

}
