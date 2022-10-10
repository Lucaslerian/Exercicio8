import java.util.Scanner;

public class App {
    public static void main (String [] args){
        // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
            Scanner sc = new Scanner(System.in);
            //Perguntar quanto você ganha por hora
            System.out.println("Digite o valor da sua hora de trabalho: ");
            int valor_hora = sc.nextInt();
            System.out.print("");
            // Perguntar quantas horas você trabalhou no mês
            System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
            int horas_mes = sc.nextInt();
            sc.close();
    
            // calcular o valor do salário
            int salario_mes = valor_hora * horas_mes;
            System.out.println("Valor do seu salário no mês é " + salario_mes);
        }
    }
    