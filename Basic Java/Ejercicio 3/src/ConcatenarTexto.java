public class ConcatenarTexto {

    public static void main(String[] args) {

        String[] names = {"Paco", "Angeles", "Lucia", "Diego"};

        String name = "";
        for (int i = 0; i < names.length; i++) {
            name += names[i] + " ";
        }
        System.out.println(name);

    }
}