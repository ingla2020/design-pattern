package design.pattern.creational.singleton.o1;

public class Singleton {
    private static Singleton INSTANCE = null;

    // Private constructor suppresses 
    private Singleton(){}

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private static void createInstance() {
        if (INSTANCE == null) {
            // Solo se accede a la zona sincronizada
            // cuando la instancia no está creada
            synchronized(Singleton.class) {
                // En la zona sincronizada sería necesario volver
                // a comprobar que no se ha creado la instancia
                if (INSTANCE == null) { 
                    INSTANCE = new Singleton();
                }
            }
        }
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
}
