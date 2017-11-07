package br.edu.unifil.lp1.abstrato.visao;
import br.edu.unifil.lp1.abstrato.controle.Controle;
import java.util.Scanner;
/**
 * @author Matheus Muriel
 * @version 07/11/2017
 */
public class Sistema
{
    //Clase Principal Instancia a classe Controle + menu para cadastro e consulta de Empregados
    public static void main(String args[]){
        Controle  ctr = new Controle();
        Scanner   teclado = new Scanner(System.in);
        String    nome;
        float     salario;
        float     comisao = 0;
        float     horasTrab = 0;
        int       quantVendas = 0;
        int       quantProd = 0;
        int       tipo;
        int       opcao = -1;
        while(opcao != 0){
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Cadastrar funcionario");
            System.out.println("2- Consultar funcionario");
            System.out.println("0- Sair");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();teclado.nextLine();
            System.out.println(); //Para separar na tela;
            switch(opcao){
                case 1 :
                    System.out.print("Nome: ");
                    nome = teclado.nextLine();
                    System.out.print("Salario: ");
                    salario = teclado.nextFloat();
                        System.out.println("Qual é o tipo do funcionario?");
                        System.out.println("1- Mensalista");
                        System.out.println("2- Comissionario");
                        System.out.println("3- Horista");
                        System.out.println("4- Produção");
                        System.out.print("Tipo: ");
                    tipo = teclado.nextInt();
                    switch(tipo){
                        case 1 : //Mensalista //Salario fixo
                                break; //Não precisa pegar mais nada
                        case 2 : //Comissionario //comisao + quantVendas
                                System.out.print("Comisão: ");
                                comisao = teclado.nextFloat();
                                System.out.print("Quantidade de vendas: ");
                                quantVendas = teclado.nextInt();
                                break;
                        case 3 : //Horista //horasTrab
                                System.out.print("Horas trabalhadas: ");
                                horasTrab = teclado.nextFloat();
                                break;
                        case 4 : //Produção //quantProd
                                System.out.print("Quantidade produzida: ");
                                quantProd = teclado.nextInt();
                                break;
                    }
                    ctr.addEmp(nome, salario, tipo, comisao, quantVendas, horasTrab, quantProd);
                    System.out.println(" \n "); //Para separar na tela;
                    break;
                case 2 :
                    System.out.println(ctr.listarEmp());
                    System.out.print(" \n "); //Para separar na tela
                    break;
            }
        }
    }
}
