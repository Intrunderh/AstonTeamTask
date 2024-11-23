public class Human {
    private final String surname;
    private final Gender gender;
    private final int age;

    public Human(Builder builder) {
        this.surname = builder.surname;
        this.gender = builder.gender;
        this.age = builder.age;
    }

    public static class Builder{
        private final String surname;
        private Gender gender = Gender.MAN;
        private int age = 18;

        public Builder(String surname) {
            if (surname == null || surname.trim().isEmpty()) {
                throw new IllegalArgumentException("Surname cannot be null or empty.");
            }
            this.surname = surname;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age must be between 0 and 120.");
            }
            this.age = age;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    @Override
    public String toString() {
        return "Human {" +
                " surname " + surname +
                ", gender " + gender +
                ", age " + age +
                "}";
    }
}
