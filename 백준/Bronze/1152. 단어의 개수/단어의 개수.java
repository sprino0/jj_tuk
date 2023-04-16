import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str; 
        int cnt = 0;
        str = input.nextLine();
        for(int j = 0; j < str.length(); j ++){
             if(str.charAt(j) == ' '){ cnt++;}
        }
        if(str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' '){
            cnt = cnt + 1;
        }
        if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
            cnt = cnt - 1;
        }
        System.out.println(cnt);
    }
}