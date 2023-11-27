package generics.part4101;

import java.util.function.Predicate;

public class CatPredicate<VeryBigCat> implements Predicate<VeryBigCat> {

    @Override
    public boolean test(VeryBigCat veryBigCat) {
        return false;
    }
}
