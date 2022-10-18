package ArrayList;

import java.util.ArrayList;

public class ArrayListIntMain {
    public static void main() {
        ArrayList<Integer> num = new ArrayList<>();

        //Bucle que rellena el ArrayList con números del 1 al 10
        for(int i = 0; i < 10; i++){
            num.add(i+1);
        }

        //Recorre el ArrayList y borra los números pares
        int flag = 1;
        while(flag>0){
            for(int i : num){
                System.out.println("Valor ArrayList: " + i);
            }
            for(int x = 0; x < num.size(); x++) {
                if (num.get(x) % 2 == 0){
                    num.remove(num.get(x));
                }
            }
            flag = 0;
        }

        //Recorre el ArrayList y muestra los valores actuales
        for(int y : num){
            System.out.println("Valores ArrayList sin pares: " + y);
        }
    }
}
