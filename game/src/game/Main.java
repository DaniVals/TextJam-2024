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
				"enunciado 1",
				"respuesta1",
				"respuesta2", 
				"respuesta3", 
				"resouesta4",
				"enuntiate",
				"anwser1",
				"anwser2",
				"anwser3",
				"anwser4",
				1
			),
			new Question(
				"enunciado 2",
				"respuesta1",
				"respuesta2", 
				"respuesta3", 
				"resouesta4",
				"enuntiate",
				"anwser1",
				"anwser2",
				"anwser3",
				"anwser4",
				2
			),
			new Question(
				"enunciado 3",
				"respuesta1",
				"respuesta2", 
				"respuesta3", 
				"resouesta4",
				"enuntiate",
				"anwser1",
				"anwser2",
				"anwser3",
				"anwser4",
				3
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
