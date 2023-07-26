package udemyCourse_project;

public class Lesson {
    private int lessonNo;
    private String lessonTitle;
    private double minute;

    public Lesson(int lessonNo, String lessonTitle, int minute) {
        this.lessonNo = lessonNo;
        this.lessonTitle = lessonTitle;
        this.minute = minute;
    }

    public int getLessonNo() {
        return lessonNo;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public double getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return " lesson no: " + lessonNo + " Lesson title:" +
                ", lessonTitle: " +
                " minute: " + minute;
    }
}
