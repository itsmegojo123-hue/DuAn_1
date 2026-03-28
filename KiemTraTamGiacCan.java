
package Bai_TH3;

import java.util.Scanner;
public class KiemTraTamGiacCan {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap 3 canh a, b, c: ");

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if((a+b >c) && (a+c >b) && (b+c > a)){
            if(a==b || b==c || a==c){
                if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a))
                    System.out.println("-> Day la tam giac vuong can");
                else
                    System.out.println("-> Day la tam giac can");
            }
        }
        else
            System.out.println("-> Khong the tao thanh tam giac");
    }
}
