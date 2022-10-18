package Excepciones;

public class DividePorCero {

    public static void dividePorCero(int num) throws ArithmeticException{
        int zero = 0;
        try{
            zero = num / 0;
        } catch (ArithmeticException e){
              throw new ArithmeticException();
          }
    }
}
