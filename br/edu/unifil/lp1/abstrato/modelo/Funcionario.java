package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Funcionario extends Pessoa
{
    private float   salario;
    private String  descricao;
    private int     tipo;

    public Funcionario (String n, float salario, int tipo){
        super(n);
        setSalario(salario);
        getDescricao();
        setTipo(tipo);

    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getTipo(){
      return tipo;
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public abstract float getGanhoMensal();

}
