package ReverseChain;

public class ReverseChain {

    //Función que pide un String y lo muestra invertido
    public static void reverse(String texto) {
        System.out.println(texto);
        char[] chars = texto.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
