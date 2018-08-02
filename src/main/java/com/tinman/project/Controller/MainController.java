package com.tinman.project.Controller;


import com.tinman.project.Model.User;
import com.tinman.project.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepositor;

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

    @PostMapping("/new_user")
    public ModelAndView getPageReg(){
        ModelAndView model = new ModelAndView();
        model.addObject("FrontUser", new User());
        model.setViewName("registration");
        return model;
    }

    @PostMapping("/reg_user")
    public String saveNewUser(@ModelAttribute User user){
        userRepositor.save(user);
        return "index";
    }


}
