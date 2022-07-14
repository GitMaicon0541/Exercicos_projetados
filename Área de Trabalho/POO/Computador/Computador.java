package Computador;

class Computador {
    String modelo;
    String cor;
    String memoria;
    int bits;
    boolean ligado;
    boolean funcionar;

    void status(){
System.out.println("=====================================================================");
System.out.println("O MODELO DO COMPUTADOR = " + this.modelo);
System.out.println("A COR DO COMPUTADOR = " + this.cor);
System.out.println("MEMORIA DO COMPUTADOR = " + this.memoria);
System.out.println("QUANTOS BITS POSSUI O COMPUTADOR = " + this.bits);
System.out.println("O COMPUTADOR ESTA LIGADO = " + this.ligado);
System.out.println("=====================================================================");
}

void ligar(){
    if(ligado == true) {
        System.out.println("DOCUMENTO SENDO DIGITADO");
    }else{
        System.out.println("VOCE NAO PODE DIGITAR O DOCUMENTO");
    }
System.out.println("=====================================================================");
    }

    
}