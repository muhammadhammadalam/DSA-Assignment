class MergeLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge two sorted linked lists
    public Node mergeSortedLists(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.data < l2.data) {
            l1.next = mergeSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeSortedLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        MergeLinkedList list1 = new MergeLinkedList();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        MergeLinkedList list2 = new MergeLinkedList();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        System.out.println("List 1:");
        list1.display();
        System.out.println("List 2:");
        list2.display();

        MergeLinkedList mergedList = new MergeLinkedList();
        mergedList.head = list1.mergeSortedLists(list1.head, list2.head);
        System.out.println("Merged Sorted List:");
        mergedList.display();
    }
}
