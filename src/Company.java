import taxes.TaxSystem;
import deals.Deal;

public class Company {
    String title;
    int debit = 0;  //Доходы
    int credit = 0; //Расходы
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        //У компании должен быть метод shiftMoney(int amount), который работает так
        if (amount > 0){
            //если amount больше 0, то увеличивается значение debit на amount;
            debit = debit + amount;
        } else if (amount <0 ) {
            //если amount меньше 0, то увеличивается значение credit на Math.abs(amount);
            credit = credit + Math.abs(amount);
        }
        //если amount равен 0, то ничего не происходит.
    }

    public void payTaxes(){
        //System.out.printf("Debit: %d, Credit: %d\n", debit, credit); //Debug
        System.out.printf(
                "Компания %s уплатила налог в размере: %d руб.\n",
                title,
                taxSystem.calcTaxFor(debit, credit));
        debit = 0;
        credit =0;

        //рассчитает с помощью выбранной этой компанией системы налогообложения размер налогов;
        //выведет сообщение на экран вида: Компания <название> уплатила налог в размере: <сумма> руб.;
        //обнулит счётчики debit и credit.
    }


   public int applyDeals(Deal[] deals) {
       for (Deal deal : deals) {
           debit = debit + deal.getDebitChange();
           credit = credit + deal.getCreditChange();
           System.out.println(deal.getComment());

       }
        int balance = debit - credit;

       payTaxes();
       // Если расходы оказались больше, то налог посчитается отрицательным
       return Math.max(balance, 0);
       //В классе Company создайте метод int applyDeals(Deal[] deals), в результате вызова которого:
       //компания применяет все сделки из массива сделок,
       //(т. е. увеличивает credit на creditChange, debit на debitChange);
       //выплачивает все налоги;
       //возвращает из метода разницу доходов и расходов,
       // которая была на момент старта уплаты налогов.
    }
}
