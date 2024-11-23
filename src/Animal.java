public class Animal {
    private final String kind;
    private final String yearColor;
    private final boolean isHair;

    public Animal(Builder builder) {
        this.kind = builder.kind;
        this.yearColor =builder.yearColor;
        this.isHair = builder.isHair;
    }

    public static class Builder{
        private final String kind;
        private String yearColor = "brown";
        private boolean isHair = true;

        public Builder(String kind) {
            if (kind == null || kind.trim().isEmpty()) {
                throw new IllegalArgumentException("Kind cannot be null or empty.");
            }
            this.kind = kind;
        }

        public Builder yearColor(String yearColor) {
            if (yearColor == null || yearColor.trim().isEmpty()) {
                throw new IllegalArgumentException("Color cannot be null or empty.");
            }
            this.yearColor = yearColor;
            return this;
        }

        public Builder isHair(boolean isHair) {
            this.isHair = isHair;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal {" +
                " kind " + kind +
                ", yearColor " + yearColor +
                ", isHair " + isHair +
                "}";
    }
}
