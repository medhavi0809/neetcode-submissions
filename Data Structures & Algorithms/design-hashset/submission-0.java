class MyHashSet {
private List<Integer> buckets;

    public MyHashSet() {
        buckets=new ArrayList<>();
        
    }
    public void add(int key) {
        if(!buckets.contains(key)){
        buckets.add(key);}
    }
    
    public void remove(int key) {
        buckets.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        if(buckets.contains(key)){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */