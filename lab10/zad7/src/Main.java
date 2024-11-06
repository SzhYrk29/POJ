import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student denys = new Student("Denys", "Novikov", "s30888");
        Student snizhana = new Student("Snizhana", "Yurko", "s29870");
        Student vitya =  new Student("Viktor", "Nagush", "s30894");
        Student katya = new Student("Ekaterina", "Levkovich", "s29858");
        Student kyrylo = new Student("Kyrylo", "Krainiuk", "s30022");

        Student[] students = {denys, snizhana, vitya, katya, kyrylo};
        System.out.println("Before sorting: ");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.getIndex_nr());

        }
        System.out.println();
        System.out.println("After sorting: ");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.getIndex_nr());

        }
    }
}