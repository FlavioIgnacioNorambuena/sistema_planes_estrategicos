package com.ubb.sistema_planes_estrategicos.controller;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

//WebController se encarga de mapear las url de la página web
@Controller
public class WebController {

    @GetMapping("/") //Para el URL "/"
    public ModelAndView index(Authentication authentication) {
        String role = authentication.getAuthorities().toString();
        String viewName = "index";

        HashMap<String, String> page = new HashMap<String, String>();
        page.put("title", "Home"); //Se entregan atributos como titulo, página activa e ícono a usar
        page.put("active", "home");
        page.put("glyph", "glyphicon glyphicon-home");

        if (role.equals("[ROLE_ADMIN]")) {
            viewName = "index";
        }
        return new ModelAndView(viewName).addObject("page", page);
        //Se retorna un objeto ModelAndView, al que se le indica cuál es el nombre del archivo HTML que se mostrará en esta URL y además se le entrega
    }

    //Error
    @GetMapping("/error")
    public ModelAndView error() {
        return new ModelAndView("error");
    }

}
