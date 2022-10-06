package buoi1;

import java.util.Scanner;
import java.util.Stack;

public class prime {
    public boolean isPrimeNumber(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void changeBinaryNum(int n) {
        Stack<Integer> s = new Stack<Integer>();
        while (n < 0) {
            int m = n % 2;
            s.push(m);
            n = n / 2;
        }
        while (!s.empty()) {
            int i = s.peek();
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        prime t = new prime();
        if (t.isPrimeNumber(n)) {
            System.out.println("n là số nguyên tố");
        } else {
            System.out.println("n không là số nguyên tố");
        }
        t.changeBinaryNum(n);
    }
}
