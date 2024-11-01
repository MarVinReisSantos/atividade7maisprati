import java.util.LinkedList;
import java.util.Queue;

class Process {
    String processName;

    Process(String processName) {
        this.processName = processName;
    }

    @Override
    public String toString() {
        return processName;
    }
}

class ProcessQueue {
    private Queue<Process> queue;

    public ProcessQueue() {
        queue = new LinkedList<>();
    }

    public void addProcess(String processName) {
        Process newProcess = new Process(processName);
        queue.add(newProcess);
        System.out.println("Added process: " + processName);
    }

    public void executeNextProcess() {
        Process process = queue.poll();
        if (process != null) {
            System.out.println("Executing process: " + process);
        } else {
            System.out.println("No processes in the queue.");
        }
    }

    public void displayQueue() {
        System.out.println("Processes in queue: " + queue);
    }
}
