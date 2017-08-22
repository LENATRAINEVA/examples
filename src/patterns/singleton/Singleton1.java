package patterns.singleton;

/**
 * Паттерн Singleton1 гарантирует,
 * что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 * (Для однопоточных приложений)
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
    return instance;

    }
}
