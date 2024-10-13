package lab3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\Matve\\Desktop\\Сравнительный анализ языков программирования\\text.txt";
        ArrayList<Country> countries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            ArrayList<String> buffer= new ArrayList<>();
            while ((line = br.readLine()) != null) {
                buffer.add(line);
                if (line.isEmpty()) {
                    countries.add(new Country(buffer.get(0), buffer.get(1), buffer.get(2),  Double.parseDouble(buffer.get(3)), Double.parseDouble(buffer.get(4)), buffer.get(5), buffer.get(6), buffer.get(7)));

                    buffer.clear();
                }
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        String path2 = "C:\\Users\\Matve\\Desktop\\Сравнительный анализ языков программирования\\newTEXT.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
            for (Country coun : countries) {
                if (coun.getPopulation() > 20) {
                    System.out.println(coun);
                    bw.write(coun.toString());
                    bw.newLine();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
