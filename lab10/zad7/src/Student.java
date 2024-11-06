public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private String index_nr;

    public Student(String name, String surname, String index_nr) {
        this.name = name;
        this.surname = surname;
        this.index_nr = index_nr;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIndex_nr() {
        return index_nr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIndex_nr(String index_nr) {
        this.index_nr = index_nr;
    }

    @Override
    public int compareTo(Student o) {
        Student that = (Student) o;
        return this.getIndex_nr().compareTo(that.getIndex_nr());
    }
}