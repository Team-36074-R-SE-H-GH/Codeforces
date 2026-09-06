import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Scanner allows the program to read user input
        Scanner scanner = new Scanner(System.in);
        int n;
        int x = 0;
        n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            String thing = scanner.nextLine();
            if(thing.equals("X++")||thing.equals("++X")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
}