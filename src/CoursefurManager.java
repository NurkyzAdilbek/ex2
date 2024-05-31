import java.time.LocalDate;

public class CoursefurManager {
    private Course[] courses = new Course[10];
    private int courseCount = 0;
    private Long neuId = 1L;


    public Course createCourse(String name, LocalDate duration, StudyFormat studyFormat) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                Course course = new Course(neuId++, name, duration, studyFormat);
                courses[i] = course;
                return course;
            }
        }
        return null;
    }



    public Course getCourseById(Long id) {
        for (Course course : courses) {
            if (course != null && course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }


    public boolean updateCourse(Long id, String name, LocalDate duration, StudyFormat studyFormat) {
        Course course = getCourseById(id);
        if (course != null) {
            course.setName(name);
            course.setDuration(duration);
            course.setStudyFormat(studyFormat);
            return true;
        }
        return false;
    }
    public boolean deleteCourse(Long id) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].getId().equals(id)) {
                courses[i] = null;
                return true;
            }
        }
        return false;
    }


}
