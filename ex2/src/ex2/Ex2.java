package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
          Scanner palavra = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String a = palavra.nextLine(); 

        PEGA pegar = new PEGA(a); 
        System.out.println("Olá, " + a + ", seja bem-vindo!");
    }

}
