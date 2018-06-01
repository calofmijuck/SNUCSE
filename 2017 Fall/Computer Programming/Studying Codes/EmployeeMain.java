public class EmployeeMain {
    public static void main(String[] args){
        Secretary A = new Secretary(2);
        A.takeDictation("Hi");

        Employee eric = new LegalSecretary(2);
        (eric).getSalary();
        ((LegalSecretary) eric).fileLegalBriefs();
    }
}
