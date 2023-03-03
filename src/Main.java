public class Main {
    public static void main(String[] args) {
        SingletonExample.getInstance().singletonTest();
        StaticBlock.getStaticBlock().staticTest();
        LazySingleton.getLazySingleton().LazyTest();
        ThreadSafe.getThreadSafe().ThreadTest();

    }
}