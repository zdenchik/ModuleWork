public class ЛЮДИНА implements ЗДАТНИЙ_ДО_БОЙОВИХ_ДІЙ {
    private String фамилия;
    private int возраст;
    private boolean здоров;

    public ЛЮДИНА(String фамилия, int возраст, boolean здоров) {
        this.фамилия = фамилия;
        this.возраст = возраст;
        this.здоров = здоров;
    }

    @Override
    public String toString() {
        return "ЛЮДИНА{" +
                "Моя фамилия " + фамилия +
                ",мне " + возраст + '\n' +
                ",служить я " + (isЗдоров()? "всегда готов":"не в состоянии") +
                '}';
    }

    public int getВозраст() {
        return возраст;
    }

    public void setВозраст(int возраст) {
        this.возраст = возраст;
    }

    public boolean isЗдоров() {
        return здоров;
    }

    public void setЗдоров(boolean здоров) {
        this.здоров = здоров;
    }

    public String getФамилия() {
        return фамилия;
    }

    public void setФамилия(String фамилия) {
        this.фамилия = фамилия;
    }


    public boolean МОЖУ_ВОЮВАТИ() throws Ограничения {
        if (this.возраст < 20 ) throw new Ограничения("Еще слишком мал");
        return isЗдоров()? true:false;
    }

    public String ДОПОВІДАТИ() throws Ограничения {
        if (this.фамилия == null) throw new Ограничения();
        return "Приветствую " + this.toString();
    }
}
