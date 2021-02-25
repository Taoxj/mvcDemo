package com.xjt.controller;

import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    // test5555
    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(4);
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
}
