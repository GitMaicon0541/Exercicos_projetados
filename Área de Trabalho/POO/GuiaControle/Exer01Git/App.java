//package GuiaControle.Exer01Git;


public class App {

public static void main(String[] args) {
        System.out.println("Estou aqui!!!");

        int dividendo = 5;
        int divisor = 2;

int resto = Matematica.resto(dividendo, divisor);
System.out.println("=====================================================================");
        System.out.println(resto);// Deve imprimir : 1
System.out.println("=====================================================================");
        // assertiva:
        System.out.println(resto == 1); // Deve imprimir: true
        // mais assertivas: (devem imprimir true)
        System.out.println(Matematica.resto(10, 4) == 2);
        System.out.println(Matematica.resto(29, 5) == 4);
        // adicione mais 3 casos de teste na forma de prints e assertivas

        System.out.println("=====================================================================");
        System.out.println("============================ MEUS TESTES ============================");
        System.out.println("============================ MATEMATICA =============================");
        System.out.println(Matematica.resto(50, 2) == 0);
        System.out.println(resto);
        System.out.println(Matematica.resto(29, 3) == 2);
        System.out.println(resto);
        System.out.println(Matematica.resto(52, 6) == 4);
        System.out.println(resto);
        System.out.println("=====================================================================");


        String umaString = "tads"; // length = 4
        //                  0123 4 IndexOutOfBoundsException  
        //                  i
        int largura = 10;
        char umCaractere = '!'; // 6

        String resultado = Texto.pad(umaString, largura, umCaractere);
        System.out.println(resultado); // maicon##

        System.out.println("=====================================================================");
        //caso especial : length da string maior que a largura deixa inalterada
        System.out.println(Texto.pad("logica", 5, '*').equals("logica"));
        System.out.println(Texto.pad("logica", 5, '*').length() == 6);
        //string vazia, print:
        System.out.println("=====================================================================");
        System.out.println(Texto.pad("", 8, '#'));
        System.out.println(Texto.pad("", 8, '#').equals("########"));
        System.out.println("=====================================================================");
        //Adicione mais 3 casos de testes,
        //Um deles para o caso especial de largura negativa
        System.out.println("============================ MEUS TESTES ============================");
        System.out.println("============================ STRING =================================");
        
        System.out.println(Texto.pad("Maximo", 15, '%'));
        System.out.println(Texto.pad("Minimo", 13, '#'));
        System.out.println(Texto.pad("Negativa", -10, '#'));
        System.out.println("=====================================================================");
        System.out.println("================================ EXCEL ==============================");
        // ESSE É O ESBOÇO DO EXERCICIO 3 DO EXCEL .
        
        //CASOS DE TESTES EXCEL
        System.out.println(Excel.columnNumber("AB"));// 28
        
        //ASSERTIVA
        System.out.println(Excel.columnNumber("AB") == 28);//true
        System.out.println(Excel.columnNumber("A") == 1);//true
        System.out.println(Excel.columnNumber("C") == 3);//true
        System.out.println(Excel.columnNumber("Z") == 26);//true
        System.out.println(Excel.columnNumber("ZY") == 701);//true
        System.out.println(Excel.columnNumber("TADS") == 352319);//true
        System.out.println("=======================================================================");
        System.out.println("============================ MEUS TESTES ==============================");
        System.out.println(Excel.columnNumber("H") == 8);//true
        System.out.println(Excel.columnNumber("Y") == 25);//true
        System.out.println(Excel.columnNumber("AF") == 32);//true
        System.out.println("=======================================================================");
        System.out.println("===========================  CIFRA DE CEZAR   =========================");
        

        
        String t ="ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        Integer v = 10; //ARRUMAR POIS NAO PODE FICAR ASSIM ........
        char ascii;
        char x, y;

        System.out.println("=======================================================================");
        
        System.out.println("MENSAGEM: " + t);
        
        System.out.println("CHAVE: " + v);        
        while (v >= 65) {           
             v = v % 26;
        }
        System.out.println("=======================================================================");
        for (int i = 0; i < t.length(); i++) {
         //Tratamento Letras minusculas  
            if (t.charAt(i) >= 97 && t.charAt(i) <= 122) {//letras minusculas de acordo com a tabela ASCII
                if ((int) (t.charAt(i) + v) >= 122) {
                    x = (char) (t.charAt(i) + v);
                    y = (char) (x - 122);
                    ascii = (char) (97 + y);
                    System.out.printf(ascii + " ");
                } else {
                    ascii = (char) (t.charAt(i) + v);
                    System.out.printf(ascii + " ");

                }
            }
	//Tratamento Letras maiusculas
            if (t.charAt(i) >= 65 && t.charAt(i) <= 90) {
                if (t.charAt(i) - v > 90) {
                    x = (char) (t.charAt(i) - v);
                    y = (char) (x - 90);
                    ascii = (char) (65 - y);
                    System.out.printf(ascii + " ");
                } else {
                    ascii = (char) (t.charAt(i) - v);
                    System.out.printf(ascii + " ");
                }
            }
        }

        //System.out.println(ascii + " ");
        System.out.println();
        System.out.println("=======================================================================");
         
        
        
        }
}



