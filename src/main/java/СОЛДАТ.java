public class СОЛДАТ extends ЛЮДИНА {

    public СОЛДАТ(String фамилия, int возраст) {
        super(фамилия, возраст, true);
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
        return "СОЛДАТ{" +
                "Моя фамилия " + getФамилия()  +
                ",мне " + getВозраст() + '\n' +
                ",больным я быть не могу!" +
                '}';
    }
}
