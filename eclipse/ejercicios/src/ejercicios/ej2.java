package ejercicios;

public class ej2 {
    public static void main(String[] args) {
        int divisores = 0;
        for(int i = 50;i <= 100;i++){
            System.out.printf("%d ",i);
            for (int j = 2; j<i;j++){
                if(i % j == 0){
                    System.out.printf("%d ", j);
                    divisores++;
                }
            }
            if(divisores == 0) System.out.printf("Es primo");
            divisores = 0;
            System.out.printf("\n");
        }
    }
}
