package cn.jing.problem5;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainAlgo51 {
  static final int M = 50000;
  static final int MAXN = 100000;
  static int[] a = new int[MAXN];
  static int n;
  static int count;
  static int rel;

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainAlgo51.txt"));
    //Scanner sc = new Scanner(new BufferedInputStream(System.in));
    n = sc.nextInt();
    count = 0;
    rel = 1;
    int i = 1;
    while (count < 1000) {
      if (isPrime(i))
        a[count++] = i;
      i++;
      //System.out.println(count);
    }
    for (i = 0; i < n; i++)
      rel = rel * a[i] % M;
    System.out.println(rel);
  }

  public static boolean isPrime(int n) {
    if (n == 1)
      return false;
    for (int i = 2; i <= (n + 1) / 2; i++)
      if (n % i == 0)
        return false;
    return true;
  }
}
