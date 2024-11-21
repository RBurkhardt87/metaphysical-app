package rb.practice.metaphysical_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("home")
public class Home {


    @GetMapping("")
    public String renderHomePage(){
        return "homepage";
    }

   // homepage will have navigation to : Stones, Herbs, Zodiac Signs and Elemental Signs (Horoscope if I can get API for it)

}
