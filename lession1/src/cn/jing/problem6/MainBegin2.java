package cn.jing.problem6;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainBegin2 {
  static long n;

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainBegin2.txt"));
    //Scanner sc = new Scanner(new BufferedInputStream(System.in));
    n = sc.nextLong();
    System.out.println(n * (1 + n) / 2);
  }
}
