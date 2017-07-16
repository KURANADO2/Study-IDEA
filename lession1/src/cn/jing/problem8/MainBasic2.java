package cn.jing.problem8;

/**
 * Created by JING on 2017/7/16.
 */
public class MainBasic2 {
  static StringBuilder sb;
  static int n;

  public static void main(String[] args) throws Exception {
    for (int i = 0; i <= 31; i++) {
      sb = new StringBuilder("");
      n = i;
      while (n != 0) {
        sb.append(n % 2);
        n /= 2;
      }
      if (sb.length() < 5) {
        int zero = 5 - sb.length();
        for (int j = 0; j < zero; j++) {
          sb.append("0");
        }
      }
      System.out.println(sb.reverse());
    }
  }
}
