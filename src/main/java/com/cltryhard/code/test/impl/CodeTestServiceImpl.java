package com.cltryhard.code.test.impl;

import com.cltryhard.code.test.CodeTestService;
import org.springframework.stereotype.Service;

/**
 * @author LanceChan
 * @version 1.0.0
 * @date 2022/3/16
 */
@Service
public class CodeTestServiceImpl implements CodeTestService {

    @Override
    public String removeDuplicateCharacter(String str, int limit) {
        StringBuilder sb = new StringBuilder(str);
        int initialLength = -1;
        while (initialLength != sb.length()) {
            initialLength = sb.length();
            for (int i = 0, count = 1; i < sb.length(); ++i) {
                if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                    count = 1;
                } else if (++count >= limit) {
                    sb.delete(i - limit + 1, i + 1);
                    System.out.println(sb);
                    break;
                }
            }
        }
        return sb.toString();
    }

    @Override
    public String replaceDuplicateCharacter(String str) {
        return this.replaceDuplicates(new StringBuilder(str));
    }

    private String replaceDuplicates(StringBuilder sb) {
        for (int i = 0, counter = 0; i < sb.length(); i++) {
            if (sb.length() > 1 && sb.charAt(i) == sb.charAt(i + 1)) {
                counter++;
            } else if (counter > 1 && sb.charAt(i) != sb.charAt(i + 1)) {
                char c = (char) (sb.charAt(i) - 1);
                if (c < 'a') {
                    sb.delete(i - counter, i + 1);
                    System.out.println(sb);
                } else {
                    String substring = sb.substring(i - counter, i + 1);
                    sb.replace(i - counter, i + 1, String.valueOf(c));
                    System.out.println(sb + ", " + substring + " is replaced by " + c);
                }
                this.replaceDuplicates(sb);
            }
        }
        return sb.toString();
    }

}
