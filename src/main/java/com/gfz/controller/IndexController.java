package com.gfz.controller;

import com.gfz.dto.CityCitizen;
import com.gfz.service.CitizenService;
import com.gfz.service.imp.CitizenSImp;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: IndexController
 * date: 2020/7/16 20:35
 *
 * @author gfz
 */
@Controller
@RequestMapping(value = "index")
public class IndexController {

    private CitizenService citizenService;
    @RequestMapping(value = "getCount")
    public  @ResponseBody Map<String,Integer> getCounter(HttpServletRequest request) throws IOException {
        Map<String,Integer> map = new HashMap<String,Integer>();
        citizenService = new CitizenSImp();
        List<CityCitizen> list = citizenService.count();
        System.out.println(list);
        CityCitizen cityCitizen;
        for (int i= 0;i<list.size();i++){
            cityCitizen = list.get(i);
            map.put(cityCitizen.getName(),cityCitizen.getCount());
        }

        map.put("type",1);

        return map;
    }

    @RequestMapping(value = "/login_out")
    public String login(HttpServletRequest request) {
        request.getSession().setAttribute("admin", null);
        return "redirect:login";
    }
}
