package rb.practice.metaphysical_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("elements")
public class ElementController {

    @GetMapping("")
    public String renderElementsIndex(){

        return "elements/index";
    }

}
