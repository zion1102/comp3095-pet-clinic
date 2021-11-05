package ca.gbc.comp3095.comp3095petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    public  String listOwners(){
        return "owners/index";
    }
}
