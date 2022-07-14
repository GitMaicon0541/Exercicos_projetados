import java.io.IOException;
import java.util.Scanner;

/**
 * Logica01 - Esse exercicio calcula para o usuário sua idade através da data atual.
 */
public class Logica01 {


    public static void main(String[] args) {

    System.out.println("=================================================================");
    System.out.println("                           EXERCICIOS                            ");
    System.out.println("=================================================================");
    Scanner ent = new Scanner(System.in);
    
    int ano_atual, ano_nasc, idade;
    
    System.out.println("=================================================================");
    System.out.println("Informe o Ano atual : ");
    ano_atual = ent.nextInt();
    System.out.println("Informe o Ano de Nascimento : ");
    ano_nasc = ent.nextInt();
    
    idade = ano_atual - ano_nasc;
    
    System.out.println("=================================================================");
    
    System.out.println("A sua Idade sera de : "+idade+" ANOS");
    
    System.out.println("=================================================================");
    System.out.println("                           EXERCICIOS                            ");
    System.out.println("=================================================================");
    /**
     * Logica01 - Esse exercicio informa o maior valor inteiro digitado.
     */
    int A,B;
    
    System.out.println("Informe o valor de A : ");
    A = ent.nextInt();
    System.out.println("Informe o valor de B : ");
    B = ent.nextInt();
    
    System.out.println("=================================================================");
    if (A > B) {
        System.out.println("O MAIOR FOI A "+ A);
    } else {
        System.out.println("O MAIOR FOI B "+ B);
    }
    System.out.println("=================================================================");
    System.out.println("=================================================================");
    System.out.println("                           EXERCICIOS                            ");
    System.out.println("=================================================================");
    /**
     * Logica01 - Esse exercicio informa o menor valor double digitado.
     */
    Double X,Y;
    
    System.out.println("Informe o valor de X : ");
    X = ent.nextDouble();
    System.out.println("Informe o valor de Y : ");
    Y = ent.nextDouble();
    
    System.out.println("=================================================================");
    if (X < Y) {
        System.out.println("O MENOR FOI X "+ X);
    } else {
        System.out.println("O MENOR FOI Y "+ Y);
    }
    System.out.println("=================================================================");
    System.out.println("                           EXERCICIOS                            ");
    System.out.println("=================================================================");
    /**
     * Logica01 - Esse exercicio informa o valor da hora trabalhada especificando salaio mensal.
     */
    
    Double salario_total,horas_dia,valor_hora;
    
    System.out.println("=================================================================");
    
    System.out.println("Informe o Salario total : ");
    salario_total = ent.nextDouble();
    System.out.println("Informe o numero de horas trabalahada no dia : ");
    horas_dia = ent.nextDouble();
    
    valor_hora = (salario_total/30)/horas_dia;

    System.out.println("=================================================================");
    
    System.out.printf("Valor da hora trabalhada por dia e de : %.2f\n", valor_hora);
    
    System.out.println("=================================================================");
    System.out.println("                           EXERCICIOS                            ");
    System.out.println("=================================================================");
    /**
     * Logica01 - Esse exercicio informa a conversão da temperatura de farenheit para celsius.
     */
    
    Double farenheit,celsius;
    
    System.out.println("Informe a temperatura em Farenheit : ");
    farenheit = ent.nextDouble();
    
    celsius = (5*(farenheit-32)/9);
    System.out.println("=================================================================");
    
    System.out.printf("A temperatura em Celsius e de : %.2f\n", celsius);
    
    System.out.println("=================================================================");
    /**
     * Logica01 - Esse exercicio informa a conversão de celsius para farenheit.
     */
    
    System.out.println("Informe a temperatura em Celsius : ");
    celsius = ent.nextDouble();
    
    farenheit = (1.8*celsius)+32;
    
    System.out.println("=================================================================");
    
    System.out.printf("A temperatura em Farenheit e de : %.2f\n", farenheit);
    
    System.out.println("=================================================================");

    }

}