package model;

//TemperatureSensor.java
import java.util.Random;

public class TemperatureSensor extends Component {
 public TemperatureSensor(SmartHomeMediator mediator) {
     super(mediator);
 }

 @Override
 public void send(String message) {
     mediator.send(message, this);
 }

 @Override
 public void receive(String message) {}

 public int getTemperature() {
     Random random = new Random();
     return 15 + random.nextInt(10);
 }
}