public class Swimming100meters implements IDiscipline{
    private static final double passingScore = 55.0;

    public boolean InGame(Athlete athlete){
        return (athlete.getResultSwimming100() < passingScore);
    }
}
