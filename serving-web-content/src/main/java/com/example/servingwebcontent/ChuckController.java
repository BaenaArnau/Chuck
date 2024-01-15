package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(ChuckController.CHUCK)
public class ChuckController {
    public static final String CHUCK = "/chuck";

    @Autowired
    ChuckService chuckService;

    @GetMapping
    public String getChuckQuote(Model model){
        ChuckQuote q =chuckService.getChuckQuote();
        model.addAttribute("frase",q.value());
        return "chuck";
    }
}
