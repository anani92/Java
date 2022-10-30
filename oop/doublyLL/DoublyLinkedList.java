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


  public void addAt(int value, int indexVal) {
		Node newNode = new Node(value);

		if(indexVal==0) {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}else {
			Node runner = head;

			for(int i=0; i<indexVal-1; i++) {
				if(runner!=null) {
					runner = runner.next;
				}
			}

			newNode.next = runner.next;
			newNode.previous = runner;
			runner.next = newNode;
			if(newNode.next!=null) {
				newNode.next.previous = newNode;
			}

		}
	}

  }