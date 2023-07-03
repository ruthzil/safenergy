package br.com.ruthzil.safeenergy.dominio.pessoa.entity;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Pessoa {

    private Long Id;
    private String nome;
    private LocalDate dtNascimento;
    private String sexo;
    private String parentesco;

    public Pessoa(){


    }

    public Pessoa(Long id, String nome, LocalDate dtNascimento, String sexo, String parentesco) {
        Id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.parentesco = parentesco;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
