package multithreading.threadRevision;

public class Student {
   private Runnable runnable;

    public Student(Runnable runnable) {
        this.runnable = runnable;
    }
    void start(){
        this.run();
    }
    void  run(){
        if(runnable!=null){
            runnable.run();
        }
    }
}
