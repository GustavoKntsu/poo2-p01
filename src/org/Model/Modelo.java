package org.Model;

import java.util.Date;
import java.util.List;

public class Modelo {
    private long id;
    private String nome;
    private Date ano;
    private int qtModelo;
    private List<Veiculo> listVeiculo;
    //*******************
    //CONSTRUTORES

    public Modelo() {
        this.id = 0;
        this.nome = "";
        this.ano = null;
        this.qtModelo = 0;
        this.listVeiculo = null;
    }

    public Modelo(long id, String nome, Date ano, int qtModelo, List<Veiculo> listVeiculo) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.qtModelo = qtModelo;
        this.listVeiculo = listVeiculo;
    }
    //*******************************************

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getQtModelo() {
        return qtModelo;
    }

    public void setQtModelo(int qtModelo) {
        this.qtModelo = qtModelo;
    }

    public List<Veiculo> getListVeiculo() {
        return listVeiculo;
    }

    public void setListVeiculo(List<Veiculo> listVeiculo) {
        this.listVeiculo = listVeiculo;
    }
}

