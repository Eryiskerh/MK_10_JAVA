public class LongJump implements IDiscipline{
    private static final double passingScore = 8.0;

    public boolean InGame(Athlete athlete){
        return (athlete.getResultLongJump() > passingScore);
    }
}
