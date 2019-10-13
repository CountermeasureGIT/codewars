import org.junit.Test;

import static org.junit.Assert.*;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
        assertFalse("codewars is not codewarss", StringMerger.isMerge("codewars", "cod", "warss"));
        assertFalse("Going bananas!", StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
        assertFalse("one more",
                StringMerger.isMerge("+wy.2c.xPl,$(R6RJ&\\&F)Ya_Au0e&X$+wy.2c.xPl,$(R6RJ&\\&F).]j;6w?uTqtWaU<T/2[o,rHpvN`ou&T1V2Z+A;.+",
                        "+wy.2c.xPl,$(R6RJ&\\&F).]j;6w?uTqtWaU<T/2[o,r",
                        "+wy.2c.xPl,$(R6RJ&\\&F)Ya_Au0e&X$HpvN`ou&T1V2Z+A;.+"));
        assertFalse("'Can we merge it? Yes, we can!' is a merge of 'nweg it?s, e !' and 'Ca e mre Yewcan'",
                StringMerger.isMerge("Can we merge it? Yes, we can!", "nweg it?s, e !", "Ca e mre Yewcan"));
        assertFalse("'3`5LavKE .Da\"8L77@RBu&2^[J%\\aLy+[3`5LavKE .Da\"8L77@RBu&28<,YZR^kL@BJ^vN*o!s14HZl-0*rD\"7J' is a merge of '3`5LavKE .Da\"8L77@RBu&28<,YZR^kL@BJ^vN' and '3`5LavKE .Da\"8L77@RBu&2^[J%\\aLy+[*o!s14HZl-0*rD\"7J'",
                StringMerger.isMerge("Can we merge it? Yes, we can!",
                        "3`5LavKE .Da\"8L77@RBu&28<,YZR^kL@BJ^vN",
                        "3`5LavKE .Da\"8L77@RBu&2^[J%\\aLy+[*o!s14HZl-0*rD\"7J"));
    }

}