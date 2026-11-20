public class HelloDocker {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Java Docker Application Started!");

        while (true) {
            System.out.println("Container is running...");
            Thread.sleep(1000);
        }
    }
}

