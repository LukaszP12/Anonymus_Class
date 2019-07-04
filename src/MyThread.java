//Anonymous Inner class that extends a class

public class MyThread {
    public static void main(String[] args){
        //Anonymus Inner Class that extends a class i.e. a thread class
        Thread t = new Thread()
        {
            public void run()
            {
                System.out.println("Child thread");
            }
        };
        t.start();
        System.out.println("Main Thread");

    }
}
