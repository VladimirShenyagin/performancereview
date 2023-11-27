package oop.part12;

import java.util.ArrayList;
import java.util.List;

//Рассказать про наследование, инкапсуляцию, полиморфизм
public class Demo {
    public static void main(String[] args) {

        List<A> tList = new ArrayList<>();
        A a = new A();
        B b = new B();
        C c = new C();
        a.inheritedOutput();
        b.inheritedOutput();//наследованный метод
        a.publicMethodCall(); //публичный метод класса, вызов приватных классов изнутри публичного метода
//        a.privateMethod(); //Инкапсуляция, сокрытие реализации, недоступный метод
        tList.add(a);
        tList.add(b);
        tList.add(c);
        tList.forEach(A::output);//использование переопределённого метода, полиморфизм
    }
}
