class Restaurant {
    boolean ready = false;

    synchronized void produce() {
        System.out.println("Chef prepared food");
        ready = true;
        notify();
    }

    synchronized void consume() {
        while (!ready) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        new Thread(() -> r.consume()).start();
        new Thread(() -> r.produce()).start();
    }
}
