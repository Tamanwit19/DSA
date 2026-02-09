public class maximize {
    public static void main(String[] args) {
        int[] arr = {12, 16, 18};
        int n = arr.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        // Step 1: Fill Prefix GCD
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            // Fill this in...
            pre[i] = get(pre[i-1], arr[i]);
        }

        // Step 2: Fill Suffix GCD
        suf[n-1] = arr[n-1];
        for (int i = n - 2; i >= 0; i--) {
            // Fill this in...
            suf[i] = get(suf[i+1], arr[i]);
        }

        // deletion logic 
        int max = 0;
        for(int i=0; i<n; i++){
            if(i==0){
                max = Math.max(max, suf[1]);
            }else if(i==n-1){
                max = Math.max(max, pre[n-2]);
            }else{
                int val = get(pre[i-1], suf[i+1]);
                max = Math.max(max, val);
            }

        }
        System.out.println(max);
    }
    public static int get(int a, int b){
        if(b==0){
            return a;
        }
        int r = get(b, a%b);
        return r;
    }
}