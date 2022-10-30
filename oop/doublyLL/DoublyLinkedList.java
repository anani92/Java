public class DoublyLinkedList {
  public Node head;
  public Node tail;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void push(Node newNode) {
    if (this.head == null) {
      this.head = newNode;
      this.tail = newNode;
      return;
    }

    Node lastNode = this.tail;
    lastNode.next = newNode;
    newNode.previous = lastNode;
    this.tail = newNode;

  }

  public void printValuesForward() {
    Node runner = this.head;
    while (runner != null) {
      System.out.println(runner.value);
      runner = runner.next;
    }
  }

  public void printValuesBackward(){
    Node runner = this.tail;
    while (runner != null) {
      System.out.println(runner.value);
      runner = runner.previous;

    }
  }

  public Node pop() {
    Node newTail = this.tail.previous;
    Node currentTail = this.tail;
    newTail.next = null;
    this.tail = newTail;
    return currentTail;
  }

  public boolean contains(Integer value) {
    Node runner = head;
    while (runner != null) {
      if (runner.value == value) {
        return true;
      }
    runner = runner.next;
    }
    return false;
  }

  public int size(){
    int size = 0;
    Node runner = head;
    while (runner != null) {
      size += 1;
      runner = runner.next;
    }
    return size;
  }

  public void insertAt(Node newNode, int index) {
    if (this.head == null) {
        if (index != 0) {
            return;
        } else {
            this.head = newNode;
        }
    }

    if (head != null && index == 0) {
      newNode.next = head;
      head = newNode;
      return;
    }

    Node current = this.head;
    Node previous = null;

    int i = 0;

    while (i < index) {
        previous = current;
        current = current.next;
        i++;
    }

    newNode.next = current;
    previous.next = newNode;

    }

  }