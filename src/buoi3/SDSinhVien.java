package buoi3;

import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        // SinhVien a = new SinhVien();
        // a.nhap();
        // a.hienthi();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();

        SinhVien ds[] = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new SinhVien();
        }
        System.out.print("Nhap thong tin sinh vien: \n");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap sinh vien thu: " + (i + 1) + "\n");
            ds[i].nhap();
        }

        System.out.print("In thong tin sinh vien: \n");
        for (int i = 0; i < n; i++) {
            System.out.print("Thong tin sinh vien thu: " + (i + 1) + "\n");
            ds[i].hienthi();
            System.out.print("\n");
        }

        System.out.print("dang ky thong tin sinh vien: \n");
        for (int i = 0; i < n; i++) {
            System.out.print("dang ky sinh vien thu: " + (i + 1) + "\n");
            ds[i].dky();
        }

        System.out.print("Nhap diem thong tin sinh vien: \n");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap sinh vien thu: " + (i + 1) + "\n");
            ds[i].nhapDiem();
        }

        System.out.print("In bang diem thong tin sinh vien: \n");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". " + ds[i] + " " + ds[i].trungbinh()  + "\n");
        }

        System.out.print("sinh vien bi canh bao hoc vu: \n");
        for (int i = 0; i < n; i++) {
            if (ds[i].trungbinh() < 1) {
                System.out.print((i + 1) + ". " + ds[i] + " " + ds[i].trungbinh()+ "\n");
            }
        }

        System.out.print("Sinh vien xuat sac: \n");
        float max = 0.0f;
        for (int i = 0; i < n; i++) {
            if (ds[i].trungbinh() > max) {
                max = ds[i].trungbinh();
            }
        }
        for (int i = 0; i < n; i++) {
            if (ds[i].trungbinh() == max) {
                System.out.print((i + 1) + ". " + ds[i] + " " + ds[i].trungbinh() + "\n");
            }
        }
    }
}
