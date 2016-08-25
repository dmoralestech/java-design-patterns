package command;

/**
 * Created by darwinmorales on 25/08/2016.
 */
public interface Command {
    public void execute();

    default String test() {
        return "Hello";
    }
}
