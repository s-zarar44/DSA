class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int i = 0;
        int j = 0;
        int max = 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < n) {
            int curr = fruits[j];
            if (map.size() <= 2) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
            }

            while (map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i])-1);
                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }
                i++;
            }

            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}