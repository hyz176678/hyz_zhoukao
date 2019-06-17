package com.hanyizhe.common.tests;

import org.junit.Test;

import com.hanyizhe.common.utils.StringRandomUtil;

/**
 * 字符串测试类
 * @author 韩一哲
 * 
 *
 */
public class StringRandomUtilTest {

  //测试随机姓氏
  @Test
  public void generateChineseName() {
    String name = StringRandomUtil.generateChineseName();
    System.out.println(name);
  }
}
