package cn.jing.problem1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainBegin4 {

  static final int MAXN = 1000005;
  static final int M = 10007;
  static long[] f = new long[MAXN];
  static int n;

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainBegin4.txt"));
//    Scanner sc = new Scanner(new BufferedInputStream(System.in));
    f[1] = f[2] = 1;
    n = sc.nextInt();
    if(n <= 2) {
      System.out.println("1");
    } else {
      for (int i = 3; i <= n; i ++) {
        f[i] = (f[i - 1] + f[i - 2]) % M;
      }
      System.out.println(f[n]);
    }
  }

//  public static void main(String[] args) throws Exception {
//    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainBegin4.txt"));
////    Scanner sc = new Scanner(new BufferedInputStream(System.in));
//    f[1] = f[2] = 1;
//    for (int i = 3; i < MAXN; i ++) {
//      f[i] = (f[i - 1] + f[i - 2]) % M;
//    }
//    n = sc.nextInt();
//    if(n <= 2) {
//      System.out.println("1");
//    } else {
//      System.out.println(f[n]);
//    }
//  }
}
