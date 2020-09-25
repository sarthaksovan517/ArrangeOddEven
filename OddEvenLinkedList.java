class OddEvenLinkedList {

    public static void main(String[] args)
    {

        /**
         * I have used this for my own testing
         * please ignore and run it against test cases
         */
        
        OddEvenLinkedList intList = new OddEvenLinkedList();
        intList.addData(1);
        intList.addData(2);
        intList.addData(3);
        intList.addData(4);
        intList.addData(5);
        intList.addData(6);
        intList.addData(7);
        intList.addData(8);
        intList.addData(9);
        System.out.println("Before rearranging");
        intList.printListItems();

        intList.arrangeOddEvenLeftToRight();

        System.out.println("After rearranging");
        intList.printListItems();
    }

    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void arrangeOddEvenLeftToRight() {

        Node current = head;
        Node evenBegin = null;
        Node evenEnd = null;
        Node oddBegin = null;
        Node oddEnd = null;


        while(current != null) {
            int nodeData = current.data;

            if(nodeData % 2 != 0) {

                if(oddBegin == null) {
                    oddBegin = current;
                    oddEnd = oddBegin;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            } else {

                if(evenBegin == null) {
                    evenBegin = current;
                    evenEnd = evenBegin;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            }
            current = current.next;
        }


        if(oddBegin == null || evenBegin == null) {
            return;
        }

        oddEnd.next = evenBegin;
        evenEnd.next = null;
        head = oddBegin;
    }

    void addData(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printListItems()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
