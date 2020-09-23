package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TovarController {

    @GetMapping("/tovar")
    public String tovar(Model model){
        model.addAttribute("tovarName", "Tovar1");
        return "tovar_page";
    }

}
