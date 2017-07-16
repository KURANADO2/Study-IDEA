package cn.jing.problem4;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainAlgo86 {
  static int m;
  static int s;
  static int n;
  static int[][] A;
  static int[][] B;
  static int[][] C;

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainAlgo86.txt"));
    //Scanner sc = new Scanner(new BufferedInputStream(System.in));
    m = sc.nextInt();
    s = sc.nextInt();
    n = sc.nextInt();
    A = new int[m][s];
    B = new int[s][n];
    C = new int[m][n];
    for (int i = 0; i < m; i++)
      for (int j = 0; j < s; j++)
        A[i][j] = sc.nextInt();
    for (int i = 0; i < s; i++)
      for (int j = 0; j < n; j++)
        B[i][j] = sc.nextInt();
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++) {
//				C[i][j] = 0;
        for (int k = 0; k < s; k++)
          C[i][j] = C[i][j] + A[i][k] * B[k][j];
      }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++)
        System.out.print(C[i][j] + " ");
      System.out.println();
    }
  }
}
