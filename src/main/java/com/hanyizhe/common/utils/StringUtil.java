package com.hanyizhe.common.utils;

public class StringUtil {
  //方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
  public static boolean hasLength(String src) {
    return null != src && src.length() > 0;
  }

  //方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
  public static boolean hasText(String src) {
    return null != src && src.trim().length() > 0;
  }
}
