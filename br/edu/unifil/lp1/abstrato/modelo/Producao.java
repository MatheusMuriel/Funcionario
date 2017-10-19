package br.edu.unifil.lp1.abstrato.modelo;

public class Producao extends Funcionario
{
    private int quantProd;

    public Producao(String n, float salario, int tipo){
        super(n, salario, tipo);
    }

    public int getQuantProd(){
        return quantProd;
    }

    public void setQuantProd(int quantProd){
        this.quantProd = quantProd;
    }

    public float getGanhoMensal(){
        return super.getSalario() * quantProd;
    }
}
