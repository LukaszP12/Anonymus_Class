// Anonymous Inner class that implements a interface

public class MyThread1 {
    public static void main(String[] args){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Child Thread");
            }
        };
        Thread thread = new Thread(r);
        thread.start();
        System.out.println("Main thread");
    }
}
