class RangeModule {
    TreeMap<Integer, Integer> map;


    public RangeModule() {
        map=new TreeMap<>();
        
    }
    
    public void addRange(int left, int right) {
            Integer start = map.floorKey(left);
        if (start != null && map.get(start) >= left) {
            left = start;
            right = Math.max(right, map.get(start));
            map.remove(start);
        }

       
        Integer next = map.ceilingKey(left);
        while (next != null && next <= right) {
            right = Math.max(right, map.get(next));
            map.remove(next);
            next = map.ceilingKey(left);
        }

        map.put(left, right);
    }
    
    public boolean queryRange(int left, int right) {
        Integer start = map.floorKey(left);
        return start != null && map.get(start) >= right;
        
    }
    
    public void removeRange(int left, int right) {
        Integer start = map.floorKey(left);
        if (start != null && map.get(start) > left) {
            int end = map.get(start);
            map.put(start, left);
            if (end > right) map.put(right, end);
        }

        Integer next = map.ceilingKey(left);
        while (next != null && next < right) {
            int end = map.get(next);
            map.remove(next);
            if (end > right) map.put(right, end);
            next = map.ceilingKey(left);
        }
        
    }
}

/**
 * Your RangeModule object will be instantiated and called as such:
 * RangeModule obj = new RangeModule();
 * obj.addRange(left,right);
 * boolean param_2 = obj.queryRange(left,right);
 * obj.removeRange(left,right);
 */