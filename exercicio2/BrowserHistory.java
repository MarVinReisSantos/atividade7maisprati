class HistoryNode {
    String url;
    HistoryNode next;

    HistoryNode(String url) {
        this.url = url;
        this.next = null;
    }
}

class BrowserHistory {
    private HistoryNode head;
    private int size;
    private final int MAX_SIZE = 10;

    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);
        newNode.next = head;
        head = newNode;
        size++;
        if (size > MAX_SIZE) {
            removeOldest();
        }
    }

    private void removeOldest() {
        if (head == null || head.next == null) return;

        HistoryNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void displayHistory() {
        HistoryNode temp = head;
        while (temp != null) {
            System.out.println(temp.url);
            temp = temp.next;
        }
    }
}
