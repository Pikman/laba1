import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        char inChar = 1;
        System.out.println("Введите один символ");
        try {
            inChar=(char)System.in.read();
        } catch (IOException e){
            System.out.println("Ошибка ввода символа");
        }

        Hash a = new Hash();
        Hash.setA(inChar);
        Hash b = new Hash();
        System.out.println("Начальная буква: "+ Hash.getA());
        a.Hashir();
        b.Hashir2();
        System.out.println("Закодированная буква: " + Hash.getB());
        System.out.println("Раскодированная буква: " + Hash.getA());

    }
}

