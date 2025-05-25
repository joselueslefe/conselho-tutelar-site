package br.com.conselhotutelar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/direitos")
    public String direitos() {
        return "direitos";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }
}
