package model;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeMediator implements ISmartHomeMediator {
    private List<Component> components;

    public SmartHomeMediatorImpl() {
        components = new ArrayList<>();
    }

    @Override
    public void send(String message, Component sender) {
        for (Component component : components) {
            if (component != sender) {
                component.receive(message);
            }
        }
    }

    @Override
    public void register(Component component) {
        components.add(component);
    }
}
