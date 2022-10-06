package buoi2;

import java.util.Scanner;

public class Date {
    private int day, month, year;

    public Date() {
        day = 1;
        month = 1;
        year = 1;
    }

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public Date(Date a) {
        day = a.day;
        month = a.month;
        year = a.year;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ngay: ");
        day = sc.nextInt();
        System.out.print("thang: ");
        month = sc.nextInt();
        System.out.print("nam: ");
        year = sc.nextInt();
    }

    public void hienthi() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean hopLe() {
        int[] numD = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            numD[2] = 29;
        }
        if (year < 1)
            return false;
        if (month > 13 || month < 1)
            return false;
        if (day < 1 || day > numD[month])
            return false;
        return true;
    }

    public Date ngayHomSau() {
        Date tomorrow = new Date(day, month, year);
        tomorrow.day++;
        if (!tomorrow.hopLe()) {
            tomorrow.day = 1;
            tomorrow.month++;
        }
        if (!tomorrow.hopLe()) {
            tomorrow.month = 1;
            tomorrow.year++;
        }
        return tomorrow;
    }

    public Date congNgay(int n) {
        Date x = new Date(day, month, year);
        for (int i = 0; i < n; i++) {
            x = x.ngayHomSau();
        }
        return x;
    }

    public static void main(String[] args) {
        Date a = new Date(15, 6, 2000);
        Date b = new Date();
        b = a.congNgay(20);
        b.hienthi();
    }
}
