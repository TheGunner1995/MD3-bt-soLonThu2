import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size: ");
        size = scanner.nextInt();
        int[] num= new int[size];
        for (int i = 0; i < num.length; i++) {
            num[i]= scanner.nextInt();
        }
       int max = num[0];
       int max1 = 0;
        for (int i = 0; i < num.length; i++) {
            if (max<num[i]){
                max1 = max;
                max = num[i];
//                num[i] =max1;

            }
        }
        System.out.println(max1);
    }
}