package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 55, name = "NOME", nullable = false)
    private String nome;

    @Column(length = 55, name = "CPFCNPJ", nullable = false)
    private String cpfcnpj;

    @Column( name = "DATANASCIMENTO", nullable = false)
    private LocalDate datanascimento;

    @Column(length = 55, name = "FORMAPAGAMENTO", nullable = false)
    private String formapagamento;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpfcnpj, LocalDate datanascimento, String formapagamento) {
        this.id = id;
        this.nome = nome;
        this.cpfcnpj = cpfcnpj;
        this.datanascimento = datanascimento;
        this.formapagamento = formapagamento;
    }

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

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }
}
