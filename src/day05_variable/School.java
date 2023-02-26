package day05_variable;

public class School {
    public static void main(String[] args) {

 /*
    Task:
        class name: School
        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5
            - > total number of students in your school
            number of days in a year (have some half day = ~ 100.5)
            number of snow days in a year (double)
            average gpa in school (3.5) [ranges 1.0 - 4.0]
            print all of the variables with unique messages
*/
        int grade1 = 15;
        int grade2= 12;
        int grade3 = 33;
        int grade4 = 44;
        int grade5 = 55;
        int totalNumberStudents = grade1 + grade2+ grade3 + grade4 + grade5;
        double numberOfDaysInYear = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGpaNumber = 3.5;

        System.out.println(" number of the student grade1 = "+grade1);

        System.out.println(" number of the student grade2 = "+grade2);

        System.out.println(" number of the student grade3 = "+grade3);

        System.out.println(" number of the student grade4 = "+grade4);

        System.out.println(" number of the student grade4 = "+grade5);

        System.out.println("totalNumberStudents = " + totalNumberStudents);

        System.out.println("total number of days in the year:" + numberOfDaysInYear);

        System.out.println("number snow days  " + numberOfSnowDays );

        System.out.println("average Gpa  " +  averageGpaNumber);
    }
}
