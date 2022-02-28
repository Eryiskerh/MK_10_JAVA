import java.util.Random;

public class Athlete {
    private String name;
    private double resultRun100;
    private double resultLongJump;
    private double resultSwimming100;
    private boolean inGame;
    private  static final Random rnd = new Random();

    Athlete(String name){
        this.name = name;
        this.inGame = true;
    }

    public String getName() {
        return name;
    }

    public double getResultRun100() {
        return resultRun100;
    }

    public double getResultLongJump() {
        return resultLongJump;
    }

    public double getResultSwimming100() {
        return resultSwimming100;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public void PlayGames(){
        this.resultRun100 = 6 + rnd.nextDouble() * 8;
        this.resultLongJump = 5 + rnd.nextDouble() * 6;
        this.resultSwimming100 = 45 + rnd.nextDouble() * 30;
    }
}
