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
@Table(name = "Sesion")
public class Sesion {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idSesion;
	    
	    @ManyToOne
	    @JoinColumn(name = "idUsuario", nullable = false)
	    private Usuario usuario;
	    
	    private String contrasena;
	    private Date fechaSesion;
	    private String estado;

}
