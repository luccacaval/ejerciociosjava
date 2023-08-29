package ejercicios;

public class ej5 {
    public static void main(String[] args) {
        int nums[] = {1,5,9,12,4,5};
        // Por cada num (tipo int) dentro del iterable nums
        for (int num : nums)  // Equibalente a "for(int i = 0; i < nums.length)"
        {
            // Imprimir el numero
            System.out.println(num);
        }
    }
}
