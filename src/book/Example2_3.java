package book;

import java.util.Scanner;
public class Example2_3 {
    public static void main (String args[]){
        System.out.println("请输入若干个数，每输一个回车确认");
        System.out.println("最后输入0结束这一操作");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        double X = reader.nextDouble();
        while(X!=0){
            sum = sum +X;
            X=reader.nextDouble();
        }
System.out.println("sum="+sum);
    }



}
