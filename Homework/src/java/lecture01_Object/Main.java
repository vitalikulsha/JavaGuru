package java.lecture01_Object;

public class Main {
    public static void main(String[] args) {
        //Объект 1 - Зубная щетка
        Task01_Toothbrush toothbrush = new Task01_Toothbrush(500, 80);
        toothbrush.brushTeeth();
        System.out.println(toothbrush.toString());
        //Объект 2 - Газова плита
        Task02_GasStove gasStove = new Task02_GasStove(true, false);
        gasStove.switchStove();
        System.out.println(gasStove.toString());
        gasStove.setRegulateFlame(true);
        gasStove.switchStove();
        System.out.println(gasStove.toString());
        //Объект 3 - Подгузники-трусики
        Task03_DiaperPanties diaperPanties = new Task03_DiaperPanties(true);
        diaperPanties.retainMoisture(100);
        System.out.println(diaperPanties.toString());
        //Объект 4 - Зарядка от телефона
        Task04_PhoneCharger phoneCharger = new Task04_PhoneCharger(true, true);
        phoneCharger.chargePhone();
        phoneCharger.setConnectPhone(false);
        phoneCharger.chargePhone();
        System.out.println(phoneCharger.toString());
        //Объект 5 - Bluetooth-наушники
        Task05_BluetoothHeadphones bluetoothHeadphones = new Task05_BluetoothHeadphones(60, true, false);
        bluetoothHeadphones.connectHeadphonesDevice(true);
        bluetoothHeadphones.setTurnedOn(true);
        bluetoothHeadphones.connectHeadphonesDevice(true);
        System.out.println(bluetoothHeadphones.toString());
        //Объект 6 - Лампочка.
        Task06_LightBulb lightBulb = new Task06_LightBulb(true);
        System.out.println(lightBulb.toString());
        //Объект 7 - Куртка
        Task07_Jacket jacket = new Task07_Jacket(true);
        jacket.buttonUp();
        System.out.println(jacket.toString());
        //Объект 8 - Машина
        Task08_Car car = new Task08_Car(true, false);
        car.drive();
        System.out.println(car.toString());
        //Объект 9 - Дезодорант
        Task09_Deodorant deodorant = new Task09_Deodorant(150);
        deodorant.sprayAerosol();
        System.out.println(deodorant.toString());
        //Объект 10 - Мыло
        Task10_Soap soap = new Task10_Soap(100);
        soap.lather();
        System.out.println(soap.toString());
    }
}
