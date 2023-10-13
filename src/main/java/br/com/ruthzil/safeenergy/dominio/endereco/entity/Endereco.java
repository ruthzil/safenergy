package br.com.ruthzil.safeenergy.dominio.endereco.entity;

import br.com.ruthzil.safeenergy.dominio.endereco.dto.EnderecoDTO;
import br.com.ruthzil.safeenergy.dominio.endereco.dto.EnderecoPessoaDTO;
import br.com.ruthzil.safeenergy.dominio.pessoa.entity.Pessoa;
import jakarta.persistence.*;

@Table(name="tb_endereco")
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    public Endereco() {}

    public Endereco(
            Long id,
            String rua,
            String cidade,
            String estado,
            String cep) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereco(EnderecoDTO dto) {
        this.id = dto.id();
        this.rua = dto.rua();
        this.cidade = dto.cidade();
        this.estado = dto.estado();
        this.cep = dto.cep();
    }

    public Endereco(EnderecoPessoaDTO dto, Pessoa pessoa) {
        this.id = dto.id();
        this.rua = dto.rua();
        this.cidade = dto.cidade();
        this.estado = dto.estado();
        this.cep = dto.cep();
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
