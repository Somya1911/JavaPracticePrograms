import java.util.Scanner;
import java.util.Arrays;

class Email {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email= scanner.next();
        System.out.println(Arrays.toString(email.split("@")));
    }}


       