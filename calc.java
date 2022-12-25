import java.util.Scanner;

public class calc {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Percentage Calculator");
        System.out.println("Enter English Marks:");
        float English = sc.nextFloat();
        System.out.println("Enter Maths Marks:");
        float Maths = sc.nextFloat();
        System.out.println("Enter Science Marks:");
        float Science = sc.nextFloat();
        System.out.println("Enter History Marks:");
        float History = sc.nextFloat();
        System.out.println("Enter CS Marks:");
        float CS = sc.nextFloat();
        float Total = (English+Maths+Science+History+CS);
        float Percent = (Total/500)*100;
        System.out.println(Percent);
    }
}
