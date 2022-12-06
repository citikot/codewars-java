package prometheus.task3.linkedlist;

class Node{
    private Node next;
    private Integer data;

    public Node(Integer data) {
        setData(data);
        this.next = null;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}
