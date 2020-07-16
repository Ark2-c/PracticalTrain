package com.gfz.controller;

import com.gfz.dto.Admin;
import com.gfz.service.AdminService;
import com.gfz.service.imp.AdminSImp;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LoginController
 * date: 2020/7/15 18:41
 *
 * @author gfz
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private AdminService adminService;

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView model) {
        model.setViewName("login");
        return model;

    }

    @RequestMapping(value = "/check")
    public @ResponseBody Map<String, String> check(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "passwd", required = true) String passwd,
            HttpServletRequest request, HttpServletResponse response
            ) throws IOException {
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(username)) {
            ret.put("type", "error");
            ret.put("msg", "用户名不能为空！");
            System.out.println("username is null");
            return ret;
        }
        //从数据库中去查找用户
        adminService = new AdminSImp();
        //管理员
        Admin admin = adminService.findByName(username);
        if (admin == null) {
            ret.put("type", "error");
            ret.put("msg", "不存在该用户！");
            System.out.println("The administrator was not found");
            return ret;
        }

        if (!passwd.equals(admin.getPasswd())) {
            ret.put("type", "error");
            ret.put("msg", "密码错误！");
            System.out.println("wrong passwd");
            return ret;
        }

        request.getSession().setAttribute("admin", admin);
        ret.put("type", "success");
        ret.put("msg", "登录成功！");
        System.out.println("success");
        return ret;

    }
    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView model) {
        model.setViewName("index");
        return model;

    }

}
