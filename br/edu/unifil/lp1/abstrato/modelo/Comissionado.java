package br.edu.unifil.lp1.abstrato.modelo;

public class Comissionado extends Funcionario
{
    private float comisao;
    private float quantVendas;

    public Comissionado(String n, float salario, int tipo, float comisao, int quantVendas, float horasTrab, int quantProd){
        super(n, salario, tipo);
    }

    public float getComisao(){
        return comisao;
    }

    public void setComisao(float comisao){
        this.comisao = comisao;
    }

    public float getQuantVendas(){
        return quantVendas;
    }

    public void setQuantVendas(float quantVendas){
        this.quantVendas = quantVendas;
    }

    public float getGanhoMensal(){
        return super.getSalario() + comisao * quantVendas;
    }
}
