package br.edu.unifil.lp1.abstrato.controle;
import br.edu.unifil.lp1.abstrato.modelo.*;
/**
 * @author Matheus Muriel
 * @version 08/11/2017
 */
public class Controle
{
    private int numMatricula = 0;
    private Funcionario[] listEmp = new Funcionario[100];
    public void addEmp(String nome, float salario, int tipo, float comisao, int quantVendas, float horasTrab, int quantProd){
        Funcionario emp = null;
        if(tipo == 1){
            emp = new Mensalista(nome, salario, tipo, comisao, quantVendas, horasTrab, quantProd);
        }else if(tipo == 2){
            emp = new Comissionado(nome, salario, tipo, comisao, quantVendas, horasTrab, quantProd);
        }else if(tipo == 3){
            emp = new Horista(nome, salario, tipo, comisao, quantVendas, horasTrab, quantProd);
        }else if(tipo == 4){
            emp = new Producao(nome, salario, tipo, comisao, quantVendas, horasTrab, quantProd);
        }
        emp.setTipo(tipo);
        this.listEmp[ numMatricula++ ] = emp;
    }

    public String listarEmp(){
        String saida = ("");
        for(int i = 0; i < listEmp.length; i++) {
            if (listEmp[i] == null);
            else{
                saida += "Funcionario: " + listEmp[i].getNome() + " || " +
                "Ganho: "       + listEmp[i].getGanhoMensal() + "\n";
            }
        }
        return saida;
    }
}
