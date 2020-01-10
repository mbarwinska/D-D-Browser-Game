package game;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GameController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String enterNameForm(Model model) {
        Player player = new Player();
        model.addAttribute("form", player);
        return "index";
    }

}
