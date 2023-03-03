public class SingletonExample {

    private  static final SingletonExample instance=new SingletonExample();
    private SingletonExample() {}

    public static SingletonExample getInstance() {


        return  instance;
    }

    public void singletonTest() {
        System.out.println("Eager singleton method çalıştı");
    }

}
