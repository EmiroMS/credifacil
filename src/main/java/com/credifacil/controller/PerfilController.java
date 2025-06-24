package com.credifacil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credifacil.entity.Perfil;
import com.credifacil.service.PerfilService;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {
	
	@Autowired
    private PerfilService perfilService;
    
    @GetMapping("/verperfiles")
    public List<Perfil> getAllPerfiles() {
        return perfilService.getAllPerfiles();
    }
    
    @PostMapping("/guardarperfil")
    public Perfil createPerfil(@RequestBody Perfil perfil) {
        return perfilService.savePerfil(perfil);
    }

}
