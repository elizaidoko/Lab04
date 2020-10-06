package Lab04.exercise1;

public class Computer {
    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;


    public Computer(){
        this(null,null,0,0,0);

    }

    public Computer(String manufacturer, String type, double speed, int RAM, double price){
        this.manufacturer = manufacturer;
        this.type = type;
        if(speed > 0)
            this.speed = speed;
        if(RAM > 0)
            this.RAM = RAM;
        if(price > 0)
            this.price = price;

    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getType(){
        return type;
    }

    public double getSpeed(){
        return speed;
    }

    public int getRAM(){
        return RAM;
    }

    private double getPrice(){
        return price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(double speed) {
        if(speed>0)
            this.speed = speed;
    }

    public void setRAM(int RAM) {
        if(RAM > 0)
            this.RAM = RAM;
    }

    public void setPrice(double price) {
        if(price>0)
            this.price = price;

    }

    public String toString(){
        return "Manufacturer: " + getManufacturer() + " Type: " + getType() + " Speed: " + getSpeed() +
                " RAM: " + getRAM() + " Price: " + getPrice();
    }
}
