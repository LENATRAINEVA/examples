package patterns.singleton;

/**
 * Паттерн Singleton1 гарантирует,
 * что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 */
public class Singleton5 {

    private static volatile Singleton5 instance;

    private Singleton5(){}

    public static synchronized Singleton5 getInstance(){
        if(instance == null){
            synchronized (Singleton5.class){
                if(instance == null)
                instance = new Singleton5();
            }
        }
        return instance;

    }

}
