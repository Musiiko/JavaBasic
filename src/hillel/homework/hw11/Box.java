package hillel.homework.hw11;

public class Box {
    protected int width;
    protected int height;
    protected int length ;
    protected Material material;


    public Box(int width, int height, int length, Material material) {
        try {
            if ( width <= 0 || height <= 0 || length <=0 || material == null) {
                throw new IllegalArgumentException("Error in input data");
            }
            this.width = width;
            this.height = height;
            this.length = length;
            this.material = material;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Box {" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", material=" + material +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
