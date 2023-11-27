package generics.part4101;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;

public interface MyObjectStore<K, V> {
    void put(K key, V value);
    V get(K key);
    void putAll(Map<? extends K, ? extends V> entries);
    Collection<V> getAll(Predicate<? super V> p);
}
