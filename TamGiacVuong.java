package tamgiac;

import java.util.Scanner;

public class TamGiacVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("- Nhap 3 canh a, b, c: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Day la tam giac");
        } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            System.out.println("-> Tam giac vuong");
        } else {
            System.out.println("Day khong phai la tam giac");
        }

        sc.close();
    }
}
