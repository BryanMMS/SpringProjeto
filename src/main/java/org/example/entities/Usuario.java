package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;


    @Column(length = 55, name = "NOME", nullable = false)
    private String nome;
    //---------------------------------------------------------
    @Column(length = 55, name = "IDADE", nullable = false)
    private String idade;
    //---------------------------------------------------------
    public Usuario() {
    }
    //---------------------------------------------------------
    //CONSTRUTOR COM ARGUMENTOS
    public Usuario(Long id, String nome, String idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    //---------------------------------------------------------
    //GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
