public class LazySingleton {

    private static LazySingleton LazySingleton;
    private LazySingleton() {}


    // not thread safe
    public  static LazySingleton getLazySingleton(){
        if(LazySingleton== null) {
            LazySingleton = new LazySingleton();
        }
        return LazySingleton;
    }

    public void LazyTest(){
        System.out.println("Lazy singleton çalıştı");
    }
}
