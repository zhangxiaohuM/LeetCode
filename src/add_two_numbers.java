public class add_two_numbers {
    public static void main(String[]args){
        Solution sl = new Solution();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        l1.add( );

    }
}
class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }
}