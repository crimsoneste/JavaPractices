import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object n, Object m) {
        if(!(n instanceof Student && m instanceof Student))
            throw new IllegalArgumentException("Объекты не являются студентами!");

        return ((Student) n).getGPA() - ((Student) m).getGPA();
    }
}
