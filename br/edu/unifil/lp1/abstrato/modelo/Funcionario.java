package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Funcionario extends Pessoa
{
    private float salario;

    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public abstract float getGanhoMensal();
    
}

