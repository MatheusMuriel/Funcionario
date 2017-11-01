package br.edu.unifil.lp1.abstrato.controle;
import br.edu.unifil.lp1.abstrato.modelo.*;
/**
 * @author Matheus Muriel
 * @version 18/10/2017
 */
public class Controle
{
    //Atributo privado listaEMp com array estatico ou array list
    //Metodo que cadastra listaEmp todos os funcionarios....Vai ser todos juntos
    //Metodo para retornar uma String com o nome eo salario do funcionario
    private int numMatricula = 0;
    private Funcionario[] listEmp = new Funcionario[100];

    public void addEmp(String nome, float salario, int tipo){
          Funcionario emp = null;
            if(tipo == 1{
                    emp = new Mensalista(nome, salario, tipo);
            }else if(tipo == 2){
                    emp = new Comissionado(nome, salario, tipo);
            }else if(tipo == 3){
                    emp = new Horista(nome, salario, tipo);
            }else if(tipo == 4){
                    emp = new Producao(nome, salario, tipo);
        }
          emp.setNome(nome);
          emp.setSalario(salario);
          emp.setTipo(tipo);
          this.listEmp[ numMatricula++ ] = emp;
    }

    public String listarEmp(){
      for(int i = 0; i < listEmp.length; i++) {
        if (listEmp[i] == null);
        else{
          System.out.print("Funcionario: " + listEmp[i].getNome());
        }
      }
      return null;
    }


}
