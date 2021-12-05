package generics.oracle_generic_practice;
//=== Question: What is the following class converted to after type erasure? ===
class Pair<K, V> {
  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() { return key; }
  public V getValue() { return value; }

  public void setKey(K key)     { this.key = key; }
  public void setValue(V value) { this.value = value; }

  private K key;
  private V value;
}

//=== ANSWER ===
class PairAnswer<K, V> {
  public PairAnswer(Object key, Object value) {
    this.key = key;
    this.value = value;
  }

  public Object getKey()   { return key; }
  public Object getValue() { return value; }

  public void setKey(Object key)     { this.key = key; }
  public void setValue(Object value) { this.value = value; }

  private Object key;
  private Object value;
}
public class Erasure1 {

}