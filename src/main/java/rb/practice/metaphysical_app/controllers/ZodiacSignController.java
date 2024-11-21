package rb.practice.metaphysical_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("signs")
public class ZodiacSignController {

    @GetMapping("")
    public String renderSignsIndex(){

        return "signs/index";
    }

}
