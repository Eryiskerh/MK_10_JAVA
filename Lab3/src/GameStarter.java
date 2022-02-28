public class GameStarter {
    private Athlete[] athletes;
    private IDiscipline[] disciplines;
    private  Game game;

    GameStarter(){
        Athlete[] athletes = new Athlete[4];
        for (int i = 0; i < athletes.length; i++)
            athletes[i] = new Athlete("athlete"+i);
        disciplines = new IDiscipline[3];
        disciplines[0] = new Run100meters();
        disciplines[1] = new LongJump();
        disciplines[2] = new Swimming100meters();
        //game = new Game(athletes, disciplines);
        game = new Game();
        game.Start(athletes, disciplines);
    }
}
