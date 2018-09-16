package com.ubb.sistema_planes_estrategicos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");

        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index-mecanico").setViewName("index-mecanico");
        registry.addViewController("/index-ejecutivo").setViewName("index-ejecutivo");

        registry.addViewController("/clientes").setViewName("clientes");
        registry.addViewController("/herramientas").setViewName("herramientas");
        registry.addViewController("/maquinarias").setViewName("maquinarias");
        registry.addViewController("/repuestos").setViewName("repuestos");

        registry.addViewController("/servicios").setViewName("servicios");
        registry.addViewController("/vehiculos").setViewName("vehiculos");
        registry.addViewController("/fichas").setViewName("fichas");
    }
}
