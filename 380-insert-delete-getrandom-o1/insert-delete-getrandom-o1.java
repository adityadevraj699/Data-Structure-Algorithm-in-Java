class RandomizedSet {

    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random random;

    public RandomizedSet() {
        list = new ArrayList<Integer>();
        map = new HashMap<>(); 
        random = new Random();  
    }
    
    public boolean insert(int val) {

        if(!map.containsKey(val)){
                 list.add(val);
                 map.put(val,list.size()-1);
                 return true; 
        }
        return false;
     

    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){

            int index= map.get(val);
            int last = list.get(list.size()-1);

            if(index !=list.size()-1){
                list.set(index,last);
                map.put(last,index);
            }
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
        return false;
        
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());

        return list.get(index);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */