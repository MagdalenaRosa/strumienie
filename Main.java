import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] tablica = {
                {1, 2, 3},
                {4, 45, 6},
                {7, 8, 9}
        };
        int tab[]={1,2,3};

        int suma = obliczSumeDW(tablica);
        System.out.println(max_value_tab_wielo(tablica));
        System.out.println(max_value_tab_jedno(tab));
        zmniejszanie_licz();
    }

    public static void zmniejszanie_licz(){
        for(int i=20;i>=10;i--){
            System.out.println(i);
        }

    }
   static int max_value_tab_jedno(int []tab){
       int max = Arrays.stream(tab).max().getAsInt();
       return max;

    }
    static int max_value_tab_wielo(int [][]tab_wielo){
        int max =Arrays.stream(tab_wielo).flatMapToInt(Arrays::stream).max().getAsInt();
    return max;
    }

    public static int obliczSumeDW(int[][] tablicaLiczb) {
        return Arrays.stream(tablicaLiczb)            // Tworzenie strumienia z tablicy 2D
        .flatMapToInt(Arrays::stream)        // Spłaszczanie tablicy do strumienia intów
        .sum();        

    
    }

}