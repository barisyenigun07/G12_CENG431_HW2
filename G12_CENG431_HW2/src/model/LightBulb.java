package model;

public class LightBulb extends Component {
    private boolean on;

    public LightBulb(SmartHomeMediator mediator) {
        super(mediator);
        on = false;
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        if (message.equalsIgnoreCase("TURN_ON_LIGHT")) {
            turnOn();
        } else if (message.equalsIgnoreCase("TURN_OFF_LIGHT")) {
            turnOff();
        }
    }

    public void turnOn() {
        on = true;
        System.out.println("Light bulb is ON");
    }

    public void turnOff() {
        on = false;
        System.out.println("Light bulb is OFF");
    }
}
