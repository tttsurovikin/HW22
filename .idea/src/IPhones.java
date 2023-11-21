class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("iPhone is calling.");
    }

    @Override
    public void sms() {
        System.out.println("iPhone is sending SMS.");
    }

    @Override
    public void internet() {
        System.out.println("iPhone is browsing the internet.");
    }

    @Override
    public void appStore() {
        System.out.println("iPhone is accessing the App Store.");
    }
}
