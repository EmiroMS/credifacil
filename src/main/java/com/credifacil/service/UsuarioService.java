package com.credifacil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credifacil.entity.Usuario;
import com.credifacil.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
    private UsuarioRepository usuarioRepository;
    
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
    
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    public Usuario findByUsuario(String usuario) {
        return usuarioRepository.findByUsuario(usuario);
    }
    
    
}
