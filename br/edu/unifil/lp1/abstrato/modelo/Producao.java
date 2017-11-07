package br.edu.unifil.lp1.abstrato.modelo;

public class Producao extends Funcionario
{
    private int quantProd;

    public Producao(String n, float salario, int tipo, float comisao, int quantVendas, float horasTrab, int quantProd){
        super(n, salario, tipo);
        setQuantProd(quantProd);
    }

    public int getQuantProd(){
        return quantProd;
    }

    public void setQuantProd(int quantProd){
        this.quantProd = quantProd;
        
    }

    public float getGanhoMensal(){
        //System.out.println("Getganhoprod" + super.getSalario() + "\n" + getQuantProd());
        return super.getSalario() * quantProd;
        
    }
}
