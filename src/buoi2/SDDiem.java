package buoi2;

public class SDDiem {
    public static void main(String[] args) {
        Diem a = new Diem();
        Diem b = new Diem();
        System.out.println("Nhap Toa do cua diem A");
        a.nhapDiem();
        System.out.println(" Nhap Toa do cua diem B");
        b.nhapDiem();
        System.out.println("Toa do cua diem A la: ");
        a.hienThi();
        System.out.println("Toa do cua diem B la: ");
        b.hienThi();
        System.out.println("Khoang cach OA: " + a.khoangCach());
        System.out.println("Khoang cach OA: " + b.khoangCach(a));
    }
}
