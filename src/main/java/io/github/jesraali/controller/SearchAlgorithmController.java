package io.github.jesraali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/** Handles requests and returns names of FreeMarker templates */
@Controller
public class SearchAlgorithmController {

    @GetMapping("/") //Maps HTTP GET requests to the root / to the home() method
    public String home() {
        return "index"; // Returns index.ftl from templates directory
    }

    @GetMapping("/visualize") //Maps HTTP GET requests to /visualize. Takes in parameter of "algorithm"
    public String visualize(@RequestParam("algorithm") String algorithm, Model model) {
        model.addAttribute("algorithm", algorithm);
        return "visualize"; // Adds the 'algorithm' to the 'Model', and returns visualize.ftl from templates directory
    }
}