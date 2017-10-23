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

    public void addEmp(String nome, float salario, String tipoEmp){
          Funcionario emp = null;
          this.listEmp[ numMatricula++ ] = emp;
    }

    public String listarEmp(){
        for(int i = 0; i < listEmp.length; i++) {
          System.out.print("Funcionario: " + listEmp[i].getNome());
        }
        return null;
    }

    public String convertTipo(int tipo){
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
      return tipoEmp;
    }
}
