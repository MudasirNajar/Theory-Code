package multithreading;


import static java.lang.Thread.sleep;

class ChromeTab extends Thread {

    //We are overriding class Thread's run() method
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Chrome: " + i);
            try {
                sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ChromeTab2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Chrome2: " + i);
            try {
                sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ChromeTab chromeTab = new ChromeTab();
        chromeTab.start();

        //In order to declare second thread
        Thread thread = new Thread(new ChromeTab2());
        thread.start();

        //This will be for execution of main thread
        for (int i = 1; i <= 10; i++) {
            sleep(1);
            System.out.println("Main tab: " + i);
        }
    }
}

