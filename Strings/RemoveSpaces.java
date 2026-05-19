import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
