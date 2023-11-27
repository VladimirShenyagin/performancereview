package core.part455;

import java.util.concurrent.Callable;

public class Demo {


    public static void main(String[] args) {
        Callable<Integer> nonCapturing = () -> 10;
        int methodVariable = 5;
        Callable<Integer> capturingWithMethodVariable = () -> 10 + methodVariable;

        Demo v = new Demo();
        Callable<Integer> capturingWithMethodInvocation = v::instanceMethod;

        System.out.println(nonCapturing);
        System.out.println(capturingWithMethodVariable);
        System.out.println(capturingWithMethodInvocation);
    }

    private int instanceMethod() {
        return 10;
    }
}
