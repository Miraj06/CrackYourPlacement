class RandomizedCollection {
    List <Integer>list;
    HashMap<Integer, Set<Integer>> map;

    public RandomizedCollection() {
        list=new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val, new HashSet<>());
        }

        map.get(val).add(list.size());
        list.add(val);
        
        return map.get(val).size()==1;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val) || map.get(val).isEmpty()){
             return false;
        }

        int delete = map.get(val).iterator().next();
        map.get(val).remove(delete);

        int lastElement = list.get(list.size() - 1);
        list.set(delete, lastElement);

        map.get(lastElement).add(delete);
        map.get(lastElement).remove(list.size() - 1);

        list.remove(list.size() - 1);

        return true;
    }
    
    public int getRandom() {
         int randomValue = (int) (Math.random() * list.size());
        return list.get(randomValue);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
