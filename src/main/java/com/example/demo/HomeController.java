package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/dogform")
    public  String loadDogForm(Model model){
        model.addAttribute("dog", new Dog());
        return "Dogform";
    }

    @PostMapping("/dogform")
    public String processdogForm(@Valid Dog dog,
                                BindingResult result){
        if (result.hasErrors()){
            return "Dogform";
        }
        return "Dogconfirm";
    }
}

