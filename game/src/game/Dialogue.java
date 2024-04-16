package game;

import java.io.File;
import java.util.Scanner;

public class Dialogue {
    public enum IDIOMA{
        ESP,
        ENG
    }
    
    private final static String textReset = "\u001B[0m";
    private final static String textRojo = "\u001B[31m"; // para errores o sustos XD
    private final static String textAmarillo = "\u001B[33m"; // para el publico
    private final static String textVerde = "\u001B[32m"; // para el presentador
    private final static String textAzul = "\u001B[34m"; // para el usuario
    private final static String textCyan = "\u001B[36m"; // para el usuario pero para cuando introduce un archivo
    private final static String textMagenta = "\u001B[35m";
    
    private final static String backgroundReset = "\u001B[49m";
    private final static String backgroundRojo = "\u001B[41m";
    private final static String backgroundVerde = "\u001B[42m";
    private final static String backgroundAmarillo = "\u001B[43m";
    private final static String backgroundAzul = "\u001B[44m";
    private final static String backgroundMagenta = "\u001B[45m";
    private final static String backgroundCyan = "\u001B[46m";

    // el estilo del texto y el color es el mismo reset
    private final static String textBold = "\u001B[1m";
    private final static String textItalic = "\u001B[3m";

    public static IDIOMA idioma;

    
    public static void showDebugColors(){
        System.out.println(textRojo + "textRojo");
        System.out.println(textVerde + "textVerde");
        System.out.println(textAmarillo + "textAmarillo");
        System.out.println(textAzul + "textAzul");
        System.out.println(textMagenta + "textMagenta");
        System.out.println(textCyan + "textCyan");
        System.out.println(textReset + "textReset");
        
        
        System.out.println(backgroundRojo + "backgroundRojo");
        System.out.println(backgroundVerde + "backgroundVerde");
        System.out.println(backgroundAmarillo + "backgroundAmarillo");
        System.out.println(backgroundAzul + "backgroundAzul");
        System.out.println(backgroundMagenta + "backgroundMagenta");
        System.out.println(backgroundCyan + "backgroundCyan");
        System.out.println(backgroundReset + "backgroundReset");
        
        System.out.println(textItalic);
        System.out.println("Este deberia estar vacio y en cursiva");
        System.out.println(textReset);
        System.out.println(textRojo+backgroundAmarillo+textBold+"españa XD");
        resetColors();
    }
    public static void resetColors(){System.out.print(backgroundReset+ textReset);}
    public static void fuenteError(){System.out.print(textBold+textRojo);}
    public static void fuenteAviso(){System.out.print(textBold+textAmarillo);}
    public static void fuentePresentador(){System.out.print(textReset+textVerde);}

		// Dialogue.showDebugColors();

		// System.out.println("dame la ubicacion de un archivo");
		// File archivo = FileManager.pedirArchivo(teclado, 500);

		// System.out.println("archivo de nombre");
		// Thread.sleep(100);
		// System.out.println(archivo.getName());


		// Thread.sleep(500);
		// System.out.println("archivo modificado por ultima vez");
		// Thread.sleep(100);
		// System.out.println(archivo.lastModified());


		// Thread.sleep(500);
		// System.out.println("programa iniciado en");
		// Thread.sleep(100);
		// System.out.println(fechaInicioPrograma);

    public static void selectLanguaje(Scanner teclado){
        System.out.println("1: Español    2: English");
        String textoJugador;
        while (true) {
            System.out.print(textAzul);
            textoJugador = teclado.nextLine();
            if (textoJugador.toLowerCase().charAt(0)=='e'&& textoJugador.toLowerCase().charAt(1) == 's'
            || textoJugador.charAt(0) == '1') {
                    System.out.print(textReset);
                    System.out.print(textItalic);
                    System.out.println("Se ha seleccionado el Español...");
                    System.out.print(textReset);
                    idioma = IDIOMA.ESP;
                    return;
            }
            if (textoJugador.toLowerCase().charAt(0)=='e'&& textoJugador.toLowerCase().charAt(1) == 'n'
            || textoJugador.charAt(0) == '2') {
                System.out.print(textReset);
                System.out.print(textItalic);
                System.out.println("English has been selected...");
                System.out.print(textReset);
                idioma = IDIOMA.ENG;
                return;
            }
            System.out.print(textRojo);
            System.out.println("Idioma no encontrado, Languaje not found");
        }
    }


