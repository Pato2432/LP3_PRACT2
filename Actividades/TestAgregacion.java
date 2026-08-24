class Motor {
    int numMotor;
    int revPorMin;

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getRevPorMin() {
        return revPorMin;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    public String toString() {
        return "Motor: " + numMotor + " RPM: " + revPorMin;
    }
}
class Automovil {
    String placa;
    int numPuertas;
    String marca;
    String modelo;
    Motor motor;

    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String toString() {
        return placa + " " + numPuertas + " " + marca + " " + modelo + " " + motor;
    }
}


public class TestAgregacion {
    public static void main(String[] args) {

        Motor motor1 = new Motor(101, 5000);
        Motor motor2 = new Motor(202, 6500);

        Automovil auto1 = new Automovil("ABC-123", 4, "Toyota", "Corolla");
        Automovil auto2 = new Automovil("XYZ-456", 2, "Ford", "Mustang");

        auto1.setMotor(motor1);
        auto2.setMotor(motor2);

        System.out.println("AUTOMOVIL 1");
        System.out.println(auto1);

        System.out.println("AUTOMOVIL 2");
        System.out.println(auto2);
    }
}