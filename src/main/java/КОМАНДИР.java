import java.util.ArrayList;

public class КОМАНДИР extends ЛЮДИНА {

    private ArrayList<СОЛДАТ> составКоманды = new ArrayList<СОЛДАТ>(3);

    public КОМАНДИР(String фамилия, int возраст, boolean здоров) {
        super(фамилия, возраст, здоров);
    }

    public void добавитьВКоманду(СОЛДАТ солдат) {
        составКоманды.add(солдат);
    }

    public boolean МОЖУ_ВОЮВАТИ() throws Ограничения {
        if (this.getВозраст() < 20 ) throw new Ограничения("Еще слишком мал");
        return isЗдоров()? true:false;
    }

    public String ДОПОВІДАТИ() throws Ограничения {
        if (this.getФамилия() == null) throw new Ограничения();
        return toString();
    }

    @Override
    public String toString() {
        return "КОМАНДИР{" +"" +
                "Моя фамилия " + getФамилия() +
                ",мне " + getВозраст() +
                ", в моем подчинении " + '\n' + составКоманды +
                '}';
    }
}
