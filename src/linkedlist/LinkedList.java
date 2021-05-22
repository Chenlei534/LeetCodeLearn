package linkedlist;

import java.util.Stack;

public class LinkedList {
    //        linkedlist.ListNode head = main.createListNode();
//        main.outputListNode(head);
//        main.reverseOutputListNode(head);
    public void reverseOutputListNode(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        if (stack != null) {
            stack.push(head);
            while (head.next != null) {
                head = head.next;
                stack.push(head);
            }

            while (!stack.empty()) {
                ListNode node = stack.pop();
                System.out.println(node.data);
            }
        }

    }

    public ListNode createLinkedList() {
        ListNode head = null;

        for (int i = 0; i < 10; i++) {
            ListNode node = new ListNode(i, null);
            head = addListNode(head, node);
        }

        return head;
    }

    public ListNode addListNode(ListNode head, ListNode node) {
        ListNode p = head;

        if (head != null) {
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        } else {
            head = node;
        }

        return head;
    }

    public void outputListNode(ListNode head) {
        if (head != null) {
            System.out.println(head.data);
            while (head.next != null) {
                head = head.next;
                System.out.println(head.data);
            }
        } else {
            System.out.println("list node is null");
        }
    }
}
