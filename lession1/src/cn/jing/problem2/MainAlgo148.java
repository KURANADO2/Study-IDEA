package cn.jing.problem2;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainAlgo148 {
  static int a;
  static int b;

  public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainAlgo148.txt"));
//Scanner sc = new Scanner(new BufferedInputStream(System.in));
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println(a * b / gcd(a, b));
  }

  public static int gcd(int a, int b) {                //欧几里得算法
    if (b == 0)
      return a;
    else return gcd(b, a % b);
  }
}
