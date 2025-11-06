public class background {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Running job step " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        };

        Thread worker = new Thread(task);
        worker.start();
    }
}
