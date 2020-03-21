package org.itstack.ark.wx.interfaces;

import org.itstack.ark.wx.application.UserLockAuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@CrossOrigin("https://bugstack.cn")
@RestController
@RequestMapping("/api")
public class BlogController {

    private Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private UserLockAuthService userLockAuthService;
    @Resource
    private Map<String, String> answerMap;

    @GetMapping(value = "check", produces = "application/json;charset=utf-8")
    public String check(@RequestParam String token) {
        try {
            logger.info("校验博客浏览用户授权状态{}开始", token);
            boolean status = userLockAuthService.checkAuth(token);
            logger.info("校验博客浏览用户授权状态{}完成", token, status);
            return status ? "success" : "refuse";
        } catch (Exception e) {
            logger.error("校验博客浏览用户授权状态{}失败", token, e);
            return "refuse";
        }
    }

    @GetMapping(value = "getAnswerMap", produces = "application/json;charset=utf-8")
    public String getAnswerMap(@RequestParam String key){
        return answerMap.get(key);
    }

}
