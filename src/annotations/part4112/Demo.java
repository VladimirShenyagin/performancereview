package annotations.part4112;

@DemoClassAnnotation("test class annotation")
public class Demo {

    @DemoFieldAnnotation("test field annotation")
    String someField;
    @DemoMethodAnnotation("Test method annotation")
    public void testMethod() {
        System.out.println("test");
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException{
        System.out.println(Demo.class.isAnnotationPresent(DemoClassAnnotation.class));
        System.out.println(Demo.class.getDeclaredField("someField").isAnnotationPresent(DemoFieldAnnotation.class));
        System.out.println(Demo.class.getMethod("testMethod").isAnnotationPresent(DemoMethodAnnotation.class));
    }
}


