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
    	int num;
    	Scanner sc = new Scanner(System.in);
    	do {
    	    	num = sc.nextInt();	
    	} while (num < 100 && !es_primo(num));
    	sc.close();
    }
}