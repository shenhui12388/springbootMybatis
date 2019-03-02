package top.wservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.wservice.entity.Userm;
import top.wservice.service.UsermService;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author senfel
 * @Title: UsermController
 * @ProjectName springbootMybatis
 * @Description: TODO
 * @date 2018/9/816:43
 */
@Controller
public class UsermController {
    @Autowired
    private UsermService usermService;
    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        request.setAttribute("index","index");
        return "index";
    }

    @RequestMapping("/userm")
    @ResponseBody
    public Userm getUserm(){
        Userm userm = new Userm();
        userm.setUesrname("sss");
        userm.setId(new BigDecimal(1));
        userm.setPassword("pass");

        return userm;
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<Userm> getList(){
        return usermService.selectByExample();
    }


    @RequestMapping("/list2")
    public ModelAndView hello2(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "Amy");
        mv.setViewName("thymeleaf");
        return mv;
    }
    @RequestMapping("/listUser")
    public ModelAndView listUser(){
        ModelAndView mv = new ModelAndView();
        List<Userm> userms = usermService.selectByExample();
        mv.addObject("users", userms);
        mv.setViewName("users");
        return mv;
    }

}
