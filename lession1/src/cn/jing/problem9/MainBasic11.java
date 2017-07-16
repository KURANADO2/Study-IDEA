package cn.jing.problem9;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainBasic11 {
    static String str = "";
    static long sum = 0;
    static char ch;
    static final int M = 16;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainBasic11.txt"));
//    Scanner sc = new Scanner(new BufferedInputStream(System.in));
        str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                sum = sum * M + ((int) ch - 48);
            else sum = sum * M + ((int) ch - 55);
        }
        System.out.println(sum);
    }
}
