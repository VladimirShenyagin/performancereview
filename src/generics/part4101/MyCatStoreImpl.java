package generics.part4101;

import generics.part4101.animal.cat.BigCat;
import generics.part4101.animal.cat.Cat;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;

public class MyCatStoreImpl implements MyObjectStore<String, BigCat> {

    @Override
    public void put(String key, BigCat value) {

    }

    @Override
    public BigCat get(String key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends BigCat> entries) {

    }


    @Override
    public Collection<BigCat> getAll(Predicate<? super BigCat> p) {
        return null;
    }
}
