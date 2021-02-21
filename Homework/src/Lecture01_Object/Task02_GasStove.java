package Lecture01_Object;

/*
2 Объект - Газовая плита:
Состояние : вкл./выкл. регулировка пламени +/-
Поведение: при включении присутсвтует пламя и можно регулировать его мощность
("регулировка пламени+" - мощность становится больше, "регулировка пламени-" - мощность становится меньше);
при выключении пламя потухает.
 */
public class Task02_GasStove {
    private boolean isTurnedOn;//вкл/выкл - true/false
    private boolean regulateFlame; //регулировка пламени +/-

    public Task02_GasStove(boolean isTurnedOn, boolean regulateFlame) {
        this.isTurnedOn = isTurnedOn;
        this.regulateFlame = regulateFlame;
    }

    //вкл/выкл плиты
    public void switchStove() {
        if (isTurnedOn) {
            System.out.println("Плита включена. Пламя горит.");
            if (regulateFlame) {
                System.out.println("Мощность увеличена.");
            } else {
                System.out.println("Мощность уменьшена.");
            }
        } else {
            System.out.println("Плита выключена. Пламя не горит.");
        }
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public boolean isRegulateFlame() {
        return regulateFlame;
    }

    public void setRegulateFlame(boolean regulateFlame) {
        this.regulateFlame = regulateFlame;
    }

    @Override
    public String toString() {
        return "Газова плита" + (isTurnedOn ? " включена" : " выключена") +
                ", регулятор" + (regulateFlame ? " увеличивает пламя." : " уменьшает пламя.");
    }
}
