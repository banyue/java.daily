package com.lj.daily.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lijin on 16/10/26.
 */
public class PatternUtil {

    public static boolean pattern(String rex, String str) {
        Pattern pattern = Pattern.compile(rex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String args[]) {
        String str = "123424,241534,366463,424243,78263827642648,";
        String rex = "^(\\d+,)+$";
        System.out.println(pattern(rex,str));
    }
}
