package Week4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void strCount() {
        Assert.assertEquals(2,new Recursion().strCount("catdogcat", "cat"));
    }
    @Test
    void xCount(){
        Assert.assertEquals(4, new Recursion().xCount("xxhixx"));
    }
    @Test
    void blocks(){
        Assert.assertEquals(10, new Recursion().blocks(4));
    }
    @Test
    void parent(){
       Assert.assertEquals("(mello)", new Recursion().parent("abh(mello)yyuih"));
       Assert.assertEquals("(abc)", new Recursion().parent("fgh(abc)erty(ckt)"));
    }
}