import java.util.*;
public class Test2 implements Runnable{
        public void run(){
            System.out.printf("TURING");
        }
        public static void main(String[] args) throws InterruptedException{
            Thread thread1 = new Thread(new Test2());
            thread1.start();
            thread1.start();
            System.out.println(thread1.getState());
        }
    }
// The output is Run time exception + TURING
// occurs due to line 9 (checked by commenting t)