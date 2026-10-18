class Solution {
    public char next(char c) {
        if (c == 'R') return 'B';
        if (c == 'B') return 'W';
        return 'R';
    }
    public int findColoredRoot(int[][] edges, String colors) {
        int n = colors.length();
        int[] indeg = new int[n];
        int[] deg = new int[n];

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            deg[u]++;
            deg[v]++;

            char cu = colors.charAt(u);
            char cv = colors.charAt(v);

            if (next(cu) == cv) indeg[v]++;
            else if (next(cv) == cu) indeg[u]++;
            else return -1;
        }

        int root = -1;

        for (int i = 0; i < n; i++) {
            if (indeg[i] >= 2) return -1;
            if (indeg[i] == 0) root = i;
        }

        if (deg[root] > 2) return -1;
        return root;
    }
}