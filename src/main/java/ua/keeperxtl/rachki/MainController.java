package ua.keeperxtl.rachki;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    public String homePage() {
        return "index";
    }

}
