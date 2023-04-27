package model;

import java.util.Random;

public class LightSensor extends Component {
    public LightSensor(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {}

    public boolean isBright() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
