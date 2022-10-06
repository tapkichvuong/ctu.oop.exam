package buoi1;

public class sum {
    public static void main(String[] args){
        double tong = 0, n, max = Double.MIN_VALUE;
        for (String string : args) {
            try {
                n = Double.parseDouble(string);
            } catch (Exception e) {
                n = 0;
            }
            tong += n;
            if(n>max)   max = n;
        }
        char m = 55;
        System.out.println("tong la " + tong);
        System.out.print("so lon nhat la" + max);
        System.out.print(m);
    }
}