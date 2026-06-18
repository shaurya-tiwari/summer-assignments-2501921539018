package week3.day1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
// Step A: Hum khud ek Linked List banayenge (Nodes create karenge)
        // Values: 3 -> 2 -> 0 -> -4
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Step B: Nodes ko ek dusre se link karenge
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Step C: Ek jaan-bujh kar CYCLE banayenge (Testing ke liye)
        // Aakhiri node (-4) ko wapas dusre node (2) se jod dete hain
        node4.next = node2;

        LinkedListCycle LinkedListCycle = new LinkedListCycle();
        boolean result =  LinkedListCycle.hasCycle(node1);


        if (result == true) {
            System.out.println("Result: True! Listis cyle ");
        } else {
            System.out.println("Result: False! infinite o cycle .");
        }
    }
}
