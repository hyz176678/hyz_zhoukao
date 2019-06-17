package com.hanyizhe.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 随机数工具类
 * @author 韩一哲
 *
 */
public class RandomUtil {
  //随即区间内的一个数
  public static Integer getRandom1(Integer min, Integer max) {
    Random r = new Random();
    return r.nextInt(max - min + 1) + min;
  }

  /**
   * 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
   * 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，
   * [3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
   * @param min
   * @param max
   * @param subs
   * @return
   */
  public static Set subRandom(int min, int max, int subs) {
    Set<Integer> set = new HashSet<Integer>();
    while (set.size() != subs) {
      Integer integer = RandomUtil.getRandom1(min, max);
      set.add(integer);
    }
    return set;

  }

  /**
   * 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
   */
  public static char randomCharacter() {
    String str = "123456789qwertyuiopasdfghjklzxcvbnm";
    Integer index = RandomUtil.getRandom1(0, str.length() - 1);

    return str.charAt(index);
  }

  /**
   * 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
   */
  public static String randomString(Integer length) {
    String str = "123456789qwertyuiopasdfghjklzxcvbnm";
    Set subRandom = RandomUtil.subRandom(0, str.length() - 1, length);
    String string = "";
    for (Object index : subRandom) {
      string += " " + str.charAt((int) index);
    }
    string = string.substring(1);
    return string;
  }
}
