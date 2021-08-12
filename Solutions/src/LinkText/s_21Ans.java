package LinkText;

public class s_21Ans {
    public static void main(String args[]){

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
    //根据理解和推测，ListNode代表一个节点，默认初始调用第一个节点；
    //当调用next，不可逆转地跳往下一个节点
    //好像把第一个节点及往后默认为整一个链表？

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
  }