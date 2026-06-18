package week3.day1;

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

public class MiddleoftheLinkedList {

    public ListNode middleNode(ListNode head) {
        
        if (head==null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast= fast.next.next;

        }
        return slow; // Abhi ke liye bas 'head' return kar raha hai, aap isko apne hisaab se change karenge
    }

    // Output dekhne ke liye helper method (Memory address ki jagah values print karega)
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        // Step 1: Humne ek odd length ki list banayi: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Nodes ko ek dusre se link kiya
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Class ka object banaya apne method ko call karne ke liye
        MiddleoftheLinkedList obj = new MiddleoftheLinkedList();

        System.out.println("Original List:");
        obj.printList(node1);

        // Step 2: Aapke function mein head (node1) pass kiya
        ListNode result = obj.middleNode(node1);

        // Step 3: Result ko print karke check kiya
        System.out.println("\nMiddle Node se List (Aapka Output):");
        obj.printList(result);
        
        // Hint: Agar aapka logic sahi hoga, toh output "3 -> 4 -> 5 -> null" aana chahiye!
    }
}