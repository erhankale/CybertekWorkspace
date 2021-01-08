package Review12192020;

public class Employee extends Person{ //Employee IS A Person
    // attributes name, age, gender, hourlyRate, jobTitle, isFullTime, ID
    public String ID, jobTitle;
    public double hourlyRate;
    public boolean isFullTime;

    public Employee(String name, int age, char gender, String ID, String jobTitle, double hourlyRate, boolean isFullTime) {

        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public double calculateSalary() { //40 hours in a week
        if (isFullTime) {
            return hourlyRate * 40 * 52;
        } else {
            return hourlyRate * 20 * 52;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                "ID='" + ID + '\'' +
                ", hourlyRate= $" + hourlyRate +
                ", isFullTime=" + isFullTime +
                ", Salary = $" + calculateSalary() +
                '}';
    }
}
