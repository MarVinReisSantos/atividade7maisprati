import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    String jobName;

    PrintJob(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return jobName;
    }
}

class PrintQueue {
    private Queue<PrintJob> queue;

    public PrintQueue() {
        queue = new LinkedList<>();
    }

    public void addJob(String jobName) {
        PrintJob newJob = new PrintJob(jobName);
        queue.add(newJob);
        System.out.println("Added job: " + jobName);
    }

    public void processNextJob() {
        PrintJob job = queue.poll();
        if (job != null) {
            System.out.println("Processing job: " + job);
        } else {
            System.out.println("No jobs in the queue.");
        }
    }

    public void displayQueue() {
        System.out.println("Jobs in queue: " + queue);
    }
}
