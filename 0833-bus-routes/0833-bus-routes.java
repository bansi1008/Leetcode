class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source==target) return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < routes.length; i++) {

            int m = routes[i].length;
            for (int j = 0; j < m; j++) {
                int stop = routes[i][j];
                map.putIfAbsent(stop, new ArrayList<>());
                map.get(stop).add(i);

            }
        }
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> vb = new HashSet<>();
        Set<Integer> vs = new HashSet<>();
        q.offer(source);
        vs.add(source);
        int min = 0;

        while (!q.isEmpty()) {
            int s = q.size();
            min++;
            for (int i = 0; i < s; i++) {
                int st = q.poll();
                if (!map.containsKey(st))
                    continue;
                for (int b : map.get(st)) {
                    if (vb.contains(b))
                        continue;
                    vb.add(b);

                    for (int stop : routes[b]) {
                        if (stop == target)
                            return min;
                        if (!vs.contains(stop)) {
                            q.offer(stop);
                            vs.add(stop);
                        }

                    }

                }
            }

        }
        return -1;

    }
}