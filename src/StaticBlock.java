public class StaticBlock {

    private static StaticBlock StaticBlock;

    static {
        try {
            StaticBlock = new StaticBlock();
        }catch(Exception e) {

        }
    }
    private StaticBlock() {}


    public static StaticBlock getStaticBlock(){
        return StaticBlock;
    }

     public void staticTest(){
        System.out.println("statik blok çalıştı");
     }
}
