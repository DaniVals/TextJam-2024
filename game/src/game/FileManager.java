package game;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {


    //////////////////////////////////////////////////////////////
    
    public static void darPremio(Scanner teclado, String color){
        System.out.print(color);
        System.out.println("Introduzca un directorio");
        File archivo = new File(teclado.nextLine());
        while (true) {
            if (!archivo.exists()) {
                Dialogue.fuenteError();
                System.out.println("directorio no encontrado, introduzca uno nuevo");
                Dialogue.resetColors();
            }
            else if (!archivo.isDirectory()) {
                Dialogue.fuenteError();
                System.out.println("tiene que ser un directorio, no un archivo");
                Dialogue.resetColors();
            }
            else{
                PrintWriter out = null;
                try {
                    System.out.println();
                    out = new PrintWriter(new FileWriter(archivo.getAbsolutePath()+"/premio.txt"));
                    
                    System.out.print(color);
                    System.out.println("Introduzca su nombre");

                    char[][] premio = {
                        {' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' '},
                        {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
                        {'#',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ','#'},
                        {' ','#',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ','#',' '},
                        {' ',' ','#',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ','#',' ',' '},
                        {' ',' ',' ','#','#','#',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ','#','#',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' '}
                    };
                    out.println("Premio entregado a: "+teclado.nextLine());
                    out.println("Como recompensa por ganar");
                    out.println("Al borde de la papelera");
                    out.println("");
                    
                    for (int i = 0; i < premio.length; i++) {
                        for (int j = 0; j < premio[i].length; j++) {
                            out.print(premio[i][j]);
                        }
                        out.print("\n");
                    }
        
                }
                catch(IOException e){
                }
                finally {
                    if (out != null) {
                        out.close();
                    }
                }
                return;
            }
            System.out.print(color);
            archivo = new File(teclado.nextLine());
        }
    }
    public static File pedirArchivo(Scanner teclado, long longitudMinima, String color, boolean foto){
        System.out.print(color);
        System.out.println("Introduzca un archivo");
        File archivo = new File(teclado.nextLine());
        while (true) {
            if (!archivo.exists()) {
                Dialogue.fuenteError();
                System.out.println("archivo no encontrado, introduzca uno nuevo");
                Dialogue.resetColors();
            }
            else if (!archivo.isFile()) {
                Dialogue.fuenteError();
                System.out.println("tiene que ser un archivo, no un directorio");
                Dialogue.resetColors();
            }
            else if (archivo.length() < longitudMinima) {
                Dialogue.fuenteError();
                System.out.println("el archivo tiene que ser mas grande");
                Dialogue.resetColors();
            }
            else if (Main.fechaInicioPrograma < archivo.lastModified()) {
                Dialogue.fuenteError();
                System.out.println("el archivo es demasiado reciente, no vale crearlos ahora mismo");
                Dialogue.resetColors();
            }
            else if (foto && !archivo.getAbsolutePath().matches("^.*\\.png$")) {
                Dialogue.fuenteError();
                System.out.println("el archivo no es un .png");
                Dialogue.resetColors();
            }
            else{
                return archivo;
            }
            System.out.print(color);
            archivo = new File(teclado.nextLine());
        }
    }
    public static boolean pedirRespuesta(Question p, Scanner teclado, String color){
        while (true) {
            System.out.print(color);
            String respuesta = teclado.nextLine();
            int solucion;
            while (true) {
                try {
                    solucion = Integer.parseInt(respuesta);
                    if (1<=solucion && solucion<=4) {
                        if (verificarRespuesta(teclado, color)) {
                            if (solucion == p.getCorrecta()) {
                                return true;
                            }else{
                                return false;
                            }
                        }else{
                            Dialogue.fuentePresentador();
                            System.out.println("Puedes elejir otra pregunta");
                            Dialogue.resetColors();
                        }
                    }else{
                        Dialogue.fuenteError();
                        System.out.println("Por favor, introduzca un numero valido (entre 1 y 4)");
                        Dialogue.resetColors();
                    }
                } catch (Exception e) {
                    Dialogue.fuenteError();
                    System.out.println("Por favor, introduzca un numero");
                    Dialogue.resetColors();
                }
                System.out.print(color);
                respuesta = teclado.nextLine();
            }
        }
    }
    private static boolean verificarRespuesta(Scanner teclado, String color){
        Dialogue.fuenteAviso();
        System.out.println("Estas seguro? [s/n]");
        Dialogue.resetColors();
        System.out.print(color);
        String respuesta = teclado.nextLine();
        if (respuesta.toLowerCase().charAt(0)=='s') {
            return true;
        }
        return false;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////
    public static void givePrice(Scanner teclado, String color){
        System.out.print(color);
        System.out.println("Insert a directory");
        File archivo = new File(teclado.nextLine());
        while (true) {
            if (!archivo.exists()) {
                Dialogue.fuenteError();
                System.out.println("directory not found, insert a new one");
                Dialogue.resetColors();
            }
            else if (!archivo.isDirectory()) {
                Dialogue.fuenteError();
                System.out.println("it has to be a directory, not a file");
                Dialogue.resetColors();
            }
            else{
                PrintWriter out = null;
                try {
                    System.out.println();
                    out = new PrintWriter(new FileWriter(archivo.getAbsolutePath()+"/price.txt"));
                    
                    System.out.print(color);
                    System.out.println("Insert your name");

                    char[][] premio = {
                        {' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' '},
                        {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
                        {'#',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ','#'},
                        {' ','#',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ','#',' '},
                        {' ',' ','#',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ','#',' ',' '},
                        {' ',' ',' ','#','#','#',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ','#','#',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ',' '}
                    };
                    out.println("Price given to: "+teclado.nextLine());
                    out.println("As an award for winning");
                    out.println("At the edge of the bin");
                    out.println("");
                    
                    for (int i = 0; i < premio.length; i++) {
                        for (int j = 0; j < premio[i].length; j++) {
                            out.print(premio[i][j]);
                        }
                        out.print("\n");
                    }
        
                }
                catch(IOException e){
                }
                finally {
                    if (out != null) {
                        out.close();
                    }
                }
                return;
            }
            System.out.print(color);
            archivo = new File(teclado.nextLine());
        }
    }
    public static File nextFile(Scanner teclado, long longitudMinima, String color, boolean foto){
        System.out.print(color);
        System.out.println("Insert a file");
        File archivo = new File(teclado.nextLine());
        while (true) {
            if (!archivo.exists()) {
                Dialogue.fuenteError();
                System.out.println("file not found, insert a new one");
                Dialogue.resetColors();
            }
            else if (!archivo.isFile()) {
                Dialogue.fuenteError();
                System.out.println("it has to be a file, not a directory");
                Dialogue.resetColors();
            }
            else if (archivo.length() < longitudMinima) {
                Dialogue.fuenteError();
                System.out.println("the file has to be longer");
                Dialogue.resetColors();
            }
            else if (Main.fechaInicioPrograma < archivo.lastModified()) {
                Dialogue.fuenteError();
                System.out.println("The file was edited recently, you cant do that");
                Dialogue.resetColors();
            }
            else if (foto && !archivo.getAbsolutePath().matches("^.*\\.png$")) {
                Dialogue.fuenteError();
                System.out.println("the file is not an .png");
                Dialogue.resetColors();
            }
            else{
                return archivo;
            }
            System.out.print(color);
            archivo = new File(teclado.nextLine());
        }
    }
    public static boolean nextAnswer(Question p, Scanner teclado, String color){
        while (true) {
            System.out.print(color);
            String respuesta = teclado.nextLine();
            int solucion;
            while (true) {
                try {
                    solucion = Integer.parseInt(respuesta);
                    if (1<=solucion && solucion<=4) {
                        if (verifyAnswer(teclado, color)) {
                            if (solucion == p.getCorrecta()) {
                                return true;
                            }else{
                                return false;
                            }
                        }else{
                            Dialogue.fuentePresentador();
                            System.out.println("You can chose another answer");
                            Dialogue.resetColors();
                        }
                    }else{
                        Dialogue.fuenteError();
                        System.out.println("Please pick a valid number (between 1 and 4)");
                        Dialogue.resetColors();
                    }
                } catch (Exception e) {
                    Dialogue.fuenteError();
                    System.out.println("Please pick a number");
                    Dialogue.resetColors();
                }
                System.out.print(color);
                respuesta = teclado.nextLine();
            }
        }
    }
    private static boolean verifyAnswer(Scanner teclado, String color){
        Dialogue.fuenteAviso();
        System.out.println("Are you sure? [y/n]");
        Dialogue.resetColors();
        System.out.print(color);
        String respuesta = teclado.nextLine();
        if (respuesta.toLowerCase().charAt(0)=='y') {
            return true;
        }
        return false;
    }

}
