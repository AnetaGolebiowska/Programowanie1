package rekurencja;

import java.util.Arrays;

public class Tablica {
    static int [] tab = {1, 2, 3, 4, 5, 6, 7};

    private static void wypiszRosnąco (int [] tab){
       if (tab.length > 0) {
           System.out.println(tab[0]);
           wypiszRosnąco(Arrays.copyOfRange(tab, 1, tab.length - 1));
       }
    }
    private static void wypiszMalejąco (int [] tab){
        if (tab.length > 0){
            System.out.println(tab [0]);
            wypiszMalejąco(Arrays.copyOfRange(tab, 1, tab.length));
        }
    }

    public static void main(String[] args) {
        wypiszRosnąco(tab);
    }
}
