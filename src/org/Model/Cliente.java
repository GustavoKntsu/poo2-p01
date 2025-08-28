package org.Model;

public class Cliente {
    private long id;
    private String cnh;
    //*******************
    //CONSTRUTORES
    public Cliente() {
        this.id = 0;
        this.cnh = "";
    }

    public Cliente(long ind, String cnh) {
        this.id = ind;
        this.cnh = cnh;
    }
    //***************************


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
