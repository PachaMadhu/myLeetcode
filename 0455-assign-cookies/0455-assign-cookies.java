class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        int l=0;
        int r=0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(l<n && r<m){
            if(s[l]>=g[r]){
                r++;
            }
            l++;
        }

        return r;
    }
}