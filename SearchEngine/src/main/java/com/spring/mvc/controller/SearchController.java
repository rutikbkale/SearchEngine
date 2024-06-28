package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/")
    public String landingPage() {
        return "index";
    }

    @RequestMapping("/search")
    public RedirectView searching(@RequestParam("query") String query) {
        String url = "https://www.google.com/search?q=" + query;
        return new RedirectView(url);
    }

}
