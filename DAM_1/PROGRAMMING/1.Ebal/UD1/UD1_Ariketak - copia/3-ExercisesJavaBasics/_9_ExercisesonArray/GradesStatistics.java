package _9_ExercisesonArray;


import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {

        final int students;
        int[] grades;
        float average = 0;
        int min = 100, max = 0;
        
        System.out.printf("Enter the number of the students:\n");
        Scanner in = new Scanner(System.in);
        students = in.nextInt();

        grades = new int[students];
        
        if (grades.length > 0) {
      
            for (int i = 0; i < grades.length; ++i) 
            {  // Read all items
                System.out.printf("Enter a number (%d):\n", i+1);
                grades[i] = in.nextInt();
                average = average + grades[i];
                if(grades[i] <= min)
                {
                    min = grades[i];
                }
                if(grades[i] >= max)
                {
                    max = grades[i];
                }
            }
        }
        in.close();
        System.out.println();
        average = average / students;
        
        System.out.printf("The average is: %.2f \n", average);
        System.out.printf("The minimun is: %d\n", min);
        System.out.printf("The maximun is: %d\n", max);
        
    }
}
