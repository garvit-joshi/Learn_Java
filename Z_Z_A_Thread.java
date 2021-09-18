class Loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class Z_Z_A_Thread {
    public static void main(String[] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}
/**
 * Second Method:creating Threads is implementing the Runnable interface.
 * Implement the run() method. Then, create a new Thread object, pass the
 * Runnable class to its constructor, and start the Thread by calling the
 * start() method.
 */