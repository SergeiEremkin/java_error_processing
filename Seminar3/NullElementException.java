package Seminar3;

public class NullElementException extends NullPointerException {

    public NullElementException() {
        super("Попытка обращения к пустому элементу");
    }

}
