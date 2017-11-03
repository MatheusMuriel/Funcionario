package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Funcionario extends Pessoa
{
    protected float   salario;
    protected String  descricao;
    protected int     tipo;
    protected String  tipoEmp;

    public Funcionario (String n, float salario, int tipo){
        super(n);
        setSalario(salario);
        //getDescricao();
        //setTipo(tipoEmp);
        setNome(nome);
    }

    public void setNome(String nome){
            this.nome = nome;
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
      String tipoEmp =(" ");
      //Vai converter o numero em uma String com o tipo
      if (tipo == 1) {
        tipoEmp += ("Mensalista");
      }else if (tipo == 2) {
        tipoEmp += ("Comissionado");
      }else if (tipo == 3) {
        tipoEmp += ("Horista");
      }else if (tipo == 4) {
        tipoEmp += ("Producao");
      }
      this.tipoEmp = tipoEmp;
    }

    public abstract float getGanhoMensal();

}
