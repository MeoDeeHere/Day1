import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        float a = sc.nextFloat();
        System.out.print("nhap b: ");
        float b = sc.nextFloat();
        System.out.print("nhap c: ");
        float c = sc.nextFloat();
        if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) {
            System.out.println("a, b, c la 3 canh cua tam giac");
        }
        else {System.out.println("a, b, c khong la 3 canh cua tam giac");
        System.exit(0);}
        float cv = a + b + c;
        float p = cv/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Chu vi tam giac la: " + cv);
        System.out.println("Dien tich tam giac la: "+ s);
    }
}
