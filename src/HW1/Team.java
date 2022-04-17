package HW1;


public class Team {

    private String teamName;
    private People[] teamMembers;
    private int count;

    public Team(String teamName, People ... teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }


    public People[] getTeamMembers() {
        return teamMembers;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public void getTeamInfo(){
        for (int i = 0; i < teamMembers.length; i++){
            System.out.println("Команда " + this.teamName + " Имя " + teamMembers[i].getName() + " Возраст " + teamMembers[i].getAge() +
                    " Вес " + teamMembers[i].getWeight() + " Длина прыжка " + teamMembers[i].getJumpDistance() + " Дистанция бега " +
                    teamMembers[i].getRunDistance() + " Дистанция плавания " + teamMembers[i].getSwimDistance());
        }
    }


    public void increaseCount(){
        count++;
    }

    public int getCount() {
        return this.count;
    }

}
