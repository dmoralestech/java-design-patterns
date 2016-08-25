package command;

/**
 * Created by darwinmorales on 25/08/2016.
 */
public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("light is on. " + location);

    }

    public void off() {
        System.out.println("light is off. " + location);
    }
}
