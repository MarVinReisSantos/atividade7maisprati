class Action {
    String description;
    Action next;

    Action(String description) {
        this.description = description;
        this.next = null;
    }
}

class TextEditor {
    private Action head;

    public void performAction(String description) {
        Action newAction = new Action(description);
        newAction.next = head;
        head = newAction;
    }

    public void undoAction() {
        if (head != null) {
            System.out.println("Undoing: " + head.description);
            head = head.next;
        } else {
            System.out.println("No actions to undo.");
        }
    }

    public void displayActions() {
        Action temp = head;
        while (temp != null) {
            System.out.println(temp.description);
            temp = temp.next;
        }
    }
}
