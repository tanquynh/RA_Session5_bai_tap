package BT1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();
        if(str.isEmpty()) {
            System.out.println("Chuỗi rỗng");
        } else {
            System.out.println("Chuỗi không rỗng");
        }
    }
}