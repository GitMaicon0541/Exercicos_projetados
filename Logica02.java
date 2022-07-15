import java.io.IOException;
import java.util.Scanner;

/**
 * Logica02 - Exercicio 1 notas do aluno para calcular a média. 
 */
public class Logica02 {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

    double nota1,nota2,nota3,media;

    System.out.println("=================================================================");
    System.out.println("                            EXERCÍCIOS                           ");
    System.out.println("=================================================================");
    
    System.out.println("Informe a Nota 1 : ");
    nota1 = ent.nextDouble();
    System.out.println("Informe a Nota 2 : ");
    nota2 = ent.nextDouble();
    System.out.println("Informe a Nota 3 : ");
    nota3 = ent.nextDouble();
    
    media = (nota1+nota2+nota3)/3;
    
    System.out.println("=================================================================");
    System.out.printf("A Media do aluno foi de : %.2f\n",media);
    System.out.println("=================================================================");
    System.out.println("                            EXERCÍCIOS                           ");
    System.out.println("=================================================================");
    
    double comprimento,largura,area_retangulo;
    
    
    System.out.println("Informe a largura do retangulo : ");
    largura = ent.nextDouble();
    System.out.println("Informe o comprimento do retangulo : ");
    comprimento = ent.nextDouble();
    
    area_retangulo = largura*comprimento;
    
    System.out.println("=================================================================");
    System.out.printf("A area do retangulo foi de : %.2f\n",area_retangulo);
    System.out.println("=================================================================");
    System.out.println("                            EXERCÍCIOS                           ");
    System.out.println("=================================================================");
    
    int i;
    double base,alt,atri = 0;
    
    System.out.println("                    FORMACÃO DE TRIANGULOS                       ");
    for (i = 1; i <= 3; i++) {
        System.out.println("Informe o valor da Base "+i);
        base = ent.nextDouble();
        System.out.println("Informe o valor da Altura "+i);
        alt = ent.nextDouble();
        
        atri = (base*alt)/2;
    }   
    System.out.println("=================================================================");
    System.out.printf("A area do triangulo "+i+" foi de : %.2f\n",atri);
    System.out.println("=================================================================");
    System.out.println("                            EXERCÍCIOS                           ");
    System.out.println("=================================================================");
    
    int idade = 0;
    int cont = 1;
    int iM = 0;
    int iF = 0;
    int menorid = 150;
    int maiorid = 0;
    int M100 = 0;
    int geral = 0;
    int somam = 0;
    int mat = 0;
    String sexo,M,F;
    double salario = 0;
    double mediasalg = 0;
    double medias = 0;
    double mediager = 0;
    double totalid = 0;
    double somag = 0;
    
    System.out.println("=================================================================");
    System.out.println("Informe a contagem de pessoas  : ");
    cont = ent.nextInt();
    do {
        
        System.out.println("Informe a Idade : ");
        idade = ent.nextInt();
        if (idade > 0) {
            mediager += idade;
            totalid = mediager;
            
            if (idade == 1) {

            menorid = idade;
            maiorid = idade;
            
        } else if(idade < menorid){

            menorid = idade;
            
        } else if (idade > maiorid) {

            maiorid = idade;
            
        }
        
        System.out.println("Informe o Sexo [M/F] "+(mat+1)+" : ");
        sexo = ent.next();
        
        if (sexo == "M") {

            iM++;
            
        } else {
            
            iF++;
        }
        
        System.out.println("Informe o salario "+(mat+1)+" : ");
        salario = ent.nextDouble();
        
        if ((salario <= 100.00) && (sexo != "M")) {

            M100++;
        }

        } else {
            
            geral++;

        }

        somam = M100+geral;
        somag += salario;
        mediasalg = somag / cont;

        mat++;

        
        
    System.out.println("=================================================================");
    System.out.println("                           "+mat+"                              ");
    System.out.println("=================================================================");
        
    } while (mat != cont);
    
    System.out.println("=================================================================");
    System.out.printf("Media do salario do grupo foi de : %.2f\n",mediasalg);
    System.out.println("A Menor idade do grupo foi de : "+menorid);
    System.out.println("A Maior idade do grupo foi de : "+maiorid);
    System.out.println("Total de pesssoas com salarios até R$ 100,00 foi de "+M100);
    System.out.println("=================================================================");
    System.out.println("                              EXTRAS                             ");
    System.out.println("=================================================================");
    System.out.printf("Media geral do salario R$ %.2f\n",mediasalg);
    System.out.printf("Total de todas as idades : %.2f\n",totalid);
    System.out.println("Total de pessoas pesquisadas foi de : "+mat);
    System.out.println("=================================================================");
            
    
    
    }
}