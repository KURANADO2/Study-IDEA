package cn.jing.problem10;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainAlgo1 {
  static int n;
  static int m;
  static int[] a;
  static int[] b;

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainAlgo1.txt"));
    //Scanner sc = new Scanner(new BufferedInputStream(System.in));
    n = sc.nextInt();
    a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    m = sc.nextInt();
    while ((m--) != 0) {
      b = Arrays.copyOfRange(a, sc.nextInt() - 1, sc.nextInt());
      Arrays.sort(b);
      System.out.println(b[b.length - sc.nextInt()]);
    }
  }
}
