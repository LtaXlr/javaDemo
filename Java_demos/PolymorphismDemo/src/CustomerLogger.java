public class CustomerLogger {
    private BaseLogger baseLogger;
    public CustomerLogger(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }
    public void add(){
        System.out.println("müşteri eklendi");
        baseLogger.log("loglandı");
    }
}
