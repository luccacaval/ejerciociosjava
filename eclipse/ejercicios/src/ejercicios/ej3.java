package ejercicios;
import  java.util.Scanner;
public class ej3 {
    static boolean es_primo(int num){
        for(int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 4;
        while (num < 100 && !es_primo(num)){
            try (Scanner scn = new Scanner(System.in)) {
                num = scn.nextInt();
            }
            
        }
    }
}