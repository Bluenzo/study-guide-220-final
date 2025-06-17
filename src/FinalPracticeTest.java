import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_singleNodeList() {
        ListNode list = new ListNode(10);
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual); // Index 0 is even
    }

    @Test
    void testOddIndexSum_twoNodeList() {
        ListNode list = new ListNode(5, new ListNode(15));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(15, actual); // 15 is at index 1
    }

    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(6, actual);
    }
    


    // TODO: Make more tests for oddIndexSum

    // TODO: Make thorough tests for ALL the questions on the study guide
}
