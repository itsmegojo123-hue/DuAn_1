
package tamgiac;

import java.util.Scanner;
public class KiemTraTamGiacCan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("- Nhap 3 canh a, b, c: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        
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
