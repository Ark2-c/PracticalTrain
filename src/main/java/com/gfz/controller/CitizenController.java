package com.gfz.controller;

import com.gfz.dto.Citizen;
import com.gfz.service.CitizenService;
import com.gfz.service.imp.CitizenSImp;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * ClassName: CitizenController
 * date: 2020/7/17 13:06
 *
 * @author gfz
 */
@Controller
@RequestMapping("Citizen")
public class CitizenController {
    @RequestMapping(value = "/getView")
    public ModelAndView login(ModelAndView model) {
        model.setViewName("citizen");
        return model;

    }
    @RequestMapping("/getPerson")
    public String getPerson(HttpServletRequest request,
                           HttpServletResponse response) throws IOException {
        String name = (String) request.getSession().getAttribute("name");
        CitizenService citizenService = new CitizenSImp();
        List<Citizen> list = citizenService.getPerson(name);
        String jsonStr= JSON.toJSONString(list);
        PrintWriter out=response.getWriter();
        out.println(jsonStr);
        System.out.println(jsonStr);
        out.close();
        return jsonStr;
    }
    @RequestMapping(value = "/setName")
    public void setName(@RequestParam(value = "cityName", required = true) String cityName,
                        HttpServletRequest request){
        request.getSession().setAttribute("name",cityName);
        System.out.println("成功获取城市名:"+cityName);
    }

}
