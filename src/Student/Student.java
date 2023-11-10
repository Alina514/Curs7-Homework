package Student;

public class Student {
    private final String name;
    private final double grade;

    private static double totalGrades = 0.0;
    private static int numberOfStudents = 0;

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }


    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        numberOfStudents++;
    }

    public static double calculateAverageGrade(){
        if(numberOfStudents == 0){
            return 0.0;
        }
        return totalGrades / numberOfStudents;
    }
}
