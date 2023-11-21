class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android is calling.");
    }

    @Override
    public void sms() {
        System.out.println("Android is sending SMS.");
    }

    @Override
    public void internet() {
        System.out.println("Android is browsing the internet.");
    }

    @Override
    public void runTerminal() {
        System.out.println("Android is running terminal.");
    }
}