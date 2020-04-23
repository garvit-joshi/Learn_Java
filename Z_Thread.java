/**
Java is a multi-threaded programming language. This means that our program 
can make optimal use of available resources by running two or more components 
concurrently, with each component handling a different task.
*/
class Loader extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}
class Z_Thread {
    public static void main(String[ ] args) {
		/**
		First Method:Loader class extends the Thread class and overrides its run() method.
		When we create the obj object and call its start() method, the run() method statements 
		execute on a different thread.
		*/
        Loader obj = new Loader();
        obj.start();
    }
}
/**
Every Java thread is prioritized to help the operating system determine the order in 
which to schedule threads. The priorities range from 1 to 10, with each thread 
defaulting to priority 5. You can set the thread priority with the setPriority() method.
*/
/**
The Thread.sleep() method pauses a Thread for a specified period of time. For example, 
calling Thread.sleep(1000); pauses the thread for one second. Keep in mind that Thread.sleep() 
throws an InterruptedException, so be sure to surround it with a try/catch block.
*/