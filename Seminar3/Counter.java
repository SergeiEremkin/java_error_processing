package Seminar3;

public class Counter implements AutoCloseable {
    int count;
    boolean isClose;

    public Counter(int count) {
        this.count = count;
        this.isClose = false;
    }

    public int add() {
        if (!isClose){
            return count++;
        }
        throw new RuntimeException("Класс закрыт");
        
    }

    @Override
    public void close() throws Exception {
            isClose = true;
    }

    public int getCount() {
        return count;
    }

    public boolean isClose() {
        return isClose;
    }

    
}
