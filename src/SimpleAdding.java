import java.util.Scanner;

public class SimpleAdding {
    int SimpleAddition(int num) {
        int totalSum = 0;
        if (num < 0 || num >= 1000)
            throw new IllegalArgumentException("Number cannot be less than zero nor greater than 1000");
        for (int n = 1; n <= num; n++)
            totalSum += n;
        return totalSum;
    }

    public static void main(String[] args) {
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter a number between 1 and 1000 down below:");
        int number = s.nextInt();
        */
        SimpleAdding simpleAdd = new SimpleAdding();
        System.out.println(simpleAdd.SimpleAddition(12));
    }
}