package game;

public class Question {
    private String ESPenunciado;
    private String ESPrespuesta1;
    private String ESPrespuesta2;
    private String ESPrespuesta3;
    private String ESPrespuesta4;
    private String ENGenunciado;
    private String ENGrespuesta1;
    private String ENGrespuesta2;
    private String ENGrespuesta3;
    private String ENGrespuesta4;
    private int correcta;
    
    public Question(String eSPenunciado, String eSPrespuesta1, String eSPrespuesta2, String eSPrespuesta3,
            String eSPrespuesta4, String eNGenunciado, String eNGrespuesta1, String eNGrespuesta2, String eNGrespuesta3,
            String eNGrespuesta4, int correcta) {
        ESPenunciado = eSPenunciado;
        ESPrespuesta1 = eSPrespuesta1;
        ESPrespuesta2 = eSPrespuesta2;
        ESPrespuesta3 = eSPrespuesta3;
        ESPrespuesta4 = eSPrespuesta4;
        ENGenunciado = eNGenunciado;
        ENGrespuesta1 = eNGrespuesta1;
        ENGrespuesta2 = eNGrespuesta2;
        ENGrespuesta3 = eNGrespuesta3;
        ENGrespuesta4 = eNGrespuesta4;
        this.correcta = correcta;
    }

    public String getESPenunciado() {
        return ESPenunciado;
    }

    public String getESPrespuesta1() {
        return ESPrespuesta1;
    }

    public String getESPrespuesta2() {
        return ESPrespuesta2;
    }

    public String getESPrespuesta3() {
        return ESPrespuesta3;
    }

    public String getESPrespuesta4() {
        return ESPrespuesta4;
    }

    public String getENGenunciado() {
        return ENGenunciado;
    }

    public String getENGrespuesta1() {
        return ENGrespuesta1;
    }

    public String getENGrespuesta2() {
        return ENGrespuesta2;
    }

    public String getENGrespuesta3() {
        return ENGrespuesta3;
    }

    public String getENGrespuesta4() {
        return ENGrespuesta4;
    }

    public int getCorrecta() {
        return correcta;
    }
    
    

}
