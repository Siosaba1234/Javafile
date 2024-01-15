package lesson;

import java.util.Scanner;

public class Hairetu {
    static int[] clone0f(int[]a){
        int[] c = new int[a.length];
        for (int i=0; i < a.length; i++)
            c[i] = a[i];
        return c;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }
        int[] y =clone0f(x);

        System.out.println("配列ｘの複製ｙを作りました。");
        for (int i = 0; i < num; i++)
            System.out.println("y[" + i + "] = " + y[i]);
            
    }


}
