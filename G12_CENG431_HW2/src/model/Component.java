package model;

public abstract class Component {
    protected SmartHomeMediator mediator;

    public Component(SmartHomeMediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

