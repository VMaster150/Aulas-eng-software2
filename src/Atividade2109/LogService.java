package Atividade2109;

public class LogService {
    private static LogService INSTANCE;

    private LogService () {
        System.out.println("Registrando LOG no banco");
    }

    public static LogService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LogService();
        }
        return INSTANCE;
    }
    public static void registrarLog(String log) {
        System.out.println("LOG: " + log);
    }


}

