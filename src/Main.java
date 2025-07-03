import taxes.IncomeMinusExpensesTaxSystem;
import taxes.IncomeTaxSystem;
import taxes.TaxSystem;
import deals.Expenditure;
import deals.Sale;
import deals.Deal;

public class Main {
    public static void main(String[] args) {

        //Проверим работу расчёта налогов в двух разных
        System.out.print("Для УСН доходы:\n");
        TaxSystem taxIncome = new IncomeTaxSystem();
        Company company = new Company("CompanyName",taxIncome);
        company.shiftMoney(+100);
        company.shiftMoney(-20);
        company.payTaxes();

        System.out.print("Для УСН доходы минус расходы:\n");
        TaxSystem taxIncomeMinusExpenses = new IncomeMinusExpensesTaxSystem();
        Company company1 = new Company("CompanyName1", taxIncomeMinusExpenses);
        company1.shiftMoney(10100);
        company1.shiftMoney(-100);
        company1.payTaxes();

        System.out.println();


        //Создадим список сделок:
        Deal[] deals= {
                new Expenditure("Бумага", 100),
                new Sale("Мороженное",  60),
                new Sale("Квас", 140)
        };
        Deal[] deals1 ={
                new Expenditure("Упаковочная пленка", 1000),
                new Sale("Колбаса",  2000),
                new Sale("Сыр",  2000),
                new Sale("Творог", 7000)
        };
        //Проверим работу метода рассчитывающего сделки
        System.out.print("Раcчёт списка сделок:\n\n");


        System.out.printf(
                "Разница дохолов и расходов компании %s: %d\n",
                company.title, company.applyDeals(deals));

        System.out.println();

        System.out.printf(
                "Разница доходов и расходов компании %s: %d\n",
                company1.title, company1.applyDeals(deals1));


    }
}