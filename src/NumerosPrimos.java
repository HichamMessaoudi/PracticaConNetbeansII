 // @author hicham

public class NumerosPrimos {

    public static void main(String[] args) {
        int[] array = {1, 7, 8, 35, 22, 6, 2};
        int n, i, cnp = 0, res;
        
        for (i = 0; i < 7; i++) {
            res = 0;
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) {
                    res++;
                }
            }
        if (res == 2) {
                cnp++;
                System.out.println("numero primo =" + array[i]);
            }    
        }
        System.out.println("La cantidad de numeros primos es :" + cnp);
        System.out.println("La cantidad de numeros primos es :" + cnp);
    }

}
