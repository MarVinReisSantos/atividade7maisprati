class Task {
    String title;
    boolean isCompleted;
    Task next;

    Task(String title) {
        this.title = title;
        this.isCompleted = false;
        this.next = null;
    }
}

class TaskManager {
    private Task head;

    public void addTask(String title) {
        Task newTask = new Task(title);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
    }

    public void completeTask(String title) {
        Task temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.isCompleted = true;
                break;
            }
            temp = temp.next;
        }
    }

    public void removeTask(String title) {
        if (head == null) return;

        if (head.title.equals(title)) {
            head = head.next;
            return;
        }

        Task temp = head;
        while (temp.next != null && !temp.next.title.equals(title)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void displayTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + (temp.isCompleted ? "Completed" : "Pending"));
            temp = temp.next;
        }
    }
}
