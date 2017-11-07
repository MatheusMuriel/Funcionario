package br.edu.unifil.lp1.abstrato.modelo;

public class Horista extends Funcionario
{
    private float horasTrab;

    public Horista(String n, float salario, int tipo, float comisao, int quantVendas, float horasTrab, int quantProd){
        super(n, salario, tipo);
        setHorasTrab(horasTrab);
    }

    public float getHorasTrab(){
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab){
        this.horasTrab = horasTrab;
    }

    public float getGanhoMensal(){
        return super.getSalario() * horasTrab;
    }
}
