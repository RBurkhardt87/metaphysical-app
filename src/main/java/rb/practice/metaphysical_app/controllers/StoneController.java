package rb.practice.metaphysical_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rb.practice.metaphysical_app.models.Stone;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("stones")
public class StoneController {

    //TODO: Update this for repository & persistence when ready
    private List<Stone> stones = new ArrayList<>();


    @GetMapping
    public String renderStoneIndex(Model model){


        return "stones/index";
    }

    @GetMapping("/add")
    public String renderAddStoneForm(){


        return "stones/add";
    }

    @PostMapping("/add")
    public String processAddStoneForm(){


        return "redirect:/stones";
    }

}
