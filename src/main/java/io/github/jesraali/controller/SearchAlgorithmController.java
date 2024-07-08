package io.github.jesraali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


/** Handles requests and returns names of FreeMarker templates */
@Controller
public class SearchAlgorithmController {

    @GetMapping(value = {"/", "/index"})
    public String home(Model model) {
//        List<String> algorithms = Arrays.asList("Binary Search", "Linear Search", "Jump Search", "Interpolation Search");
//        model.addAttribute("algorithms", algorithms);
        return "index"; // Returns index.ftl from templates directory
    }

//
//    @GetMapping("/visualise") //Maps HTTP GET requests to /visualize. Takes in parameter of "algorithm"
//    public String visualize(@RequestParam("algorithm") String algorithm, Model model) {
//        model.addAttribute("algorithm", algorithm);
//        return "visualise"; // Adds the 'algorithm' to the 'Model', and returns visualize.ftl from templates directory
//    }
}