package Review12192020;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam{
    //attributes BA, PO, SM
    //ArrayList<Tester>
    //ArrayList<Developer>

    public String BA, PO, SM;
    public ArrayList<Tester> testers ;
    public ArrayList<Developer> developers ;

    public ScrumTeam(String BA, String PO, String SM) {
        this.BA = BA;
        this.PO = PO;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public void hireTester(Tester tester){                      //bir tester hire etmek istedigimiz zaman
        this.testers.add(tester);
    }

    public void hireTester(Tester[] testers){                   //ArrayList icindeki bireden fazla testeri hire etmek icin
        //this.testers.addAll(Arrays.asList(testers) );         //burada iki methoddan birini kullanabiliriz!

        for (Tester eachTester : testers) {
            hireTester(eachTester);
            //this.testers.add(eachTester);
        }
    }

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void hireDeveloper(Developer[] developers){
        //this.developers.addAll(Arrays.asList(developers));
        for (Developer eachDeveloper: developers) {
            hireDeveloper(eachDeveloper);
            //this.developers.add(eachDeveloper);
        }
    }

    public void terminateTester(String ID){ //remove testers by ID
        //testers.removeIf(p -> p.ID.equals(ID));
        Tester tester = null;
        for (Tester eachTester : testers) {
            if (eachTester.ID.equals(ID)) {
                tester = eachTester;
            }
        }
        testers.remove(tester);
    }

    public void terminateDeveloper(String ID){
        //developers.removeIf(p->p.ID.equals(ID));

        Developer developer = null;

        for (Developer eachDev : developers) {
            if (eachDev.ID.equals(ID)){
                developer = eachDev;
            }
        }
        developers.remove(developer);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "BA='" + BA + '\'' +
                ", PO='" + PO + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }

    public void dailyStandUp(){
        System.out.println(SM+" is doing daily stand up meeting");
    }


}
