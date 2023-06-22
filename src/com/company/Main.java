
public class Main {
    public void main(String[] args) {
        Voltage voltage = new Voltage();
        PhoneCharger phoneCharger = new PhoneCharger();
        Charger adapter = new Adapter(voltage);
        adapter.charger(phoneCharger);
    }
}