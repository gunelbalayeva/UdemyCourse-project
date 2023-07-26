package udemyCourse_project;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student extends Person {
    private ArrayList<Course> studentCourse;
    private LinkedList<Lesson> followLessonList_;


    public Student(String name, String inputText, String useNname) {
        super(name, inputText, useNname);
        studentCourse = new ArrayList<>();
        followLessonList_ = new LinkedList<>();
    }

    public ArrayList<Course> getStudentCourse() {
        return studentCourse;
    }

    public LinkedList<Lesson> getFollowLessonList_() {
        return followLessonList_;
    }

    @Override
    public String toString() {
        super.toString();
        return "The student's course: " + studentCourse;
    }

    public void joinTheCourse(Course javaCourse) {
        if (javaCourse.courseControl()) {
            javaCourse.getCourseStudents().add(this);
            studentCourse.add(javaCourse);
            System.out.println(this.getName() + " Java user attended the course.");
        } else {
            System.out.println(javaCourse.getCourseName() + " course not available.");
        }
    }

    public void followLessonListAdd(Lesson followLessonList) {
        boolean lessonFound = false;
        if (studentCourse.size() > 0) {
            for (Course c : studentCourse) {
                c.getCourseLessons().contains(followLessonList);
                System.out.println("Follow list : " + followLessonList.getLessonTitle());
                followLessonList_.add(followLessonList);
                lessonFound = true;
                break;
            }
        }
        if (!lessonFound) {
            System.out.println("Lesson not available");
        }

    }
}
