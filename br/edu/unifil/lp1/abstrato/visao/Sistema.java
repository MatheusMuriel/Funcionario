package br.edu.unifil.lp1.abstrato.visao;
import br.edu.unifil.lp1.abstrato.controle.Controle;
import java.util.Scanner;
/**
 * @author Matheus Muriel
 * @version 18/10/2017
 */
public class Sistema
{
    //Clase Principal Instancia a classe Controle + menu para cadastro e consulta de Empregados

    public static void main(String args[]){
        Controle ctr = new Controle();
        Scanner teclado = new Scanner(System.in);
        String  nome;
        String  tipoEmp = (" ");
        float   salario;
        int     tipo;
        int opcao = 0;
        while(opcao != 10){
            System.out.println("Escolha uma opçao: ");
            System.out.println("1- Cadastrar funcionario");
            System.out.println("2- Consultar funcionario");
            System.out.println("3- Trabalho do mes");
            opcao = teclado.nextInt();
            switch(opcao){
                case 1 :
                    System.out.print("Nome: ");
                    nome = teclado.nextLine();teclado.nextLine();
                    System.out.print("Salario: ");
                    salario = teclado.nextFloat();
                    System.out.println("Tipo: ");
                        System.out.println("1- Mensalista");
                        System.out.println("2- Comissionario");
                        System.out.println("3- Horista");
                        System.out.println("4- Produção");
                    tipo = teclado.nextInt();
                    //ctr.convertTipo(tipo);
                    ctr.addEmp(nome, salario, tipo);
                    System.out.println(" \n "); //Para separar na tela;
                    break;

                case 2 :
                    ctr.listarEmp();
                    System.out.print(" \n "); //Para separar na tela
                    break; //ta parando dps daq
            }
        }
    }
}
