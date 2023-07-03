package br.com.ruthzil.safeenergy.dominio.dispositivo.entity;

public class Dispositivo {

    private Long Id;
    private String nomedodispositivo;
    private String modelo;
    private String potencia;

    public Dispositivo() {


    }

    public Dispositivo(Long id, String nomedodispositivo, String modelo, String potencia) {
        Id = id;
        this.nomedodispositivo = nomedodispositivo;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNomedodispositivo() {
        return nomedodispositivo;
    }

    public void setNomedodispositivo(String nomedodispositivo) {
        this.nomedodispositivo = nomedodispositivo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
