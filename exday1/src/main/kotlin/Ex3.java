import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  dien = 0, nuoc = 0, thanhtien = 0;
        System.out.print("nhap so dien thang truoc: ");
        int a = sc.nextInt();
        System.out.print("nhap so dien thang nay: ");
        int b = sc.nextInt();
        System.out.print("nhap so nuoc thang truoc: ");
        int c = sc.nextInt();
        System.out.print("nhap so nuoc thang nay: ");
        int d= sc.nextInt();
        if (a > b || a < 0 || b <0 ) {
            System.out.println("Nhap sai so dien");
        }
        else dien = b-a;
        if (c > d || c < 0 || d <0 ) {
            System.out.println("Nhap sai so nuoc");
        }
        else nuoc = d-c;
        thanhtien = 1800 + 4* dien + 30* nuoc + 60 + 20;
        System.out.println("Tien phong thang nay: " + thanhtien);
    }
}
