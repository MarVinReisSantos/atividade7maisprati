import java.util.LinkedList;
import java.util.Queue;

class BankQueue {
    private Queue<String> queue;

    public BankQueue() {
        queue = new LinkedList<>();
    }

    public void addCustomer(String customer) {
        queue.add(customer);
        System.out.println("Added customer: " + customer);
    }

    public void serveNextCustomer() {
        String customer = queue.poll();
        if (customer != null) {
            System.out.println("Serving customer: " + customer);
        } else {
            System.out.println("No customers in the queue.");
        }
    }

    public void displayQueue() {
        System.out.println("Customers in queue: " + queue);
    }
}

