package cn.jing.problem7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by JING on 2017/7/16.
 */
public class MainBegin3 {
  static int r;
  static final double PI = Math.PI;
  static DecimalFormat df = new DecimalFormat("0.0000000");

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileInputStream("D:/LQCup/MainBegin3.txt"));
//    Scanner sc = new Scanner(new BufferedInputStream(System.in));
    r = sc.nextInt();
    System.out.println(df.format(PI * r * r));
  }
}
