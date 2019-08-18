import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        //assertEquals(23, new Solution().solution(10));
        Solution s = new Solution();
        long m, m1;

        //72906 миллисекунды
        m = System.currentTimeMillis();
        for (int i = 10; i <= 500000; i++) {
            s.solution(i);
        }
        m1 = System.currentTimeMillis();

        System.out.println((m1 - m));

        //1957 миллисекунд
        m = System.currentTimeMillis();
        for (int i = 10; i <= 500000; i++) {
            s.solutionNumbers(i);
        }
        m1 = System.currentTimeMillis();

        System.out.println((m1 - m));

        //даже ждать не буду, слишком долго
        m = System.currentTimeMillis();
        for (int i = 10; i <= 500000; i++) {
            s.solutionStream(i);
        }
        m1 = System.currentTimeMillis();

        System.out.println((m1 - m));
        //Java Stream API НАСТОЛЬКО МЕДЛЕННАЯ?
    }
}