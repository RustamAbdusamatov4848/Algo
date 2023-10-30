package AlgorithmStudyPlan.Day_5;

public class Day_5 {
    public static void main(String[] args) {

    }
    public static ListNode middleNode(ListNode head,int startPosition) {
         ListNode temp;
         temp = head;

         int lengthList = 0;
         while (temp !=null){
             temp = temp.next;
             lengthList++;
         }

         lengthList/=2;
         while (lengthList>0){
             head = head.next;
             lengthList--;
         }
         return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;

        while (temp!=null){
            temp = temp.next;
            length++;
        }
        int tempLength = 0;

        assert head != null;
        ListNode nextNode = head.next.next;
        while (tempLength<length-n){
            head = head.next;
            tempLength++;
        }
        head.next = nextNode;
        return head;
    }
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
        this.val = val;
        this.next = next;

    }
}