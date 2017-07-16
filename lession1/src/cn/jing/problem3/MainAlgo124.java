package cn.jing.problem3;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainAlgo124 {

  static final int MAXN = 101;
  static int[][] a = new int[MAXN][MAXN];
  static int n;

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainAlgo124.txt"));
    //Scanner sc = new Scanner(new BufferedInputStream(System.in));
    n = sc.nextInt();
    for (int i = 0; i < n; i++)
      for (int j = 0; j <= i; j++)
        a[i][j] = sc.nextInt();
    for (int i = n - 2; i >= 0; i--)
      for (int j = 0; j <= i; j++)
        a[i][j] = max(a[i + 1][j], a[i + 1][j + 1]) + a[i][j];
    System.out.println(a[0][0]);
  }

  public static int max(int a, int b) {
    return a >= b ? a : b;
  }
}
