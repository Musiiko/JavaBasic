package hillel.homework.hw11;

import java.util.Arrays;

public class Warehouse {
    protected  int capacity;
    protected Box[] boxes;

    public Warehouse(int capacity) {
        try {
            if (capacity <= 0){
                throw new IllegalArgumentException("Data entry error capacity");
            }
            this.capacity = capacity;
            boxes = new Box[capacity];
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "\n"  +
                Arrays.toString(boxes);
    }

    public void addBox (Box box, int position) {
        try {
            if (0 > position && position >= capacity ){
                throw new ArrayIndexOutOfBoundsException();
            }
            boxes[position] = box;
        }catch(ArrayIndexOutOfBoundsException ea) {
            System.out.println("The index you have entered is invalid");
            System.out.println("Please enter an index number between 0 and 3" + "\n");
        }
    }
}

