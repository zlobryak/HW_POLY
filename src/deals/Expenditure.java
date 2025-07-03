package deals;

public class Expenditure extends Deal{
    public Expenditure(String comment, int creditChange) {
        super(String.format ("Покупка %s на %d руб.", comment, creditChange),
                creditChange,
                0);

    }

    //Объект Expenditure должен конструироваться от названия товара и его цены,
    // являясь сделкой с комментарием (comment) вида Покупка <название товара> на <цена> руб.,
    // creditChange размером в цену и нулевым debitChange
}
