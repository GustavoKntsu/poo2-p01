package org.Model;

public class Contato {
    private long id;
    private String email;
    private String Telefone;
    private String celular;
    //********************************
    //CONSTRUTORES

    public Contato() {
        this.id = 0;
        this.email = "";
        this.Telefone = "";
        this.celular = "";
    }

    public Contato(long id, String email, String telefone, String celular) {
        this.id = id;
        this.email = email;
        Telefone = telefone;
        this.celular = celular;
    }
    //***************************************


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
