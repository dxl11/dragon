package com.dragon.springsourcecodestudy.aopStudy.cglibAop;

import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/12/20
 */
public class UserServiceImpl {
    /**
     * 查询功能
     *
     * @return
     */
    List<String> findUserList() {
        return Collections.singletonList("小A");
    }
}
