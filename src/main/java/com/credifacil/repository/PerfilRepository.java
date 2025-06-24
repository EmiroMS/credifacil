package com.credifacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credifacil.entity.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil,Long>{

}
