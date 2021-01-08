package Review12192020;

public class AppleInc {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Alis", 28, 'M', "A01", "QA", 55, true);
        Tester tester2 = new Tester("Mike", 23, 'M', "A02", "QA", 50, false );
        Tester tester3 = new Tester("John", 27, 'M', "A03", "QA", 52, true);

        Tester[] testers = {tester2, tester3};

        Developer developer1 = new Developer("Eren", 29, 'M', "B01", "Java Developer", 65, true);
        Developer developer2 = new Developer("Zeyn", 30, 'F', "B02", "Software Developer", 61, true);
        Developer developer3 = new Developer("Hans", 24, 'M', "B03", "Java Developer", 62, false);
        Developer developer4 = new Developer("Mick", 25, 'F', "B04", "Java Developer", 63, true);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam("Yakup", "Ilyas", "Baky");

        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);

        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);
        System.out.println(scrum1);

        System.out.println("=================================");
        //display the developers of the scrum team:
        double budget =0;
        for (Developer each : scrum1.developers) {
            System.out.println(each.name+ " : "+each.calculateSalary());
            budget +=each.calculateSalary();
        }

        System.out.println("=================================");
        //display the testers of the scrum team:
        for (Tester each : scrum1.testers) {
            System.out.println(each.name+ " : "+each.calculateSalary());
            budget +=each.calculateSalary();
        }
        System.out.println("=================================");
        System.out.println("budget = " + budget);



    }
}
