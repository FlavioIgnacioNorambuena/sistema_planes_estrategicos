package com.ubb.sistema_planes_estrategicos.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(new BCryptPasswordEncoder())
                .usersByUsernameQuery(
                        "SELECT username, password, habilitado FROM usuario WHERE username=?")
                .authoritiesByUsernameQuery(
                        "SELECT username, role FROM rol_usuario WHERE username=?");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/mario404.gif", "/arrow-down.png", "/arrow-right.png", "/bg.png").permitAll()
                .antMatchers("/hover-min.css", "/style.css", "/jCollapsible.min.js", "/search.js").permitAll()


                .antMatchers("/index").access("hasRole('ADMIN')")

                .antMatchers("/herramientas").access("hasRole('ADMIN')")
                .antMatchers("/herramienta/crear").access("hasRole('ADMIN')")
                .antMatchers("/herramienta/editar").access("hasRole('ADMIN')")
                .antMatchers("/herramienta/editar/*").access("hasRole('ADMIN')")

                .antMatchers("/maquinarias").access("hasRole('ADMIN')")
                .antMatchers("/maquinaria/crear").access("hasRole('ADMIN')")
                .antMatchers("/maquinaria/editar").access("hasRole('ADMIN')")
                .antMatchers("/maquinaria/editar/*").access("hasRole('ADMIN')")

                .antMatchers("/repuestos").access("hasRole('ADMIN')")
                .antMatchers("/repuesto/crear").access("hasRole('ADMIN')")
                .antMatchers("/repuesto/editar").access("hasRole('ADMIN')")
                .antMatchers("/repuesto/editar/*").access("hasRole('ADMIN')")

                .antMatchers("/downloadAdminExcel").access("hasRole('ADMIN')")
                .antMatchers("/downloadAdminPdf").access("hasRole('ADMIN')")


                .antMatchers("/index-mecanico").access("hasRole('MECH')")
                .antMatchers("/mecanico/crear/servicio/").access("hasRole('MECH')")
                .antMatchers("/fichas").access("hasRole('MECH')")
                .antMatchers("/ficha/crear").access("hasRole('MECH')")
                .antMatchers("/ficha/editar").access("hasRole('MECH')")
                .antMatchers("/ficha/editar/*").access("hasRole('MECH')")


                .antMatchers("/index-ejecutivo").access("hasRole('EJEC')")

                .antMatchers("/clientes").access("hasRole('EJEC')")
                .antMatchers("/cliente/crear").access("hasRole('EJEC')")
                .antMatchers("/cliente/editar").access("hasRole('EJEC')")
                .antMatchers("/cliente/editar/*").access("hasRole('EJEC')")

                .antMatchers("/servicios").access("hasRole('EJEC')")
                .antMatchers("/servicio/crear").access("hasRole('EJEC')")
                .antMatchers("/servicio/editar").access("hasRole('EJEC')")
                .antMatchers("/serrvicio/editar/*").access("hasRole('EJEC')")

                .antMatchers("/vehiculos").access("hasRole('EJEC')")
                .antMatchers("/vehiculo/agregar").access("hasRole('EJEC')")
                .antMatchers("/vehiculo/editar").access("hasRole('EJEC')")
                .antMatchers("/vehiculo/editar/*").access("hasRole('EJEC')")

                .antMatchers("/downloadSPVExcel").access("hasRole('EJEC')")
                .antMatchers("/downloadSPVPdf").access("hasRole('EJEC')")

                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .permitAll()
                .defaultSuccessUrl("/").successHandler(successHandler())
                .and()
                .logout()
                .permitAll()
                .and()
                .csrf().disable();
    }

    @Bean
    public AuthenticationSuccessHandler successHandler() {
        return new AuthenticationHandler();
    }
}