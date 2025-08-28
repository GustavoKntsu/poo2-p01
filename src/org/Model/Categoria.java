package org.Model;

import java.util.List;

public class Categoria {
    private long id;
    private String nome;
    private float valorLocacao;
    private List<Modelo> listModelos;
    //*******************
    //CONSTRUTORES
    public Categoria() {
        this.id = 0;
        this.nome = "";
        this.valorLocacao = 0;
        this.listModelos = null;
    }

    public Categoria(long id, String nome, float valorLocacao, List<Modelo> listModelos) {
        this.id = id;
        this.nome = nome;
        this.valorLocacao = valorLocacao;
        this.listModelos = listModelos;
    }
    //*************************************************


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

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Modelo> getListModelos() {
        return listModelos;
    }

    public void setListModelos(List<Modelo> listModelos) {
        this.listModelos = listModelos;
    }
}
