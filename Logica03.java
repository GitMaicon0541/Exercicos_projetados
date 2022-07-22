import java.lang.ref.Cleaner;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * Logica03
 */
public class Logica03 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        int valor,poss=0,t=0,media=0,soma=0,cont=1;
        
    System.out.println("=================================================================");
    System.out.println("                            EXERCICIO                            ");
    System.out.println("=================================================================");
    
    while(cont<=2){
        System.out.println("Informe o Valor : "+cont);
        valor = ent.nextInt();
        
        if(valor<0){
            t++;
            
            soma += valor;
            media = soma / t;
            
        }else{
            System.out.println("Valor "+cont+" foi de : "+ valor);
        }
        cont++;

    System.out.println("=================================================================");
    }
    System.out.println("=================================================================");
    System.out.println("A media dos valores negativos foi de : "+media);
    System.out.println("=================================================================");
    System.out.println("                            EXERCICIO                            ");
    System.out.println("=================================================================");
    
    String cor_olho,sexo,M,F,azul,verde,castanho,louro,casstanho,preto,cor_cabelo;
    int idade,maiorid =0,menorid=150,i=0,contt=0,pos=0,contagem=1;
    
    System.out.println("=================================================================");
    System.out.println("Informe a contagem : ");
    contagem = ent.nextInt();
    do{
        System.out.println("=================================================================");
        System.out.println("Informe a idade da pessoa "+contt+" : ");
        idade = ent.nextInt();

        if (idade>0) {
            if (idade==1) {
                menorid = idade;
                maiorid = idade;
                
            }else if (idade < menorid) {
                menorid = idade;
                
            }else if (idade>maiorid) {
                maiorid = idade;
                
            }

            System.out.println("Informe o sexo da pessoa [M/F] "+contt+" : ");
            sexo = ent.next();
            System.out.println("Informe a cor dos olhos dessa pessoa : [verde,azul,castanho] "+contt+" : ");
            cor_olho = ent.next();
            System.out.println("Informe a cor do cabelo [louro,casstanho,preto] "+contt+" : ");
            cor_cabelo = ent.next();
            if((idade>=18) && (idade<=35) && sexo.equals("F") && cor_olho.equals("verde") && (cor_cabelo.equals("louro"))){
                pos++;
            }
            contt = contt+1;
        }else{
            
        }
        
        contagem = contagem - 1;
        //pos = pos - 1;
    }while(contagem > 0);
    System.out.println("=================================================================");
    System.out.println("A Maior idade dos Habitantes entrevistados foi de : "+maiorid);
    System.out.println("A Menor idade dos Habitantes entrevistados foi de : "+menorid);
    System.out.println("A quantidade de mulheres entre 18 e 35 anos e olhos verdes e cabelo louro foi de : "+pos);
    System.out.println("O total de pessoas entrevistadas : "+contt);
    System.out.println("=================================================================");
    System.out.println("                            EXERCICIO                            ");
    System.out.println("=================================================================");
    
    double medidas_ret, custo_const, valor_mtr_quad;
    
    System.out.println("=================================================================");
    
    System.out.println("Informe a medida do terreno para construir : ");
    medidas_ret = ent.nextDouble();

    System.out.println("Informe o valor do metro quadrado para construir : ");
    valor_mtr_quad = ent.nextDouble();
    
    System.out.println("=================================================================");
    
    custo_const = medidas_ret * valor_mtr_quad * 100;
    
    System.out.printf("O custo para construir nesse terreno sera de R$ : %.2f\n",custo_const);

    System.out.println("=================================================================");

    

    }
}