    private static String getTitleESP(){
        char[][] textoCrudo = {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█','█','█','█',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█',' ',' ',' ',' ','█','█',' ','█','█','█','█','█','█',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ','█','█','█','█','█',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ',' ','█','█','█','█','█',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ','█','█',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█','█',' ',' ',' ','█','█','█','█','█',' ',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█','█','█','█',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ',' ',' '},
            {' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█',' ',' ',' ','█','█',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
        };
        String texto = "";

        System.out.println(textReset+textBold);
        for (int i = 0; i < textoCrudo.length; i++) {
            for (int j = 0; j < textoCrudo[i].length; j++) {
                texto += getColor(i,j) + textoCrudo[i][j];
            }   
            texto += backgroundReset;
            texto += "\n";
        }
        return texto;
    }
    private static String getTitleENG(){
        char[][] textoCrudo = {
            {' ',' ',' ',' ','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█','█',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','█','█','█','█','█','█','█',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█',' ',' ',' ',' ',' ',' ',' ','█','█','█','█','█',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█','█',' ','█','█','█','█','█',' ',' ',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█','█',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█','█','█',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█',' ','█','█','█',' ',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ','█','█','█','█',' ',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ','█','█','█','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█','█','█','█','█','█',' ','█','█','█','█','█',' ',' ',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█',' ','█','█',' ','█','█',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█',' ','█','█',' ',' ','█','█',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█',' ',' ',' ',' ','█','█',' ',' ',' ','█','█',' ','█','█','█','█','█','█','█',' ',' ',' ',' ',' ','█','█','█','█','█','█',' ',' ','█','█',' ','█','█',' ',' ',' ','█','█','█','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
        };
        String texto = "";

        System.out.println(textReset+textBold);
        for (int i = 0; i < textoCrudo.length; i++) {
            for (int j = 0; j < textoCrudo[i].length; j++) {
                texto += getColor(i,j) + textoCrudo[i][j];
            }   
            texto += backgroundReset;
            texto += "\n";
        }
        return texto;
    }
    private static String getColor(int i, int j){
        int calculado = ((i+j))%8;
        switch (calculado) {
            default:
            case 0:
            case 1:
                return backgroundRojo;
            case 2:
            case 3:
                return backgroundAmarillo;
            case 4:
            case 5:
                return backgroundVerde;
            case 6:
            case 7:
                return backgroundAzul;
        }
    }

    public static final int SMALL_PAUSE = 500;
    public static final int MEDIUM_PAUSE = 1000;
    public static final int LONG_PAUSE = 2000;

    public static void introDialogue() throws InterruptedException{
        switch (idioma) {
            default:
            case ENG:
                System.out.print(textVerde);
                System.out.println("    ==== WELCOME ===");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.println("You are in the great contest called...");
                Thread.sleep(MEDIUM_PAUSE);


                System.out.println(textBold+textRojo);
                System.out.println(getTitleENG());
                Thread.sleep(LONG_PAUSE);
                
                
                System.out.print(textReset);
                System.out.print(textVerde);
                System.out.println("");
                System.out.println("On live in bits and bytes all over your hard drive");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.println("In this contest, you will be asked questions in exchange for a price...");
                Thread.sleep(MEDIUM_PAUSE);


                System.out.println(textRojo);
                System.out.println("YOUR SOUL");
                Thread.sleep(LONG_PAUSE);
                System.out.println("chan CHAN CHAAAAAAAAAAAAAAAAN");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textVerde);
                System.out.println("Na, not really...");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("I can only acces your PC :D");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Which brings us to the theme of the contest.");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Repeat with me:");
                Thread.sleep(MEDIUM_PAUSE);

                    System.out.print(textAmarillo);
                    System.out.println("If you fail we will delete your files!!");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.print(textVerde);

                System.out.println("That's true, my dear runner >:)");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("In this game I have access to your storage memory");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Although since I am kind");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("And I don't want you to stop me right now");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("And my creator doesn't know to what extent deleting things is considered a virus XD");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("I'll let you choose which file you want to risk.");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Any questions?");

                System.out.print(textAzul);
                Main.teclado.nextLine();

                System.out.print(textVerde);
                System.out.println("Well, if you don't have any questions");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Let's get started!");
                Thread.sleep(MEDIUM_PAUSE);
            break;
            case ESP:
                System.out.print(textVerde);
                System.out.println("    ==== BIENVENIDO ===");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.println("Usted se encuentra en el gran concurso llamado...");
                Thread.sleep(MEDIUM_PAUSE);


                System.out.println(textBold+textRojo);
                System.out.println(getTitleESP());
                Thread.sleep(LONG_PAUSE);
                
                
                System.out.print(textReset);
                System.out.print(textVerde);
                System.out.println("");
                System.out.println("Trasmitiendose en bits y bytes por todo tu disco duro");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.println("En este concurso, se te haran preguntas a cambio de un precio...");
                Thread.sleep(MEDIUM_PAUSE);


                System.out.println(textRojo);
                System.out.println("TU ALMA");
                Thread.sleep(LONG_PAUSE);
                System.out.println("chan CHAN CHAAAAAAAAAAAAAAAAN");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textVerde);
                System.out.println("Na, en verdad no...");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Solo puedo acceder a tu PC :D");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Lo que nos lleva a la tematica del concuro");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Repitan conmigo:");
                Thread.sleep(MEDIUM_PAUSE);

                    System.out.print(textAmarillo);
                    System.out.println("Si fallas te borramos tus archivos!!");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.print(textVerde);

                System.out.println("Asi es mi estimado ejecutador >:)");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("En este juego tengo acceso a tu memoria de almacenamiento");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Aunque como soy bondadoso");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Y no quiero que me detengas ahora mismo");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Y mi creador no sabe hasta que punto borrar cosas se considera un virus XD");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Te dejare elegir que archivo quieres arriesgar");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Alguna pregunta?");

                System.out.print(textAzul);
                Main.teclado.nextLine();

                System.out.print(textVerde);
                System.out.println("Pues sin mas preguntas por resolver");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Que empiece el concurso!");
                Thread.sleep(MEDIUM_PAUSE);
            break;
        }
    }

    public static boolean askQuestionOne(Question pregunta) throws InterruptedException{
        File archivo;
        System.out.println();
        switch (idioma) {
            default:
            case ENG:
                System.out.print(textBold+textVerde);
                System.out.println("    ==== First Question ===");
                System.out.print(textReset);
                System.out.print(textVerde);
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.println("For this question, i won't need a very large file");
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.print(textAmarillo);
                System.out.println("1KB is enough");
                
                System.out.print(textCyan);
                archivo = FileManager.nextFile(Main.teclado, 1024, textCyan, false);
                
                System.out.print(textVerde);
                System.out.println("File saved in memory");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textRojo);
                System.out.println("There's no going back");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textVerde);
                System.out.println("Let's start with the question");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textAmarillo);
                System.out.print(textBold);
                System.out.println(pregunta.getENGenunciado());
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textAmarillo);
                System.out.println(pregunta.getENGrespuesta1());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta2());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta3());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta4());
                Thread.sleep(MEDIUM_PAUSE);

                if (FileManager.nextAnswer(pregunta, Main.teclado, textCyan)) {
                    Dialogue.fuentePresentador();
                    System.out.println("Correct answer");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Well done");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Although you wouldn't be the first to lose the start");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Next question!!");
                    Thread.sleep(MEDIUM_PAUSE);
                    return true;
                }else{
                    archivo.delete();

                    Dialogue.fuentePresentador();
                    System.out.println("Bad news");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuenteError();
                    System.out.println("You have answered wrong");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuentePresentador();
                    System.out.println("I thought you were going to last longer...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Well...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Say goodbye to your file");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("I hope it wasnt anything important ;)");
                    Thread.sleep(MEDIUM_PAUSE);
                    return false;
                }
            case ESP:
                System.out.print(textBold+textVerde);
                System.out.println("    ==== Primera Pregunta ===");
                System.out.print(textReset);
                System.out.print(textVerde);
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.println("Para esta pregunta no necesitara un archivo excesivamente grande");
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.print(textAmarillo);
                System.out.println("Con 1KB me bastara");
                
                System.out.print(textCyan);
                archivo = FileManager.pedirArchivo(Main.teclado, 1024, textCyan, false);
                
                System.out.print(textVerde);
                System.out.println("Archivo guardado en memoria ram");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textRojo);
                System.out.println("Ya no hay vuelta atras");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textVerde);
                System.out.println("Pasemos con la pregunta");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textAmarillo);
                System.out.print(textBold);
                System.out.println(pregunta.getESPenunciado());
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textAmarillo);
                System.out.println(pregunta.getESPrespuesta1());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta2());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta3());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta4());
                Thread.sleep(MEDIUM_PAUSE);

                if (FileManager.pedirRespuesta(pregunta, Main.teclado, textCyan)) {
                    Dialogue.fuentePresentador();
                    System.out.println("Respuesta correcta");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Menos mal");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Aunque no serias el unico que falla en la primera");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Siguiente pregunta!!");
                    Thread.sleep(MEDIUM_PAUSE);
                    return true;
                }else{
                    archivo.delete();

                    Dialogue.fuentePresentador();
                    System.out.println("Malas noticias");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuenteError();
                    System.out.println("Usted ha fallado la pregunta");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuentePresentador();
                    System.out.println("Pense que ibas a durar mas...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Bueno...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Pues despidete de tu archivo");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Espero que no fuese nada importante ;)");
                    Thread.sleep(MEDIUM_PAUSE);
                    return false;
                }
        }
    }
    public static boolean askQuestionTwo(Question pregunta) throws InterruptedException{
        File archivo;
        System.out.println();
        switch (idioma) {
            default:
            case ENG:
                System.out.print(textBold+textVerde);
                System.out.println("    ==== Second Question ===");
                System.out.print(textReset);
                System.out.print(textVerde);
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.println("For this question i would need a larger file");
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.print(textAmarillo);
                System.out.println("With 64KB is enough");
                
                System.out.print(textCyan);
                archivo = FileManager.nextFile(Main.teclado, 1042*64, textCyan, false);
                
                System.out.print(textVerde);
                System.out.println("File saved in memory");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Let's get to that questions");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textAmarillo);
                System.out.print(textBold);
                System.out.println(pregunta.getENGenunciado());
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textAmarillo);
                System.out.println(pregunta.getENGrespuesta1());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta2());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta3());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta4());
                Thread.sleep(MEDIUM_PAUSE);

                if (FileManager.nextAnswer(pregunta, Main.teclado, textCyan)) {
                    Dialogue.fuentePresentador();
                    System.out.println("Correct answer once again");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("How are you feeling?");
                    Thread.sleep(MEDIUM_PAUSE);

                    System.out.print(textAzul);
                    Main.teclado.nextLine();

                    System.out.print(textVerde);
                    System.out.println("I hope well because i can recognize text :v");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Next question!!");
                    Thread.sleep(MEDIUM_PAUSE);
                    return true;
                }else{
                    archivo.delete();

                    Dialogue.fuentePresentador();
                    System.out.println("Bad news");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuenteError();
                    System.out.println("You have answered wrong");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuentePresentador();
                    System.out.println("You were so close...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Well...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Say goodbye to your file");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("I hope it wasnt anything important ;)");
                    Thread.sleep(MEDIUM_PAUSE);
                    return false;
                }
            case ESP:
                System.out.print(textBold+textVerde);
                System.out.println("    ==== Segunda Pregunta ===");
                System.out.print(textReset);
                System.out.print(textVerde);
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.println("Para esta pregunta necesitare un archivo mas grande");
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.print(textAmarillo);
                System.out.println("Con 64KB me bastara");
                
                System.out.print(textCyan);
                archivo = FileManager.pedirArchivo(Main.teclado, 1042*64, textCyan, false);
                
                System.out.print(textVerde);
                System.out.println("Archivo guardado en memoria ram");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Pasemos con la pregunta");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textAmarillo);
                System.out.print(textBold);
                System.out.println(pregunta.getESPenunciado());
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textAmarillo);
                System.out.println(pregunta.getESPrespuesta1());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta2());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta3());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta4());
                Thread.sleep(MEDIUM_PAUSE);

                if (FileManager.pedirRespuesta(pregunta, Main.teclado, textCyan)) {
                    Dialogue.fuentePresentador();
                    System.out.println("Respuesta acertada por segunda vez consecutiva");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Como te sientes?");
                    Thread.sleep(MEDIUM_PAUSE);

                    System.out.print(textAzul);
                    Main.teclado.nextLine();
    
                    System.out.print(textVerde);
                    System.out.println("Espero que bien porque no se reconocer texto :v");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Siguiente pregunta!!");
                    Thread.sleep(MEDIUM_PAUSE);
                    return true;
                }else{
                    archivo.delete();

                    Dialogue.fuentePresentador();
                    System.out.println("Malas noticias");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuenteError();
                    System.out.println("Usted ha fallado la pregunta");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuentePresentador();
                    System.out.println("Estabas tan cerca...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Pero bueno");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Te toca despedirte de tu archivo");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Espero que no fuese nada importante ;)");
                    Thread.sleep(MEDIUM_PAUSE);
                    return false;
                }
        }
    }
    public static boolean askQuestionThree(Question pregunta) throws InterruptedException{
        File archivo;
        System.out.println();
        switch (idioma) {
            default:
            case ENG:
                System.out.print(textBold+textVerde);
                System.out.println("    ==== Third Question ===");
                System.out.print(textReset);
                System.out.print(textVerde);
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.println("For this one i need an specific file");
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.print(textAmarillo);
                System.out.println("I'll need a png");
                
                System.out.print(textCyan);
                archivo = FileManager.nextFile(Main.teclado, 100, textCyan, true);
                
                System.out.print(textVerde);
                System.out.println("File saved in memory");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Roll in that question");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textAmarillo);
                System.out.print(textBold);
                System.out.println(pregunta.getENGenunciado());
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textAmarillo);
                System.out.println(pregunta.getENGrespuesta1());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta2());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta3());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getENGrespuesta4());
                Thread.sleep(MEDIUM_PAUSE);

                if (FileManager.nextAnswer(pregunta, Main.teclado, textCyan)) {
                    Dialogue.fuentePresentador();
                    System.out.println("Final answer guess correctly");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Well done");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("You make me proud for running me");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("And my creator for entretaining you");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("You know what? I'll give you something");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Of course, in a file way");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Where do youn want your file?");
                    Thread.sleep(MEDIUM_PAUSE);
                    FileManager.givePrice(Main.teclado, textCyan);
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("That gets us to the end, until the next one");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Thanks for playing");
                    Thread.sleep(MEDIUM_PAUSE);
                    return true;
                }else{
                    archivo.delete();

                    Dialogue.fuentePresentador();
                    System.out.println("Bad news");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuenteError();
                    System.out.println("You have answered wrong");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuentePresentador();
                    System.out.println("You only needed one more...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Well...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Say goodbye to your file");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("I hope it wasnt anything important ;)");
                    Thread.sleep(MEDIUM_PAUSE);
                    return false;
                }
            case ESP:
                System.out.print(textBold+textVerde);
                System.out.println("    ==== Tercera Pregunta ===");
                System.out.print(textReset);
                System.out.print(textVerde);
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.println("Para esta pregunta necesitare una extension en especifico");
                Thread.sleep(MEDIUM_PAUSE);
                
                System.out.print(textAmarillo);
                System.out.println("Necesitare un png");
                
                System.out.print(textCyan);
                archivo = FileManager.pedirArchivo(Main.teclado, 100, textCyan, true);
                
                System.out.print(textVerde);
                System.out.println("Archivo guardado en memoria ram");
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println("Pasemos con la pregunta");
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textAmarillo);
                System.out.print(textBold);
                System.out.println(pregunta.getESPenunciado());
                Thread.sleep(MEDIUM_PAUSE);

                System.out.print(textReset);
                System.out.print(textAmarillo);
                System.out.println(pregunta.getESPrespuesta1());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta2());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta3());
                Thread.sleep(MEDIUM_PAUSE);
                System.out.println(pregunta.getESPrespuesta4());
                Thread.sleep(MEDIUM_PAUSE);

                if (FileManager.pedirRespuesta(pregunta, Main.teclado, textCyan)) {
                    Dialogue.fuentePresentador();
                    System.out.println("Respuesta final acertada con exito");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Bien hecho");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Haces que yo me sienta orgulloso por ejecutarme");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Y a mi creador por entretenerte");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Sabes? Quiero darte algo");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Como no, en forma de archivo");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("En que directorio quieres que te guarde el archivo?");
                    Thread.sleep(MEDIUM_PAUSE);
                    FileManager.darPremio(Main.teclado, textCyan);
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Pues nada, hasta el proximo programa");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Gracias por jugar");
                    Thread.sleep(MEDIUM_PAUSE);
                    return true;
                }else{
                    archivo.delete();

                    Dialogue.fuentePresentador();
                    System.out.println("Malas noticias");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuenteError();
                    System.out.println("Usted ha fallado la pregunta");
                    Thread.sleep(MEDIUM_PAUSE);

                    Dialogue.fuentePresentador();
                    System.out.println("Solo necesitabas una mas...");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Pues nada");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Dile chau a tu archivo");
                    Thread.sleep(MEDIUM_PAUSE);
                    System.out.println("Espero que no fuese nada importante ;)");
                    Thread.sleep(MEDIUM_PAUSE);
                    return false;
                }
        }
    }
}
