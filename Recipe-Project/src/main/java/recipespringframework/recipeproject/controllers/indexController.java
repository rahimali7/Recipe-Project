package recipespringframework.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping(name = "/index")
    public String getIndexPage() {
        return "index";
    }
}
