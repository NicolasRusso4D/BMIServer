/**
   Una domanda con un text e una answer(giusta).
*/
public class Question {

   private String text;
   private String answer;

   /**
      NB Questo costruttore ha parametro di input, quindi non serve e
	 non c'è più il metodo setText.
      Costruisce una domanda con dato text ed una answer giusta vuota.
      @param questionText il testo della domanda
   */
   public Question(String questionText) {

      text = questionText;
      answer = "";
   }

   /**
      Setter della answer giusta per questa domanda.
      @param correctResponse la giusta answer alla domanda
   */
   public void setAnswer(String correctResponse) {

      answer = correctResponse;
   }

   /**
      Controlla se la risposta di input è corretta.
      @param response la risposta data da controllare
      @return true se la response era corretta, false altrimenti
   */
   public boolean checkAnswer(String response) {

      return response.equals(answer);
   }

   /**
      Visualizza il testo della domanda
      (utile quando va sottoposta all'utente).
   */
   public void display() {

      System.out.println(text);
   }
}
