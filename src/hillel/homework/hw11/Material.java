package hillel.homework.hw11;

public enum Material {
    PLASTIC("Plastic"),
    METAL("Metal"),
    WOOD("Wood"),
    GLASS("Glass"),
    FOG ("Fog");

    private String  material;

    Material(String materials) {
        this.material = materials;
    }

    public  String getMaterials () {
        return  material;
    }
}
