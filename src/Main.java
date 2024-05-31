import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        CoursefurManager manager = new CoursefurManager();
        Course course1 = manager.createCourse("Java Programming", LocalDate.of(2024, 1, 1), StudyFormat.ONLINE);
        System.out.println("Kurs-1 erstellt: " + course1.getName());
        Course course2 = manager.createCourse("JavaScript Programming", LocalDate.of(2024, 2, 3), StudyFormat.OFFLINE);
        System.out.println("Kurs-2 erstellt: " + course2.getName());


        Course retrievedCourse1 = manager.getCourseById(course1.getId());
        System.out.println("Kurs-1 abgerufen: " + retrievedCourse1.getName());


        Course retrievedCourse2 = manager.getCourseById(course2.getId());
        System.out.println("Kurs-2 abgerufen: " + retrievedCourse2.getName());

        manager.updateCourse(course1.getId(), "Python Programming", LocalDate.of(2024, 3, 2), StudyFormat.OFFLINE);
        System.out.println("Kurs-1 update : " + manager.getCourseById(course1.getId()).getName());
        manager.deleteCourse(course2.getId());
        System.out.println("Kurs-2 deleted: " + (manager.getCourseById(course2.getId()) == null));
        Course newCourse = manager.createCourse("C++ Programming", LocalDate.of(2024, 5, 1), StudyFormat.OFFLINE);
        System.out.println("New kurs created: " + newCourse.getName());


        }

}