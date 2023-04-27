package model;

import java.util.Random;

public class MotionSensor extends Component {
    public MotionSensor(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {}

    public boolean isMovementDetected() {
        Random random = new Random();
        return random.nextBoolean();
    }
}