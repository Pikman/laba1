/**
 * Created by Михаил on 22.10.2014.
 */
// описываем отдельный новый класс
class Hash {
    // свойства класса
    private static char a; // Первый символ
    private static char b; // Закодированный символ


    public Hash() {

        this.a=a;
    }

    // 
    public static char getA() {
        return a;
    }

    public static void setA(char a) {
        Hash.a = a;
    }

    public static char getB() {
        return b;
    }

    public static void setB(char b) {
        Hash.b = b;
    }


    public char Hashir() {
       b=(char) (a+2) ;
        return b;
    }

    public char Hashir2() {
        a=(char) (b-2);
        return a;
    }

}
