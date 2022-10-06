package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
    private String mssv, hoten;
    private Date ngaysinh;
    private int slmon, max;
    private String[] mon;
    private String[] diem;

    public SinhVien() {
        mssv = new String();
        hoten = new String();
        ngaysinh = new Date();
        slmon = 0;
        max = 100;
        mon = new String[max];
        diem = new String[max];
    }

    public SinhVien(int max) {
        mssv = new String();
        hoten = new String();
        ngaysinh = new Date();
        slmon = 0;
        this.max = max;
        mon = new String[max];
        diem = new String[max];
    }

    public SinhVien(String mssv, String hoten, Date ngaysinh) {
        this.mssv = new String(mssv);
        this.hoten = new String(hoten);
        this.ngaysinh = new Date(ngaysinh);
        slmon = 0;
        max = 60;
        mon = new String[max];
        diem = new String[max];
    }

    public SinhVien(SinhVien a) {
        this.mssv = new String(a.mssv);
        this.hoten = new String(a.hoten);
        this.ngaysinh = new Date(a.ngaysinh);
        slmon = a.slmon;
        max = a.max;
        mon = new String[max];
        diem = new String[max];

        for (int i = 0; i < slmon; i++) {
            mon[i] = new String(a.mon[i]);
            diem[i] = new String(a.diem[i]);
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien");
        mssv = sc.nextLine();

        System.out.println("Nhap ho ten sinh vien");
        hoten = sc.nextLine();

        System.out.println("Nhap ngay sinh sinh vien");
        ngaysinh.nhap();
    }

    public void hienthi() {
        System.out.print("[" + mssv + ", " + hoten + ", " + ngaysinh);
        for (int i = 0; i < slmon; i++) {
            System.out.print(", " + mon[i] + ":" + diem[i]);
        }
        System.out.print("]");
    }

    public String toString() {
        String s = ("[" + mssv + ", " + hoten + ", " + ngaysinh);
        for (int i = 0; i < slmon; i++) {
            s += (", " + mon[i] + ":" + diem[i]);
        }
        s += ("]");
        return s;
    }

    public void them(String ten, String diem) {
        if (slmon < max - 1) {
            mon[slmon] = new String(ten);
            this.diem[slmon] = new String(diem);
            slmon++;
        } else {
            System.out.print("So luong mon da toi da");
        }
    }

    public void xoa(String ten) {
        int i = 0;
        while (!mon[i].equals(ten)) {
            i++;
        }
        if (i < slmon) {
            for (int j = i; j < slmon - 1; j++) {
                mon[j] = mon[j + 1];
                diem[j] = diem[j + 1];
            }
            slmon--;
        }
    }

    public void dky() {
        String ten = new String();
        System.out.print("Dang ky mon hoc cho sinh vien " + mssv + "\n");
        Scanner sc = new Scanner(System.in);
        do {
            ten = sc.nextLine();
            if (ten.equals("stop")) {
                break;
            }
            them(ten, "");
        } while (true);
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < slmon; i++) {
            System.out.print("Nhap diem mon " + mon[i] + ":");
            diem[i] = sc.nextLine();
        }
    }

    public float trungbinh() {
        float sum = 0.0f;
        for (int i = 0; i < slmon; i++) {
            switch (diem[i]) {
                case "A":
                    sum += 4;
                    break;
                case "B+":
                    sum += 3.5;
                    break;
                case "B":
                    sum += 3;
                    break;
                case "C+":
                    sum += 2.5;
                    break;
                case "C":
                    sum += 2;
                    break;
                case "D+":
                    sum += 1.5;
                    break;
                case "D":
                    sum += 1;
                    break;
                default:
                    sum += 0;
                    break;
            }
        }
        return (sum / slmon);
    }
}
