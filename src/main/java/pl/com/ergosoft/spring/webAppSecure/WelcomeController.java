package pl.com.ergosoft.spring.webAppSecure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Principal principal) {
        return "index";
    }
}