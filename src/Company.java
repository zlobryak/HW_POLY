import taxes.TaxSystem;

public class Company {
    String title;
    int debit = 0;  //Доходы
    int credit = 0; //Расходы
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        //У компании должен быть метод shiftMoney(int amount), который работает так:
        //
        //если amount больше 0, то увеличивается значение debit на amount;
        //если amount меньше 0, то увеличивается значение credit на Math.abs(amount);
        //если amount равен 0, то ничего не происходит.
    }

    public void payTaxes(){
        //рассчитает с помощью выбранной этой компанией системы налогооблажения размер налогов;
        //выведет сообщение на экран вида: Компания <название> уплатила налог в размере: <сумма> руб.;
        //обнулит счётчики debit и credit.
    }


    int applyDeals(Deal[] deals) {
        //В классе Company создайте метод int applyDeals(Deal[] deals), в результате вызова которого:
        //
        //компания применяет все сделки из массива сделок
        // (т. е. увеличивает credit на creditChange, debit на debitChange);
        //выплачивает все налоги;
        //возвращает из метода разницу доходов и расходов,
        // которая была на момент старта уплаты налогов.
        int incomeMinusExpenses = 0;
        return incomeMinusExpenses;
    }
}
