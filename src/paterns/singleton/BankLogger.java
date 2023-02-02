package paterns.singleton;

public class BankLogger implements Logger{
    private static BankLogger bankLogger;

    private static StringBuilder log = new StringBuilder("///-----------\n\n");



    public synchronized static BankLogger getInstance(){
        if (bankLogger == null){
            bankLogger = new BankLogger();
        }
        return bankLogger;
    }

    private BankLogger(){

    }

    @Override
    public void getLogs() {
        System.out.println(log);
        System.out.println("///-----------\n\n");
    }

    @Override
    public void addLog(String log) {
        this.log.append(log);
    }
}
