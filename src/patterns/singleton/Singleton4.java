package patterns.singleton;

/**
 * Паттерн Singleton1 гарантирует,
 * что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4(){}

    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;

    }

}
