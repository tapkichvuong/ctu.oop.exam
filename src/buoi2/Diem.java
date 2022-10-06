package buoi2;

import java.util.Scanner;
import java.lang.Math;

public class Diem {
    private int x, y;

    public Diem() {
        x = 0;
        y = 0;
    }

    public Diem(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public void nhapDiem() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap hoanh do x:");
            x = sc.nextInt();
            System.out.println("Nhap tung do y:");
            y = sc.nextInt();
        }
    }

    public void hienThi() {
        System.out.println("(" + x + "; " + y + ")");
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public float khoangCach() {
        float kq = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return kq;
    }
    public float khoangCach(Diem B) {
        float kq = (float) Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2));
        return kq;
    }

    public int giatriX(){
        return x;
    }
    public int giatriY(){
        return y;
    }
}