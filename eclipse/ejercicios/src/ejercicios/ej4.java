package ejercicios;
import  java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		char c = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int a = 0,b = 0;
		int op = 0;
		int res = 0;
		while (i < 3) {
		c = sc.next().charAt(0);
		if((c >= '0' && c <= '9') && (i == 0 || i == 2)){
			if(i == 0) a = c - 48;
			else b = c - 48;
			i++;
		} else if ((((c == '+' || c == '-') || c == '*') || c == '/') && i == 1){
			switch (c) {
				case '+':
					op = 1;
					break;
				case '-':
					op = 2;
					break;
				case '*':
					op = 3;
					break;
				case '/':
					op = 4;
					break;
			}
			i++;
		} 
		}
		sc.close();
		switch (op) {
			case 1:
				res = a + b;
				break;
			case 2:
				res = a - b;
				break;
			case 3:
				res = a * b;
				break;
			case 4:
				res = a / b;
				break;
		}
		System.out.println(res);
	}

}
