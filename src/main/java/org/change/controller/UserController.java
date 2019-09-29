package org.change.controller;

import org.change.model.User;
import org.change.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.POST)
    public User selectUser(int uid) throws Exception {
        User user = userService.selectUser(uid);
        return user;
    }
}
