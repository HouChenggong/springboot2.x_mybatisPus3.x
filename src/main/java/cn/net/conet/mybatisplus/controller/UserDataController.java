package cn.net.conet.mybatisplus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import cn.net.conet.mybatisplus.entity.UserData;
import cn.net.conet.mybatisplus.service.UserDataService;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xiyou
 * @since 2019-07-05
 */
@RestController
@RequestMapping("/deadlock")
public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @GetMapping(value = "/list")
    public List<UserData> list(Integer limit) {
        return userDataService.list(limit);
    }
}
