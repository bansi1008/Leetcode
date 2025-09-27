class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> f = new HashMap<>();
        for (String word : words) {
            f.put(word, f.getOrDefault(word, 0) + 1);
        }

         PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> f.get(a).equals(f.get(b)) ? b.compareTo(a) : f.get(a) - f.get(b)
        );
        for (String word : f.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) res.add(pq.poll());

        Collections.reverse(res);

        return res;

        
    }
}