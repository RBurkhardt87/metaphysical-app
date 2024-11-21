package rb.practice.metaphysical_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("herbs")
public class HerbController {

    @GetMapping("")
    public String renderHerbsIndex(){

        return "herbs/index";
    }

}
