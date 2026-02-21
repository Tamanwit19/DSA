package hashmaps;

import java.util.HashMap;

public class maxFreqCharacter {
    public static void main(String[] args) {
        String str = "bbbbcdvvvffffsdsdsdsd";

        HashMap<Character, Integer> hp = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // frequency mapping logic
            if(hp.containsKey(ch)){
                hp.put(ch, (hp.get(ch)+1));
            }else{
                hp.put(ch, 1);
            }
        }
        char key = ' ';
        int max = Integer.MIN_VALUE;
        for(char c : hp.keySet()){
            if(hp.get(c) > max){
                max = hp.get(c);
                key = c;
            }
        }

        System.out.println(key);
    }
}
