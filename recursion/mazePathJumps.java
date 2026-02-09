import java.util.ArrayList;

public class mazePathJumps {
    public static void main(String[] args) {
        ArrayList<String> list = getPath(1, 1, 3, 3);
        System.out.println(list);
    }
    public static ArrayList<String> getPath(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();
        ArrayList<String> dpath = new ArrayList<>();

        ArrayList<String> paths = new ArrayList<>();

        for(int k=1; sr+k <= dr; k++){
            hpath = getPath(sr+k, sc, dr, dc);
            for(String path : hpath){
                paths.add("h" + k + "" + path);
            }
        }
        
        for(int k=1; sc+k <= dc; k++){
            vpath = getPath(sr, sc+k, dr, dc);
            for(String path : vpath){
                paths.add("v" + k + "" + path);
            }
        }

        for(int k=1; sr+k <= dr && sc+k <= dc; k++){
            dpath = getPath(sr+k, sc+k, dr, dc);
            for(String path : dpath){
                paths.add("d" + k + "" + path);
            }
        }

        return paths;
    }
}
