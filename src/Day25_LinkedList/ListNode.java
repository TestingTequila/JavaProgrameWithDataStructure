package Day25_LinkedList;

public class ListNode {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNextListNode() {
        return nextListNode;
    }

    public void setNextListNode(ListNode nextListNode) {
        this.nextListNode = nextListNode;
    }

    public ListNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(ListNode headNode) {
        this.headNode = headNode;
    }

    private ListNode nextListNode;

    private ListNode headNode;

}
