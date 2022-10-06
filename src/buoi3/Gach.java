package buoi3;

import java.util.Scanner;

public class Gach {
    private String code, color;
    private int amount, length, width; //don vi do dai cm
    private long price; // don vi tien te VND
    
    public Gach(){
        code = new String();
        color = new String();
        amount = 0;
        length = 0;
        width = 0;
        price = 0;
    }

    public Gach(String code, String color, int amount, int length, int width, long price){
        this.code = new String(code);
        this.color = new String(color);
        this.amount = amount;
        this.length = length;
        this.width = width;
        this.price = price;
    }

    public Gach(Gach a){
        code = new String(a.code);
        color = new String(a.color);
        amount = a.amount;
        length = a.length;
        width = a.width;
        price = a.price;
    }

    public void nhap(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap ma so gach: ");
            code = sc.nextLine();
            System.out.print("Nhap mau gach: ");
            color = sc.nextLine();
            System.out.print("Nhap so luong gach: ");
            amount = sc.nextInt();
            System.out.print("Nhap chieu dai gach: ");
            length = sc.nextInt();
            System.out.print("Nhap chieu rong gach: ");
            width = sc.nextInt();
            System.out.print("Nhap gia gach: ");
            price = sc.nextLong();
        }
    }

    public void printInfo(){
        System.out.print("ma so gach: " + code);
        System.out.print("mau gach: " + color);
        System.out.print("so luong gach: " + amount);
        System.out.print("chieu dai gach: " + length);
        System.out.print("chieu rong gach: " + width);
        System.out.print("gia gach: " + price);        
    }

    public float giaBanLe(){
        float giaLe = (price/amount) * 20 / 100;
        return giaLe;
    }

    public int maxAreaOfBricks(){
        int areaOfOneBrick = length * width;
        int areaOfBoxBrick = areaOfOneBrick * amount;
        return areaOfBoxBrick;
    }

    public int soLuongHop(int D, int N){
        int area = D * N;
        int sl = area / maxAreaOfBricks();
        if((area & maxAreaOfBricks()) != 0) // sau khi op n hop van con dien tich chua duoc op
            sl++;
        return sl;
    }  
}
