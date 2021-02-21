package Lecture01_Object;

/*
4 Объект - зарядка от телефона
Состояние: вкл./выкл. в сеть подкл./откл. к телефону
Поведение: при подключении к телефону и сети начинается подзарядка;
 */
public class Task04_PhoneCharger {
    private boolean isConnectRosette;
    private boolean isConnectPhone;

    public Task04_PhoneCharger(boolean isConnectRosette, boolean isConnectPhone) {
        this.isConnectRosette = isConnectRosette;
        this.isConnectPhone = isConnectPhone;
    }

    public void chargePhone() {
        if (isConnectPhone && isConnectRosette) {
            System.out.println("Телефон заряжается.");
        } else {
            System.out.println("Телефон не заряжается.");
        }
    }

    public boolean isConnectRosette() {
        return isConnectRosette;
    }

    public void setConnectRosette(boolean connectRosette) {
        isConnectRosette = connectRosette;
    }

    public boolean isConnectPhone() {
        return isConnectPhone;
    }

    public void setConnectPhone(boolean connectPhone) {
        isConnectPhone = connectPhone;
    }

    @Override
    public String toString() {
        return "Зарядка от телефона " +
                (isConnectRosette ? "включена в сеть" : "отключена от сеть") +
                (isConnectPhone ? ", подключена к телефону." : ", отключена от телефона.");
    }
}
