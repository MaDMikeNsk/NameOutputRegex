import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fullName="";
        do
        {
            System.out.println("Введите полное имя");
            fullName = reader.readLine().trim();

        } while (!fullName.matches("[А-Я][а-я]+\\s[А-Я][а-я]+\\s[А-Я][а-я]+"));

        String[] splitedName = fullName.split("\\s");
        System.out.println("Фамилия: " + splitedName[0] + "\nИмя: " + splitedName[1] + "\nОтчество: "+splitedName[2]);
    }
}
