public class Singleton {
    private static Singleton() {
    }

    private static Singleton instance = null;

    public static getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
