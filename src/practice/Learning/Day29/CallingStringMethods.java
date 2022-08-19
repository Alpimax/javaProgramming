package practice.Learning.Day29;

import practice.Learning.my_utils.StringUtil;

public class CallingStringMethods {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("Hello Word!!!"));

        System.out.println(StringUtil.fixFormat("aLpeR"));
        System.out.println(StringUtil.isPalindrome("aLpeR"));
        System.out.println(StringUtil.camelCase("aLpeR great everything"));
        System.out.println(StringUtil.frequencyOfChar("mississippi",'i'));
    }
}
