package HW1;

public class Main {
    public static void main(String[] args) {

        Team team1 = new Team("Побеждальщики", new People("Василий", 20, 70, 1, 500, 200),
                new People("Александр", 22, 73, 2, 600, 400),
                new People("Кирилл", 27, 80, 1, 400, 200),
                new People("Иван", 26, 75, 2, 700, 500));

        Team team2 = new Team("Проигрывальщики", new People("Сергей", 30, 120, 0, 100, 10),
                new People("Петр", 10, 42, 1, 20, 5),
                new People("Афанасий", 17, 67, 1, 200, 100),
                new People("Юрий", 22, 54, 1, 150, 50));

        team1.getTeamInfo();
        System.out.println();
        team2.getTeamInfo();

        System.out.println();

        Course course = new Course(2, 300, 200);

        course.doIt(team1);
        System.out.println();
        course.doIt(team2);

        System.out.println();

        course.whoWin(team1, team2);
    }
}
