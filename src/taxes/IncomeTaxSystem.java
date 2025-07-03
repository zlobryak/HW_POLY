package taxes;

public class IncomeTaxSystem extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = debit * 6 / 100;
        //Информационное сообщение для вычисления количества вызовов
        System.out.println("Считаем налог на доходы");

        // если расходы оказались больше, то налог посчитается отрицательным
        return Math.max(tax, 0);
    }
}
