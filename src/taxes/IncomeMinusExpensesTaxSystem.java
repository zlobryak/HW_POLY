package taxes;

public class IncomeMinusExpensesTaxSystem  extends TaxSystem{
    public int calcTaxFor(int debit, int credit) {
         int tax = (debit - credit) * 15 / 100;

        //Информационное сообщение для вычисления количества вызовов
        System.out.println("Считаем налог на доходы минус расходы");

        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
}
