import java.util.ArrayList;

/**
 * Created by chris on 2017-08-29.
 */
public class Functions {

    private int[][] array;

    public void printPascal(int n) {
        if(array == null){
            array = new int[n+1][n+1];
        }

        boolean flip = true;
        if (n < 0) {
            return;
        }

        else {
            if (flip == false) {
                for (int i = 0; i <= n; i++) {
                    System.out.print(binom(n, i) + " ");
                }
                System.out.println();
                n--;
                printPascal(n);
            }
            else{
                for (int i = 0; i < n; i++) {
                    for(int k = 0; k <= i; k++){
                        System.out.print(binom(i, k) + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public int binom(int n, int k){
        if (k == 0) {
            if(array[n][k] == 0) {
                array[n][k] = 1;
                return 1;
            }
            else
                return array[n][k];
        }
        else if (k == n) {
            if(array[n][k] == 0) {
                array[n][k] = 1;
                return 1;
            }
            else
                return array[n][k];
        }
        else{
            if(array[n][k] == 0) {
                array[n][k] = (binom((n - 1), (k - 1)) + binom((n - 1), k));
                return array[n][k];
            }
            else
                return array[n][k];
        }
    }
}
