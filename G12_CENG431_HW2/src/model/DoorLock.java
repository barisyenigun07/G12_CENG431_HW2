package model;

public class DoorLock extends Component {
    private boolean locked;

    public DoorLock(SmartHomeMediator mediator) {
        super(mediator);
        locked = true;
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        if (message.equalsIgnoreCase("LOCK_DOOR")) {
            lock();
        } else if (message.equalsIgnoreCase("UNLOCK_DOOR")) {
            unlock();
        }
    }

    public void lock() {
        locked = true;
        System.out.println("Door is LOCKED");
    }

    public void unlock() {
        locked = false;
        System.out.println("Door is UNLOCKED");
    }
}