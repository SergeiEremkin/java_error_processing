package Seminar3;

public class Task3 {
    public static void main(String[] args) {
        // Создайте класс исключения, который будет выбрасываться при делении на 0.
        // Исключение должно отображать понятное для пользователя сообщение об ошибке.
        // Создайте класс исключений, которое будет возникать при обращении к пустому
        // элементу в массиве ссылочного типа.
        // Исключение должно отображать понятное для пользователя сообщение об ошибке
        Integer[] array = { 2, 3, null };
        try {
            int a = 1;
            int b = 1;
            // if (b==0){
            // throw new ByZeroExeption("Ошибка, произошло деление на ноль");
            // }
            int c = a / b;
            array[2].intValue();

        } catch (ArithmeticException e) {
            throw new ByZeroExeption();
        } catch (NullPointerException e) {
            throw new NullElementException();
        }

    }

}
