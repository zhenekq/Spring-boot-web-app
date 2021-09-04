package by.zhenekns.dev.inc.ZheneknWebBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String loginPage(Model model){
        return "login";
    }

    @PostMapping
    public String authorization(@RequestParam String email,
                                @RequestParam String password,
                                Model model){
        return "main";
    }

}
