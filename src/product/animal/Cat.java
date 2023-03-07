package product.animal;

public class Cat {
    public String name;
    public String color;
    public int numberOfLegs = 4;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Cat(String name, String color, int numberOfLegs) {
        this.name = name;
        this.color = color;
        this.numberOfLegs = numberOfLegs;


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }

    public void getvoise() {
        System.out.println("miooouuu");


    }
}

