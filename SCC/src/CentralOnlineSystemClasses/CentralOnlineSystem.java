package CentralOnlineSystemClasses;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CentralOnlineSystem {
    private volatile static CentralOnlineSystem instance;
    private final Queue<Command> commandQueue;
    private final Thread processingThread;
    private boolean isProcessing;
    private final ArrayList<String> bookedDates;

    private CentralOnlineSystem() {
        commandQueue = new LinkedList<>();
        processingThread = new Thread(this::processCommands);
        isProcessing = false;
        bookedDates = new ArrayList<String>();
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
        if(command instanceof CarWashingCommand){
            synchronized (bookedDates){
                try{
                    for(String str : bookedDates){
                        if(str.equals(command.getDate())){
                            throw new Exception();
                        }
                    }
                }
                catch (Exception e) {
                    System.out.println("Sorry for inconvenience. We are booked at that day.");
                    return ;
                }
                bookedDates.add(command.getDate());
            }
        }
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

