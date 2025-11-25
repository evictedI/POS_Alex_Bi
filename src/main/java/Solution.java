public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arry2[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1;j < nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    arry2[0] = i;
                    arry2[1] = j;
                }
            }
        }
        return arry2;
    }
//      public class ListNode {
//          int val;
//          ListNode next;
//          ListNode() {}
//          ListNode(int val) { this.val = val; }
//          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      }
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//    }
}