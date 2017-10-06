package br.edu.unifil.lp1.abstrato.modelo;

public class Producao extends Funcionario
{
    private int quantProd;

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
