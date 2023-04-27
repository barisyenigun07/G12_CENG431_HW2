package app;


public class SmartHomeSimulationApp {
    public static void main(String[] args) throws InterruptedException {
        SmartHomeMediator mediator = new SmartHomeMediator();

        TemperatureSensor tempSensor = new TemperatureSensor(mediator);
        LightSensor lightSensor = new LightSensor(mediator);
        MotionSensor motionSensor = new MotionSensor(mediator);

        Thermostat thermostat = new Thermostat(mediator);
        LightBulb lightBulb = new LightBulb(mediator);
        DoorLock doorLock = new DoorLock(mediator);

        ControlPanel controlPanel = new ControlPanel(mediator);

        int simulationDuration = 20;
        for (int i = 0; i < simulationDuration; i++) {
            int temp = tempSensor.getTemperature();
            controlPanel.send("SET_TEMPERATURE " + temp);

            if (lightSensor.isBright()) {
                controlPanel.send("TURN_OFF_LIGHT");
            } else {
                controlPanel.send("TURN_ON_LIGHT");
            }

            if (motionSensor.isMovementDetected()) {
                controlPanel.send("UNLOCK_DOOR");
            } else {
                controlPanel.send("LOCK_DOOR");
            }

            Thread.sleep(1000);
        }
    }
}

