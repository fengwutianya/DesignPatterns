package command.abstractClasses;

/**
 * Created by xuan on 4/12/17.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
