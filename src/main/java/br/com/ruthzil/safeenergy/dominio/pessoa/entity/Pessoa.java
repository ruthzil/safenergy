package br.com.ruthzil.safeenergy.dominio.pessoa.entity;

import br.com.ruthzil.safeenergy.dominio.endereco.entity.Endereco;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {

    private Long Id;
    private String nome;
    private String sobrenome;
    private LocalDate dtNascimento;
    private String sexo;
    private String parentesco;
    public Pessoa(){

    }

    public Pessoa(Long id, String nome, String sobrenome, LocalDate dtNascimento, String sexo, String parentesco, Set<Endereco> enderecos) {
        Id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.parentesco = parentesco;
        this.enderecos = enderecos;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    @OneToMany(mappedBy = "pessoa")
    private Set<Endereco> enderecos = new HashSet<>();

}
