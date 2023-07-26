package udemyCourse_project;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Lesson> courseLessons;
    private ArrayList<Teacher> courseTeachers;
    private boolean broadcasting;
    private ArrayList<Student> courseStudents;


    public Course(String lessonName, Teacher mainTeacher) {
        this.courseName = lessonName;
        this.courseLessons = new ArrayList<>();
        this.courseTeachers = new ArrayList<>();
        this.courseStudents = new ArrayList<>();
        courseTeachers.add(0, mainTeacher);
        this.broadcasting = true;

    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Lesson> getCourseLessons() {
        return courseLessons;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }


    public void courseAddTeacher(Teacher newTeacher) {
        if (!courseTeachers.contains(newTeacher)) {
            courseTeachers.add(newTeacher);
            System.out.println(newTeacher.getName() + " the teacher has been added to the course list.\n");
        } else {
            System.out.println(newTeacher.getName() + " is already available.");
        }
    }


    public void removeTeacher(Teacher removeTeacher) {
        if (removeTeacher.getName().equals(courseTeachers.get(0).getName())) {
            System.out.println(removeTeacher.getName() + " the main teacher of the course cannot be removed from the list\n");
        } else {
            courseTeachers.remove(removeTeacher);
            System.out.println(removeTeacher.getName() + " the course teacher has been removed from the list.\n");
        }
    }

    public void addCourseLessons(Lesson addLesson) {
        courseLessons.add(addLesson);
    }

    public int theNumberOfLessonsInTheCourse() {
        return courseLessons.size();
    }

    private double totalMinutesOfTheCourse() {
        double totalOfMinutes = 0;
        for (Lesson lesson : courseLessons) {
            totalOfMinutes += lesson.getMinute();
        }
        return totalOfMinutes;
    }

    public boolean courseControl() {
        if (courseLessons.size() >= 5 && theNumberOfLessonsInTheCourse() >= 60) {
            broadcasting = true;
            return true;
        } else return false;
    }
}
