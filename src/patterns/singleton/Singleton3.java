package patterns.singleton;

/**
 * Паттерн Singleton1 гарантирует,
 * что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 * (С левой инициализацией)
 */
public class Singleton3 {

   private Singleton3(){}

   private static class SingletonHolder{
        private static Singleton3 instance = new Singleton3();
   }

   public static Singleton3 getInstance(){
       return SingletonHolder.instance;
   }

}
