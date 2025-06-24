package com.credifacil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credifacil.entity.Perfil;
import com.credifacil.repository.PerfilRepository;

@Service
public class PerfilService {
	
	@Autowired
    private PerfilRepository perfilRepository;
    
    public List<Perfil> getAllPerfiles() {
        return perfilRepository.findAll();
    }
    
    public Perfil savePerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

}
