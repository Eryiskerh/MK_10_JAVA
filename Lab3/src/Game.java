public class Game {

    public void Start(Athlete[] athletes, IDiscipline[] disciplines){
        for (Athlete athlete: athletes) {
            athlete.PlayGames();        // Set random result for each athlete
        }

        for (IDiscipline discipline: disciplines) {
            for (Athlete athlete: athletes) {
                if (athlete.isInGame())
                    athlete.setInGame(discipline.InGame(athlete));
            }
        }
        PrintWinners(athletes);
    }

    private void PrintWinners(Athlete[] athletes)
    {
        System.out.println("Winners:");
        System.out.println("name:\t\trunning on 100m\tlong jump\tswimming 100m");
        for (Athlete athlete: athletes)
            if (athlete.isInGame())
                System.out.printf("%s\t%.2f\t\t\t%.2f\t\t%.2f", athlete.getName(), athlete.getResultRun100(),
                        athlete.getResultLongJump(), athlete.getResultSwimming100());
    }
}
