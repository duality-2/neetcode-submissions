class TimeMap {
    Map<String, List<String[]>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        this.map.putIfAbsent(key, new ArrayList<>());
        this.map.get(key).add(new String[] {value, String.valueOf(timestamp)});
    }

    public String get(String key, int timestamp) {
        String res = "";
        if (!this.map.containsKey(key))
            return res;
        List<String[]> list = this.map.get(key);
        int start = 0, end = list.size() - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (Integer.parseInt(list.get(mid)[1]) <= timestamp) {
                res = list.get(mid)[0];
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return res;
    }
}
