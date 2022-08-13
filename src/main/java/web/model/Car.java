package web.model;

public class Car {

    private String motor;

    private String kuzov;

    private int kolichectvoDverei;

    public Car(String motor, String kuzov, int kolichectvoDverei) {
        this.motor = motor;
        this.kuzov = kuzov;
        this.kolichectvoDverei = kolichectvoDverei;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getKuzov() {
        return kuzov;
    }

    public void setKuzov(String kuzov) {
        this.kuzov = kuzov;
    }

    public int getKolichectvoDverei() {
        return kolichectvoDverei;
    }

    public void setKolichectvoDverei(int kolichectvoDverei) {
        this.kolichectvoDverei = kolichectvoDverei;
    }
}
