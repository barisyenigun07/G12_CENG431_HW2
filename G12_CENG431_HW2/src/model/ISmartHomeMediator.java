package model;

public interface ISmartHomeMediator {
    void send(String message, Component sender);
    void register(Component component);
}

