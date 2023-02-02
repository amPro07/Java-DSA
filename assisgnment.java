public class assisgnment {
    public static void main(String[] args) {
        int h[] = {4,2,0,3,2,5};
        trappedWater(h);
    }

    private static void trappedWater(int[] h) {
        int ls[] = new int[h.length], rs[] = new int[h.length];
        int n = h.length, tp=0;
        ls[0] = h[0];
        for(int i=1; i<=n-1; i++){
            ls[i] = Integer.max(ls[i-1], h[i]);
        }
        
        rs[n-1] = h[n-1];
        for(int i=n-2; i>=0; i--){
            rs[i]=Integer.max(h[i], rs[i+1]);
        }

        for(int i=0; i<h.length; i++){
            int wl = Integer.min(ls[i], rs[i]);
            tp +=wl - h[i];
        }
        System.out.println(tp);
    }
}
