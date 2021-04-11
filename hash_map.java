import java.util.LinkedList;
public class hashmap<Key extends Comparable<? super Key>, Value>{
    
    private int capacity;                                            // размер списка
    private static final float DEFAULT_LOAD_FACTOR = 2.0f;           // максимальный уровень загруженности
    private int numOfElements;                                       // число элементов
    private int numOfLists;                                          // число списков
    private LinkedList<Pair>[] elements;                             // список элементов
    private float loudFactor;                                        // уровень загруженности, если нужно изменить DEFAULT_LOAD_FACTOR

    // класс пара ключ-значение
    private class Pair{
        private Key key;
        private Value value;

        public Pair(Key key, Value value){ 
            this.key = key;
            this.value = value;
        }

        public Key getKey() { return key; }
        public Value getValue() { return value; }
        public void setValue(Value value) { this.value = value; }
        public boolean hasSameKey(Key key) {return this.key == null ? this.key == key : this.key.equals(key); }
    }


    @SuppressWarnings("unchecked")
    public hashmap(int capacity){ 
        this.capacity = capacity;
        this.elements = (LinkedList<Pair>[]) new LinkedList[capacity];
    }

    public int getNumOfElements(){ return numOfElements;}                                            // возвращает число элементов
    public float getLoudFactor(){ return (loudFactor == 0.0f) ? DEFAULT_LOAD_FACTOR : loudFactor;}   // возвращает уровень загруженности


    // удаление всех элементов
    public void deleteAllElements(){}

    // добавление пары ключ-значение
    public Value addPair(Key key, Value value){

        return null;
    }

    // получение элемента по ключу
    public Value getValue(Key key) { return null; }

    // удаление пары по ключу
    public Value deleteElement(Key key){ return null;}

    // изменение уровня загруженности
    public void changeLoudFacktor(float newLoudFacktor){}

    // получение текущего уровня загруженности
    public float getPresentLoudFacktor(){ return (float) numOfElements/numOfLists;}

    // перехэширование
    public void rehash(){}



    
}
