public class Barrel {
    private final double volume;
    private final String storedMaterial;
    private final String barrelMaterial;

    public Barrel(Builder builder) {
        this.volume = builder.volume;
        this.storedMaterial = builder.storedMaterial;
        this.barrelMaterial = builder.barrelMaterial;
    }

    public static class Builder{
        private final double volume;
        private String storedMaterial = "Water";
        private String barrelMaterial = "Plastic";

        public Builder(double volume) {
            if (volume < 5 || volume > 100) {
                throw new IllegalArgumentException("Volume must be between 5 and 100.");
            }
            this.volume = volume;
        }

        public Builder storedMaterial(String storedMaterial) {
            if (storedMaterial == null || storedMaterial.trim().isEmpty()) {
                throw new IllegalArgumentException("Stored Material cannot be null or empty.");
            }
            this.storedMaterial = storedMaterial;
            return this;
        }

        public Builder barrelMaterial(String barrelMaterial) {
            if (barrelMaterial == null || barrelMaterial.trim().isEmpty()) {
                throw new IllegalArgumentException("Barrel Material cannot be null or empty.");
            }
            this.barrelMaterial = barrelMaterial;
            return this;
        }

        public Barrel build(){
            return new Barrel(this);
        }
    }
    @Override
    public String toString() {
        return "Barrel {" +
                " volume " + volume +
                ", storedMaterial " + storedMaterial +
                ", barrelMaterial " + barrelMaterial +
                "}";
    }
}
