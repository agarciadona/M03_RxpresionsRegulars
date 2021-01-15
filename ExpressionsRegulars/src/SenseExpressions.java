import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SenseExpressions {

    public static void main (String[] args) throws FileNotFoundException {
        File santako = new File("C:\\Users\\arnau\\OneDrive\\Escritorio\\santako.txt");
        Scanner input = new Scanner(santako);

        String noel = "<]:-DOo";
        String ren  = ">:o)";
        String follet = "<]:-D";
        int i;
        int p = 0;int r = 0;int f = 0;

        while (input.hasNextLine()) {//inici del bucle
            String linea = input.nextLine();

            //busca noel
            if(linea.contains(noel)){
                i = linea.indexOf(noel);
                String linea2 = linea.substring(i);
                p++;
                while(i !=-1){
                    linea2 = linea2.substring(i);
                    if(linea.contains(noel)){
                        i = linea2.indexOf(noel)+1;
                        p++;
                    }
                    else{
                        break;
                    }
                }
            }
            i = 0;
            //busca ren
            if(linea.contains(ren)){
                i = linea.indexOf(ren);
                String linea2 = linea.substring(i);
                r++;
                while(i !=-1){
                    linea2 = linea2.substring(i);
                    if(linea.contains(ren)){
                        i = linea2.indexOf(ren)+1;
                        r++;
                    }
                    else{
                        break;
                    }
                }
            }
            i = 0;
            //busca follet
            if(linea.contains(follet)){
                i = linea.indexOf(follet);
                String linea2 = linea.substring(i);
                f++;
                while(i !=-1){
                    linea2 = linea2.substring(i);
                    if(linea.contains(follet)){
                        f++;
                        i = linea2.indexOf(follet)+1;
                    }
                    else{
                        break;
                    }
                }
            }

            i = 0;
            System.out.print(p > 0 ? "Pare Noel (" + p + ")  " : "");
            System.out.print(r > 0 ? "Ren (" + r + ")  " : "");
            System.out.println(f-p > 0 ? "follet (" + (f-p) + ")  " : "");
        }//fi del bucle




    }
}
