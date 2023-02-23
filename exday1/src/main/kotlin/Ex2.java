import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        float a = sc.nextFloat();
        System.out.print("nhap chieu rong: ");
        float b = sc.nextFloat();

        if (a>0 && b>0 ) {
            float c = (a+b) *2;
            float s = a*b;
            System.out.printf("Chu vi cua tam giac: %.2f || Dien tich cua tam giac: %.2f",c,s);
        }
        else {System.out.println("a, b khong la canh cua hinh chu nhat");
            System.exit(0);}

    }
}
