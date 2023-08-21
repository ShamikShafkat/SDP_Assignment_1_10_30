package CentralOnlineSystemClasses;
import java.util.LinkedList;
import java.util.Queue;

public class CentralOnlineSystem {
    private volatile static CentralOnlineSystem instance;
    private Queue<Command> commandQueue;
    private Thread processingThread;
    private boolean isProcessing;

    private CentralOnlineSystem() {
        commandQueue = new LinkedList<>();
        processingThread = new Thread(this::processCommands);
        isProcessing = false;
    }

    public static CentralOnlineSystem getInstance() {
        if (instance == null) {
            synchronized (CentralOnlineSystem.class) {
                if (instance == null) {
                    instance = new CentralOnlineSystem();
                }
            }
        }
        return instance;
    }

    public void addCommand(Command command) {
        synchronized (commandQueue) {
            commandQueue.add(command);
            if (!isProcessing) {
                isProcessing = true;
                processingThread.start();
            }
        }
    }

    private void processCommands() {
        while (!commandQueue.isEmpty()) {
            Command command;
            synchronized (commandQueue) {
                command = commandQueue.poll();
                if (command == null) {
                    isProcessing = false;
                    break;
                }
            }
            command.execute();
        }
    }
}

