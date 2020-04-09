package com.leetcode.easy.countAndSay;

//Problem 38
public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else if (n == 2) {
            return "11";
        }
        String out = "11";
        for (int j = 1; j <= n - 2; j++) {
            int len = out.length();
            StringBuilder sb = new StringBuilder();
            char currElement = out.charAt(0);
            int count = 1;
            char tempElement;
            for (int i = 1; i < len; i++) {
                tempElement = out.charAt(i);
                if (currElement != tempElement) {
                    sb.append(count);
                    sb.append(currElement);
                    count = 1;
                    currElement = tempElement;
                } else {
                    count++;
                }
            }
            sb.append(count);
            sb.append(out.charAt(len - 1));
            out = sb.toString();
        }
        return out;
    }
}
