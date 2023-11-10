public class Student implements Comparable {
    private int idNumber;
    private int GPA;

    public Student(int idNumber, int GPA) {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "idNumber=" + idNumber + ", GPA=" + GPA + '}';
    }
    public int getidNumber() {
        return idNumber;
    }
    public void setidNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public int getGPA() {
        return GPA;
    }
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student))
            throw new IllegalArgumentException("Объект не является студентом!");
        return this.idNumber - ((Student) o).idNumber;
    }
}
