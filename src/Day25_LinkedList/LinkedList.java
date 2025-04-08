package Day25_LinkedList;

public class LinkedList {
    ListNode headNode;

    public void create(int data) {
        ListNode newNode = new ListNode();
        newNode.setData(data);
        newNode.setNextListNode(null);
        if(headNode==null) {
            headNode = newNode;
        }
    }


}
