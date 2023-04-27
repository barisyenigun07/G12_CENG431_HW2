package model;

public class Thermostat extends Component {
    private int temperature;

    public Thermostat(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        if (message.startsWith("SET_TEMPERATURE")) {
            int temp = Integer.parseInt(message.split(" ")[1]);
            setTemperature(temp);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat set to: " + temperature + "°C");
    }
}
