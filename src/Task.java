public class Task {
    private final String title;
    Course course;
    String deadline;
    int priority;

    Task(String title, Course course, String deadline, int priority){
       this.title = title;
       this.course = course;
       this.deadline = deadline;
       this.priority = priority;
    }
    public String getTitle(){
        return title;
    }
}
