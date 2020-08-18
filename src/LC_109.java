public class LC_109 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        //中序遍历
        ListNode globalHead = head;
        public TreeNode sortedListToBST(ListNode head) {
            int length = length(head);
            return build(0, length(head)-1);
        }
        public int length(ListNode head){
            int res = 0;
            while(head != null){
                res++;
                head = head.next;
            }
            return res;
        }
        public TreeNode build(int left, int right){
            if(left > right){
                return null;
            }
            int mid = (left + right) / 2;
            TreeNode t = new TreeNode();
            t.left = build(left, mid-1);
            t.val = globalHead.val;
            globalHead = globalHead.next;
            t.right = build(mid+1, right);
            return t;
        }
    }
}
