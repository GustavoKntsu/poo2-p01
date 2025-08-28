package org.Model;

import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float valorCaucao;
    private Enum Status;
    private List<Locacao> listLocacoes;
    private float valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;
    //*****************************
    //CONSTRUTORES
    public ContratoLocacao() {
        this.id = 0;
        this.dataContrato = null;
        this.valorCaucao = 0;
        this.Status = null;
        this.listLocacoes = null;
        this.valorTotal = 0;
        this.funcionario = null;
        this.cliente = null;
    }

    public ContratoLocacao(long id, Date dataContrato, float valorCaucao, Enum status, List<Locacao> listLocacoes, float valorTotal, Funcionario funcionario, Cliente cliente) {
        this.id = id;
        this.dataContrato = dataContrato;
        this.valorCaucao = valorCaucao;
        Status = status;
        this.listLocacoes = listLocacoes;
        this.valorTotal = valorTotal;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    //*****************************************************


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public float getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(float valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public Enum getStatus() {
        return Status;
    }

    public void setStatus(Enum status) {
        Status = status;
    }

    public List<Locacao> getListLocacoes() {
        return listLocacoes;
    }

    public void setListLocacoes(List<Locacao> listLocacoes) {
        this.listLocacoes = listLocacoes;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
