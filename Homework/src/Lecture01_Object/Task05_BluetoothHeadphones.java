package Lecture01_Object;

/*
5 Объект - Bluetooth наушники
Состояние: уровень заряда; уровень громкости +/-; вкл./выкл.
Поведение: при включении и подключении к устройству транслируется звук
(при нажатии клавиши "уровень громкости+" громкость становится больше, при нажатии "уровень громкости-" - меньше).
 */
public class Task05_BluetoothHeadphones {
    private int batteryLevel;
    private boolean volumeLevel;
    private boolean isTurnedOn;

    public Task05_BluetoothHeadphones(int batteryLevel, boolean volumeLevel, boolean isTurnedOn) {
        {
            if (batteryLevel < 100 || batteryLevel > 0) {
                this.batteryLevel = batteryLevel;
            } else {
                System.out.println("Уровень заряда наушников указан не верно. Установлен на '0'.");
                this.batteryLevel = 0;
            }
        }
        this.volumeLevel = volumeLevel;
        this.isTurnedOn = isTurnedOn;
    }

    public void connectHeadphonesDevice(boolean connect) {
        if (isTurnedOn) {
            System.out.print("Наушники включены ");
            if (connect) {
                System.out.println("и подключены к устройству. Играет музыка.");
                if (volumeLevel) {
                    System.out.println("Громкость увеличена.");
                } else {
                    System.out.println("Громкость уменьшена.");
                }
            } else {
                System.out.println(", но не подключены к устройству.");
            }
        } else {
            System.out.println("Наушники выключены.");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(boolean volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    @Override
    public String toString() {
        return "Bluetooth-наушники " +
                (isTurnedOn ? "включены" : "выключены") +
                ", уровень заряда " + batteryLevel +
                ", регулятор громкости " + (volumeLevel ? "увеличивает громкость." : "уменьшает громкость.");
    }
}
