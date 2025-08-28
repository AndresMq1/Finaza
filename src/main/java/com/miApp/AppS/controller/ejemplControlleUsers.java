package com.miApp.AppS.controller;

import com.miApp.AppS.dto.UserDTO;
import com.miApp.AppS.entity.User;
import com.miApp.AppS.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class ejemplControlleUsers {
    private final UserService userService;

    public ejemplControlleUsers(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public  String listUsersView(Model model){
        List<UserDTO> listaUsuarios = userService.getAllUsers();
        model.addAttribute("users", listaUsuarios);
        return "list";
    }
}
