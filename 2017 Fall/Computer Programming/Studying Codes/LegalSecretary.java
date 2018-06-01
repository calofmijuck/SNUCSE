public class LegalSecretary extends Secretary {
    public LegalSecretary(int years){
        super(years);
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    public double getSalary() {
        return 45000.0;
    }
}
