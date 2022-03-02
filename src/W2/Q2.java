package W2;

public class Q2 {

    static int countVowels(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                num++;
        }
        return num;
    }

    public static void main (String[]args){
        String s = "astronaut";
        int count = countVowels(s);
        System.out.println("Number of count: " + count);
    }

}
