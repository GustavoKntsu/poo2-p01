package org.Model;

public class Ocorrencia {
    private long id;
    private Veiculo veiculo;
    private Cliente Cliente;
    private String local;
    private String descricao;
    private String status;
    private float custo;
    //*********************
    //CONSTRUTORES

    public Ocorrencia() {
        this.id = 0;
        this.veiculo = null;
        this.Cliente = null;
        this.local = "";
        this.descricao = "";
        this.status = "";
        this.custo = 0;
    }

    public Ocorrencia(long id, Veiculo veiculo, Cliente cliente, String local, String descricao, String status, float custo) {
        this.id = id;
        this.veiculo = veiculo;
        Cliente = cliente;
        this.local = local;
        this.descricao = descricao;
        this.status = status;
        this.custo = custo;
    }
    //*************************************


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
}
