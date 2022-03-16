package com.cltryhard.code.test;

/**
 * @author LanceChan
 * @version 1.0.0
 * @date 2022/3/16
 */
public interface CodeTestService {

    /**
     * For a given string that only contains alphabet characters a-z, if 3 or more consecutive
     * characters are identical, remove them from the string. Repeat this process until
     * there is no more than 3 identical characters sitting besides each other.
     * @author LanceChan
     * @date 2022/3/16
     * @param str
     * @return java.lang.String
     * @since 1.0.0
    */
    String removeDuplicateCharacter(String str);

    /**
     * Instead of removing the consecutively identical characters, replace them with a
     * single character that comes before it alphabetically
     * @author LanceChan
     * @date 2022/3/17
     * @param str
     * @return java.lang.String
     * @since 1.0.0
    */
    String replaceDuplicateCharacter(String str);

}
