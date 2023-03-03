public class ThreadSafe {

    private static ThreadSafe ThreadSafe;
    private ThreadSafe(){}

    // synchronized means can use multithread
    public static synchronized ThreadSafe getThreadSafe() {

        if(ThreadSafe == null) {
            ThreadSafe = new ThreadSafe();
        }
        return ThreadSafe;
    }

    public void ThreadTest(){
        System.out.println("Thread safe init çalıştı");
    }

}
