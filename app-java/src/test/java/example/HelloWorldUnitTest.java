package example;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HelloWorldUnitTest {

    @Test
    public void test() {
        new HelloWorld().coveredByUnitTest();
    }

    @Test
    public void test2() {
        new HelloWorld().shouldDefineConstant();
    }

    @Test
    public void test3() {
        String result = new HelloWorld().getWords(5);
        assertThat(result, equalTo("five"));
    }

    /*
    // Comment or uncomment this code for code coverage demo purposes 
    @Test
    public void testGetAllWordsToIncreaseCoverage() {
        assertThat(new HelloWorld().getWords(1), equalTo("one"));
        assertThat(new HelloWorld().getWords(2), equalTo("two"));
        assertThat(new HelloWorld().getWords(3), equalTo("three"));
        assertThat(new HelloWorld().getWords(4), equalTo("four"));
        assertThat(new HelloWorld().getWords(6), equalTo("six"));
        assertThat(new HelloWorld().getWords(7), equalTo("seven"));
        assertThat(new HelloWorld().getWords(8), equalTo("eight"));
        assertThat(new HelloWorld().getWords(9), equalTo("nine"));
        assertThat(new HelloWorld().getWords(1000), equalTo("lots"));
    }
    */

}
