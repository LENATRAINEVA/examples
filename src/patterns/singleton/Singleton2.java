package patterns.singleton;


/**
 * Паттерн Singleton1 гарантирует,
 * что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 * (Для многопоточных приложений)
 */
public class Singleton2 {

    private static Singleton2 instance = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return instance;
    }

}
