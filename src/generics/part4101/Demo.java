package generics.part4101;

import generics.part4101.animal.Animal;
import generics.part4101.animal.cat.BigCat;
import generics.part4101.animal.cat.Cat;
import generics.part4101.animal.cat.VeryBigCat;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        MyObjectStore<String, BigCat> myCatStore = new MyCatStoreImpl();

        Map<String, Cat> catMap = new HashMap<>();
        Map<String, VeryBigCat> veryBigCatHashMap = new HashMap<>();

        Predicate<VeryBigCat> veryBigCatPredicate = veryBigCat -> true;
        Predicate<Cat> catPredicate = cat -> true;

//        myCatStore.putAll(catMap);
        myCatStore.putAll(veryBigCatHashMap);
//        myCatStore.getAll(veryBigCatPredicate);
        myCatStore.getAll(catPredicate);


    }
}
