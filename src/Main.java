import taxes.IncomeTaxSystem;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        TaxSystem tax = new IncomeTaxSystem();
        Company company = new Company("CompanyName",tax);
        company.shiftMoney(+100);
        company.shiftMoney(-20);
    }
}