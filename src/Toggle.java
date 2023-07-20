import java.util.*;
public class Toggle {
    public static int Togg(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
                res.append(c);
            }else{
                c = Character.toUpperCase(c);
                res.append(c);
            }
        }
        System.out.println(res);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Togg(s);
    }
}