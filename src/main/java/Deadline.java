public class Deadline extends Task{
    protected String dueDate;
    Deadline(String description, String dueDate){
        super(description);
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String toString(){
        return "[D]" + super.toString() + " (by: " + this.getDueDate() + ")";
    }
}
