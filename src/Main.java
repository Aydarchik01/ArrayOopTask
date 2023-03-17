import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class clas = new Class(1,"soz",new int[]{10});
        System.out.println("Number: "+clas.number+"\n"+"Soz: "+clas.soz+"\n"+"Massiv: "+ Arrays.toString(clas.mass));
    }
}