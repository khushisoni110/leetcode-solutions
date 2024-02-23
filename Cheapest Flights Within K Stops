class Solution {
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        
        /** Adj. List **/
        Map<Integer, Map<Integer, Integer>> pricesAdjList = new HashMap<>();
        for (int[] f : flights) {
           if (!pricesAdjList.containsKey(f[0])) pricesAdjList.put(f[0], new HashMap<>());
            pricesAdjList.get(f[0]).put(f[1], f[2]);
        }
        
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        pq.add(new int[] {0, src, K + 1});
        while (!pq.isEmpty()) {
            int[] top = pq.remove();
            int price = top[0];
            int city = top[1];
            int stops = top[2];
            if (city == dst) return price;
            if (stops > 0) {
                Map<Integer, Integer> adj = pricesAdjList.getOrDefault(city, new HashMap<>());
                for (int a : adj.keySet()) {
                    pq.add(new int[] {price + adj.get(a), a, stops - 1});
                }
            }
        }
        return -1;
    }
}
