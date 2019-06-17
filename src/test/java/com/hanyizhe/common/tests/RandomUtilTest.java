package com.hanyizhe.common.tests;

import java.util.Set;

import org.junit.Test;

import com.hanyizhe.common.utils.RandomUtil;

/**
 * 随机数测试类
 * @author 韩一哲
 *
 */
public class RandomUtilTest {
  //测试第一个方法
  @Test
  public void getRandomUtilTest1() {
    for (int i = 0; i < 10; i++) {
      Integer random1 = RandomUtil.getRandom1(2, 5);
      System.out.println(random1);
    }

  }

  //测试第二个方法
  @Test
  public void getRandomUtilTest2() {
    Set random1 = RandomUtil.subRandom(1, 10, 5);
    String str = "";
    for (Object object : random1) {
      str += "," + object;
    }
    str = str.substring(1);
    System.out.println(str);
  }

  //测试第三个方法
  @Test
  public void getRandomUtilTest3() {
    for (int i = 0; i < 10; i++) {
      char character = RandomUtil.randomCharacter();
      System.out.println(character);
    }
  }

  //测试第四个方法
  @Test
  public void getRandomUtilTest4() {
    String string = RandomUtil.randomString(4);
    string = string.trim();
    System.out.println(string);
  }
}
