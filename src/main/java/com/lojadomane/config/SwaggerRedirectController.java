package com.lojadomane.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirectController {

    @GetMapping("/swagger")
    public String swagger() {
        return "redirect:/swagger-ui/index.html#/pedido-controller/embalar";
    }
}
