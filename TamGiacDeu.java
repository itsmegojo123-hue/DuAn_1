
package Application;
import java.util.*;
public class TamGiacDeu {
    public static void main(String[] args) {
    int a,b,c;
     System.out.print("- Nhap 3 canh a, b, c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
if((a+b >c) && (a+c >b) && (b+c > a)){
            if(a==b && b==c)
                System.out.println("-> Tam giac deu");
}
}
}
