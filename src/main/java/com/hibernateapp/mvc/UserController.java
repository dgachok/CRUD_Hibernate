package com.hibernateapp.mvc;

import com.hibernateapp.model.User;
import com.hibernateapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String addStudents( User user){
        userService.addUser(user);
        return "redirect:/index";
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView indexStudent(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("users", userService.getAllUser());
        return model;
    }
    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/index";
    }

    @RequestMapping(value = "/students/edit/{id}", method = RequestMethod.GET)
    public String editUser(@PathVariable("id") Integer id, Model model){
        userService.getUser(id);
        model.addAttribute("user", userService.getUser(id));
        return "edit";
    }

    @RequestMapping(value = "/students/update", method = RequestMethod.POST)
    public String updateUser(User user){
        userService.editUser(user);
        return "redirect:/index";
    }
}
