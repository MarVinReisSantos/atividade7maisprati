class Action {
    String content;
    Action prev;
    Action next;

    Action(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private Action current;

    public TextEditor() {
        current = new Action("");
    }

    public void performAction(String content) {
        Action newAction = new Action(content);
        newAction.prev = current;
        current.next = newAction;
        current = newAction;
    }

    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current.next != null) {
            current = current.next;
        }
    }

    public void displayContent() {
        System.out.println("Current Content: " + current.content);
    }
}
