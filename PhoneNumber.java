import java.util.Scanner;

class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number in xx-xxx-xxxx : ");
        String number = scanner.next();

        System.out.print("Number in x-xxxx-xxxx: ");

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '-') {
                System.out.print(number.charAt(i));
            }

            if(i == 0 | i == 5){
                System.out.print("-");
            }
        }
    }
}