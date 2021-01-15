import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmbExpressions {

    public static void main (String[] args) throws FileNotFoundException {

        File santako = new File("C:\\Users\\arnau\\OneDrive\\Escritorio\\santako.txt");
        Scanner input = new Scanner(santako);

        Pattern santa = Pattern.compile("\\*<]:-DOo");
        Pattern ren = Pattern.compile(">:o\\)");
        Pattern follet = Pattern.compile("[^\\*]<]:-D");

        while (input.hasNextLine()) {
            String linea = input.nextLine();

            Matcher s = santa.matcher(linea);
            Matcher r = ren.matcher(linea);
            Matcher f = follet.matcher(linea);

            int ConS = 0;
            int ConR = 0;
            int ConF = 0;

            while (s.find()) { ConS++;}
                while (r.find()) { ConR++;}
                while (f.find()) { ConF++;}

                        System.out.print(ConS > 0 ? "Pare Noel (" + ConS + ")  " : "");
                        System.out.print(ConR > 0 ? "Ren (" + ConR + ")  " : "");
                        System.out.println(ConF > 0 ? "follet (" + ConF + ")  " : "");
                    }

                }

            }