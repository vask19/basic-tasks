package paterns.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = BankLogger.getInstance();
        logger.addLog("1111");
        logger.addLog("2222");
        logger.getLogs();
        logger.addLog("333");
        logger.getLogs();
    }
}
