import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        ArrayList<String> list = getPath(1,1,3,3);
        System.out.println(list);
    }
    public static ArrayList<String> getPath(int sc, int sr, int m, int n){
        if(sc == n && sr == m){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>(); 
        if(sc < n){
            hpaths = getPath(sc+1, sr, m, n);
        }
        if(sr < m){
            vpaths = getPath(sc, sr+1, m, n);
        }
        ArrayList<String> paths = new ArrayList<>();

        // horizontal paths
        for(String path : hpaths){
            paths.add("h"+path);
        }
        // vertical paths
        for(String path : vpaths){
            paths.add("v"+path);
        }

        return paths;
    }
}
