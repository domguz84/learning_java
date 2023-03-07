package OOP;

import java.util.Arrays;
import java.util.Objects;

public class Square implements Comparable<Square> {

    private int side;

    public Square() {
        this.side = 5;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int caluletePerimeter() {
        return 4 * side;
    }

    public int caluleteArea() {
        return side * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Square with side = " + side;
    }
    
    @Override
    public int compareTo(Square o) {
        if (this.caluleteArea() < o.caluleteArea()) {
            return -1;
        }
        if (this.caluleteArea() > o.caluleteArea()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Square[] k = new Square[5];
        k[0] = new Square();
        k[1] = new Square(2);
        k[2] = new Square(5);
        k[3] = new Square(3);
        k[4] = new Square(5);

        Arrays.sort(k);
        System.out.println(Arrays.toString(k));

        for (int i = 0; i < k.length - 1; i++) {
            if (k[i].equals(k[i + 1])) {
                k[i] = null;
            }
        }
        System.out.println(Arrays.toString(k));
    }
}
