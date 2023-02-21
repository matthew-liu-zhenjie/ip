package duke;

import duke.task.TaskList;
import duke.parser.Parser;
import duke.ui.Ui;

public class Duke {

    private final TaskList tasks;
    private final Ui ui;
    private final Parser parser;
    public Duke (){
        ui = new Ui();
        tasks = new TaskList();
        parser = new Parser();
    }
    public void run(){
        ui.showWelcome();
        boolean isExit = false;
        while(!isExit){
            String fullCommand = ui.getUserCommand();
            parser.parseInput(fullCommand, tasks);
            if (fullCommand.equalsIgnoreCase("bye")){
                isExit = true;
            }
        }
    }

    public static void main(String[]args){
        new Duke().run();
    }

}