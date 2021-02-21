package Lecture01_Object;

/*
6 Объект - лампочка
Состояние: выкл./вкл.
Поведение: при подаче напряжения свет есть (вкл.), при отсутствии света нет (выкл.).
 */
public class Task06_LightBulb {
    private boolean isTurnedOn;

    public Task06_LightBulb(boolean connect) {
        voltageSupply(connect);
    }

    public void voltageSupply(boolean connect) {
        if (connect) {
            System.out.println("Напряжение подано. Лампочка горит.");
            this.isTurnedOn = true;
        } else {
            System.out.println("Напряжение отсутствует. Лампочка не горит.");
            this.isTurnedOn = false;
        }
    }

    @Override
    public String toString() {
        return "Лампочка " + (isTurnedOn ? "включена." : "выключена.");
    }
}
