package com.credifacil.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    @ManyToOne
    @JoinColumn(name = "idPerfil", nullable = false)
    private Perfil perfil;
    
    private String usuario;
    private String contrasena;
    private String nombre;
    private String documento;
    private String celular;
    private String correo;

}
