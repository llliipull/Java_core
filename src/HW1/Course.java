package HW1;

public class Course {

    private int jumpDistance;
    private int runDistance;
    private int swimDistance;

    public Course(int jumpDistance, int swimDistance, int runDistace) {
        this.jumpDistance = jumpDistance;
        this.swimDistance = swimDistance;
        this.runDistance = runDistace;
    }



    public void doIt(Team team){
        for (People people : team.getTeamMembers()) {
            if (people.getRunDistance() > this.runDistance || people.getSwimDistance() > swimDistance ||
                    people.getJumpDistance() > jumpDistance){
                team.increaseCount();
                System.out.println("Участник команды "+ team.getTeamName() + " - " + people.getName() + " Прошел испытание");
            } else {
                System.out.println("Участник команды "+ team.getTeamName() + " - " + people.getName() + " Не смог пройти испытание");
            }
        }
    }

    public void whoWin(Team team1, Team team2){
       if (team1.getCount() > team2.getCount()){
           System.out.println("Победила команда - " + team1.getTeamName());
       } else if (team1.getCount() == team2.getCount()){
           System.out.println("Ничья");
       } else {
           System.out.println("Победила команда - " + team2.getTeamName());
       }
    }

}
