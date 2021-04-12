public class test_hashmap {
    public static void main(String[] args) {
        hash_map<Integer, Integer> map = new hash_map<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            map.addPair(i, i);
        }
        System.out.println(map.getPresentLoudFactor());
        map.printHashMap();
        for (int i = 10; i < 15; i++){
            map.addPair(i, i);
        }
    }
    
}
