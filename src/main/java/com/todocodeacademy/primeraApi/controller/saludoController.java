package com.todocodeacademy.primeraApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/apisaludos")
public class saludoController {
    
    @Operation(summary = "Saluda al Mundo")
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo!";
    }

    @Operation(summary = "Saluda con tu nombre y edad")
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre, @PathVariable int edad){
        return "Hola Mundo! " + nombre + " Tu edad es: " + edad;
    }
}
