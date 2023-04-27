package model;

public class ControlPanel extends Component {
    public ControlPanel(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {}
}