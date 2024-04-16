package game;

import java.util.Scanner;

public class Main {

	public static long fechaInicioPrograma;
	public static Scanner teclado;

	public static void main(String[] args) throws InterruptedException {

		// iniciar variables
		fechaInicioPrograma = System.currentTimeMillis();
		teclado = new Scanner(System.in);
		Question[] preguntas = {
			new Question(
				"¿Que extension de archivo indica que un archivo es ejecutable en Windows?",
				".pdf",
				".mp4", 
				".wav",
				".exe", 
				"What file extension is used in executable Windows files?",
				".pdf",
				".mp4",
				".wav",
				".exe",
				4
			),
			new Question(
				"¿Cuando se fundo itch.io?",
				"2011",
				"2012", 
				"2013", 
				"2014",
				"When was itch.io founded?",
				"2011",
				"2012",
				"2013",
				"2014",
				3
			),
			new Question(
				"¿Quien es considerado el padre de la computacion?",
				"Alan Turing", 
				"Bill Gates",
				"Steve Jobs", 
				"Videosboy",
				"Who is considered the father of the computer?",
				"Alan Turing",
				"Bill Gates",
				"Steve Jobs",
				"Videosboy",
				1
			)
		};


		// empezar programa
		Dialogue.selectLanguaje(teclado);
		Thread.sleep(Dialogue.SMALL_PAUSE);

		Dialogue.introDialogue();
		System.out.println("\n");

		if (Dialogue.askQuestionOne(preguntas[0])) {
			if (Dialogue.askQuestionTwo(preguntas[1])) {
				if (Dialogue.askQuestionThree(preguntas[2])) {
					
				}	
			}
		}




		// cerrar programa
		Dialogue.resetColors();
		teclado.close();
	}
}
