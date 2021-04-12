public class test_hashmap {
    public static void main(String[] args) {
        hash_map<Integer, Integer> map = new hash_map<Integer, Integer>();
        for (int i = 0; i < 50; i++) {
            map.addPair(i, i);
           // System.out.println("Pair: " + "key: " + i + " ---> " + "value: " + i + " added");
        }map.printHashMap();
        System.out.println("Текущий уровень загруженности: " + map.getPresentLoudFactor());
        for (int i = 0; i < 10; i++){
            map.deleteElement(i);
           // System.out.println("element " + i + " was deleted.");
        }
        map.printHashMap();
        System.out.println("Текущий уровень загруженности: " + map.getPresentLoudFactor());
    }
    
}
