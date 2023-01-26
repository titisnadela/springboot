package com.sgiasia.javaspringboot.springmvc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Titis") String name,
                           @RequestParam(name="address", required=false, defaultValue="Jakarta") String address,
                           Model model)
    {
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        return "greeting";
    }

    @GetMapping("/greeting2")
    public String greeting2(@RequestParam(name="name", required=false, defaultValue="Titis") String name,
                           @RequestParam(name="address", required=false, defaultValue="Banyuwangi") String address,
                            @RequestParam(name="domisili", required=false, defaultValue="Jakarta") String domisili,
                           Model model)
    {
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        model.addAttribute("domisili", domisili);
        return "greeting2";
    }
}
