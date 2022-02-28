public class Run100meters implements IDiscipline{
    private static final double passingScore = 10.0;

    public boolean InGame(Athlete athlete){
        return (athlete.getResultRun100() < passingScore);
    }
}
