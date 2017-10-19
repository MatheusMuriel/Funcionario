package br.edu.unifil.lp1.abstrato.modelo;

public class Mensalista extends Funcionario
{
    public Mensalista(String n, float salario, int tipo){
        super(n, salario, tipo);
    }

    public float getGanhoMensal(){
        return super.getSalario();
    }
}
