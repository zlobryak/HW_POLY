package deals;

public class Deal {
    String comment;
    int creditChange; //Увеличивается при продажах
    int debitChange; //Уыеличивается при покупках

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public String getComment() {
        return comment;
    }

    public int getCreditChange() {
        return creditChange;
    }

    public int getDebitChange() {
        return debitChange;
    }
    //Создайте в вашем проекте дополнительный класс Deal,
    // объект которого будет описывать сделку,
    // что может провернуть компания.
    // Каждая сделка сопровождается комментарием (comment),
    // суммой расходов (creditChange) и суммой доходов (debitChange).
    // Создайте конструктор, который принимает эти три параметра.
}
