import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class teste {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        System.out.println("esse é o valor ->" + num);
        for (int i = 0; i <= num; i++) {
            i = num;//complete seu codigo aqui
            System.out.println(i);
        }
    }
}

