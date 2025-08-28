package org.Model;

import java.util.Date;
import java.util.List;

public class Locacao {
    private long id;
    private Date dataRetirada;
    private Date dataDevolucao;
    private float valorLocacao;
    private List<Ocorrencia> listOcorrencias;
    private Veiculo veiculo;
    //****************************************
    //CONSTRUTORES
    public Locacao() {
        this.id = 0;
        this.dataRetirada = null;
        this.dataDevolucao = null;
        this.valorLocacao = 0;
        this.listOcorrencias = null;
        this.veiculo = null;
    }

    public Locacao(long id, Date dataRetirada, Date dataDevolucao, float valorLocacao, List<Ocorrencia> listOcorrencias, Veiculo veiculo) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.listOcorrencias = listOcorrencias;
        this.veiculo = veiculo;
    }
    //************************************************


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Ocorrencia> getListOcorrencias() {
        return listOcorrencias;
    }

    public void setListOcorrencias(List<Ocorrencia> listOcorrencias) {
        this.listOcorrencias = listOcorrencias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
