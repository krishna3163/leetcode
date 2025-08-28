import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: Collect numbers from diagonals into map
        // key = (i - j), value = list of numbers in that diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(grid[i][j]);
            }
        }

        // Step 2: Sort each diagonal according to rules
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            if (key >= 0) {
                // bottom-left triangle (including main diagonal)
                list.sort(Collections.reverseOrder()); // descending
            } else {
                // top-right triangle
                Collections.sort(list); // ascending
            }
        }

        // Step 3: Place numbers back into grid in sorted order
        Map<Integer, Integer> idx = new HashMap<>(); // track position used in each list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                int pos = idx.getOrDefault(key, 0);
                grid[i][j] = map.get(key).get(pos);
                idx.put(key, pos + 1);
            }
        }

        return grid;
    }
}
