import java.util.ArrayList;

public class ГЕНЕРАЛ extends ЛЮДИНА {

    private ArrayList<КОМАНДИР> составКоманды = new ArrayList<КОМАНДИР>(2);

    public ГЕНЕРАЛ(String фамилия, int возраст, boolean здоров) {
        super(фамилия, возраст, здоров);
    }

    public void добавитьВКоманду(КОМАНДИР командир) {
         составКоманды.add(командир);
    }

    public boolean МОЖУ_ВОЮВАТИ() throws Ограничения {
        if (this.getВозраст() < 20 ) throw new Ограничения("Еще слишком мал");
        return isЗдоров()? true:false;
    }

    public String ДОПОВІДАТИ() throws Ограничения {
        if (this.getФамилия() == null) throw new Ограничения();
        return "Приветствую " + this.toString();
    }

    @Override
    public String toString() {
        return "ГЕНЕРАЛ{" +
                "Моя фамилия " + getФамилия()  +
                ",мне " + getВозраст()  +
                ", в моем подчинении " + '\n' + составКоманды  +
                '}';
    }
}



