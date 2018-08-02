package com.tinman.project.Controller;


import com.tinman.project.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/log")
    public ModelAndView logUser(){
        ModelAndView model = new ModelAndView();
        model.addObject("UserFront",new User());
        model.setViewName("index");
        return model;

    }

    @PostMapping("/valid")
    public @ResponseBody String ValidUser(@ModelAttribute User user){
        if(("admin".equals(user.getName()) && "admin".equals(user.getPassword()))|| ("1111".equals(user.getName()) && "1111".equals(user.getPassword()))){
            return "User OK";
        }else
            return "User EROR";
    }





}
