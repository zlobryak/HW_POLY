import taxes.IncomeTaxSystem;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        TaxSystem taxSystem = new IncomeTaxSystem();
        Company company = new Company("CompanyName",taxSystem);
    }
}