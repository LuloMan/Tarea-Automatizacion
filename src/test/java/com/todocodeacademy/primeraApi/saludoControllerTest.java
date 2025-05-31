package com.todocodeacademy.primeraApi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.todocodeacademy.primeraApi.controller.saludoController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(saludoController.class)
public class saludoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    public void testHolaMundo() throws Exception {
        mockMvc.perform(get("/apisaludos/hola"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hola Mundo!"));
    }
}
