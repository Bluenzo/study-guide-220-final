import java.util.HashMap;
import java.util.Map;
public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        ListNode head = new ListNode(4, new ListNode(8, new ListNode(4, new ListNode(16, new ListNode(8, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(42, new ListNode(34))))))))));

        int oddIndexSumResult = oddIndexSum(head);
        System.out.println("Sum of values at odd indexes: " + oddIndexSumResult);

        int numberValuesResult = numberValuesShowsUp(head);
        System.out.println("Number of unique values in the linked list: " + numberValuesResult);

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(9);
        root.right.right.left = new TreeNode(11);
        root.right.right.right = new TreeNode(13);
        root.right.right.left.left = new TreeNode(18);

        int result = leafNodesEvenValue(root);
        System.out.println("Sum of even-valued leaf nodes: " + result);

        int result1 = sumOfBranchNodesWithOddValue(root);
        System.out.println("Sum of odd-valued branch nodes: " + result1);


        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT
        if(head == null) {
            return 0;
        }

        int sum = 0;

        ListNode current = head;
        int index = 0;
        while (current != null){
            if(index % 2 != 0){
                sum += current.data;
            }
            current = current.next;
            index++;
        }
        return sum;
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS

    public static int largestOfThreeLastValue(ListNode head) {
        if(head == null) {
            return Integer.MIN_VALUE; 
        }

        int largest = Integer.MIN_VALUE;
        ListNode current = head;
        while(current != null){


        }
    }

    public static int leafNodesEvenValue (TreeNode node){
        if(node == null){
            return 0;
        }
        int sum = 0;
        if(node.left == null && node.right == null){
            if(node.data % 2 ==0){
                sum += node.data;
            }
        
        }
        return sum + leafNodesEvenValue(node.left) + leafNodesEvenValue(node.right);

    }

    public static int sumOfBranchNodesWithOddValue(TreeNode node){
        if(node == null){
            return 0;
        }

        int sum = 0;

        if(node.left != null || node.right != null){
            if(node.data % 2 != 0){
                sum += node.data;
            }
        }
        
        return sum + sumOfBranchNodesWithOddValue(node.left) + sumOfBranchNodesWithOddValue(node.right);
    }

    /**
     * Given a reference to a head node in a linked list of integers, return a Map<Integer, Integer> containing each value along with the number of times it shows up.
    Example:
    Linked List:
    4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8

    Expected Return Map (order is unimportant): 
    { 
    4: 3,
    8: 2,
    16: 2,
    29: 1,
    34: 1
    } 

     * @param head
     * @return
     */
    


    public static int numberValuesShowsUp(ListNode head){
        if(head == null){
            return 0;
        }
        Map<Integer, Integer> valueCountMap = new HashMap<>();

        ListNode current = head;
        while(current != null){
            int value = current.data;
            valueCountMap.put(value, valueCountMap.getOrDefault(value, 0) + 1);
            current = current.next;
        }
        // Print the map for demonstration purposes
        for(Map.Entry<Integer, Integer> entry : valueCountMap.entrySet()){
            System.out.println("Value: " + entry.getKey() + ", Count: " + entry.getValue());
        }
        return valueCountMap.size(); 
    }


}
