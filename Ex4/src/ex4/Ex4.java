
package ex4;


public class Ex4 {

   
    public static void main(String[] args) {
        metodo frase = new metodo("Esta é uma frase de exemplo para exercício");
        int num = frase.a.length();
        System.out.println(num);
        String palavrona = frase.a.toUpperCase();
        System.out.println(palavrona);
        String palavrinha = frase.a.toLowerCase();
        System.out.println(palavrinha);
        String parte = frase.a.substring(7,27);
         System.out.println(parte);
    }
    
}
