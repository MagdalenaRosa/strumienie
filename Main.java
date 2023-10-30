import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] tablica = {
                {1, 2, 3},
                {4, 45, 6},
                {7, 8, 9}
        };
        int [] tab={1,2,3};

        int suma = obliczSumeDW(tablica);
        System.out.println(max_value_tab_wielo(tablica));
        System.out.println(max_value_tab_jedno(tab));
   
    }
    
    }
    static int max_value_tab_jedno(int []tab){
       return max = Arrays.stream(tab).max().getAsInt();

    }
    static int max_value_tab_wielo(int [][]tab_wielo){
        return max =Arrays.stream(tab_wielo).flatMapToInt(Arrays::stream).max().getAsInt();
    }

    public static int obliczSumeDW(int[][] tablicaLiczb) {
        return Arrays.stream(tablicaLiczb)            // Tworzenie strumienia z tablicy 2D
        .flatMapToInt(Arrays::stream)        // Spłaszczanie tablicy do strumienia intów
        .sum();        

    
    }

}
