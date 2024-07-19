package br.com.phmiranda.microsservico.basico.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "usuarios")
public class Usuario {

    @Id
    private Integer id;
    private String nome;
    private String documento;
    private Date dataNascimento;
    private String sexo;
}
