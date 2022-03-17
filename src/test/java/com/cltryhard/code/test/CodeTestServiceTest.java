package com.cltryhard.code.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LanceChan
 * @version 1.0.0
 * @date 2022/3/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CodeTestServiceTest {

    @Autowired
    private CodeTestService codeTestService;

    /**
     * Input: aabcccbbad
     * Output:
     * -> aabbbad
     * -> aaad
     * -> d
     */
    @Test
    public void testRemoveDuplicateCharacter(){
        String result = codeTestService.removeDuplicateCharacter("aabcccbbad", 3);
        Assertions.assertEquals("d", result);
    }

    /**
     * Input: abcccbad
     * Output:
     * -> abbbad, ccc is replaced by b
     * -> aaad, bbb is replaced by a
     * -> d
     */
    @Test
    public void testReplaceDuplicateCharacter(){
        String result = codeTestService.replaceDuplicateCharacter("abcccbad");
        Assertions.assertEquals("d", result);
    }
}
