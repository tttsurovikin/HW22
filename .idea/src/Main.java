public class Main {
    public static void main(String[] args) {
    Androids androidPhone = new Androids();
    iPhones iPhone = new iPhones();

    System.out.println("=== Android Phone ===");
    androidPhone.call();
    androidPhone.sms();
    androidPhone.internet();
    androidPhone.runTerminal();

    System.out.println("\n=== iPhone ===");
    iPhone.call();
    iPhone.sms();
    iPhone.internet();
    iPhone.appStore();
    }
}
