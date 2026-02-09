import java.util.ArrayList;

public class stairPath {
    public static void main(String[] args) {
        ArrayList<String> list = getStair(3);
        System.out.println(list);
    }
    public static ArrayList<String> getStair(int n){
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(n < 0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> p1 = getStair(n-1); // line 1
        ArrayList<String> p2 = getStair(n-2); // line 2
        ArrayList<String> p3 = getStair(n-3); // line 3
        ArrayList<String> paths = new ArrayList<>();

        for(String path : p1){
            paths.add(1+""+path);
        }
        for(String path : p2){
            paths.add(2+""+path);
        }
        for(String path : p3){
            paths.add(3+""+path);
        }
        
        return paths;
    }
}
