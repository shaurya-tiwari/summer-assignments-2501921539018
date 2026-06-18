package week3.day2;

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

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyforstart = new ListNode(-1);
        ListNode curNode = dummyforstart; // start from here

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curNode.next = list1;
                list1 = list1.next;
            } else {
                curNode.next = list2;
                list2 = list2.next;
            }
            curNode = curNode.next;
        }
        if (list1!=null) {
            curNode.next = list1;
        }
        else{
            curNode.next = list2;
        }
        return dummyforstart;
    } 

    public static void main(String[] args) {
        ListNode l1Node1 = new ListNode(1);
        ListNode l1Node2 = new ListNode(2);
        ListNode l1Node3 = new ListNode(4);
        l1Node1.next = l1Node2;
        l1Node2.next = l1Node3;

        // List 2: 1 -> 3 -> 4 -> null
        ListNode l2Node1 = new ListNode(1);
        ListNode l2Node2 = new ListNode(3);
        ListNode l2Node3 = new ListNode(4);
        l2Node1.next = l2Node2;
        l2Node2.next = l2Node3;

        MergeTwoSortedLists obj = new MergeTwoSortedLists();
        System.out.println(obj.mergeTwoLists(l1Node1, l2Node1));
    }
}
