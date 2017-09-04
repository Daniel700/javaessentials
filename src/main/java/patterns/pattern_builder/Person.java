package patterns.pattern_builder;

/**
 * Builder implementation as inner class
 */
public final class Person {

    // Make these attributes final if Person should be immutable after creation
    private final String name;
    private final int age;
    private final int height;
    private final int weight;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }


    public final static class Builder {
        private final String name;
        private int age;
        private int height;
        private int weight;

        // This attribute is mandatory!!!
        public Builder(String name) {
            this.name = name;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }

        public Builder withHeight(int height){
            this.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            this.weight = weight;
            return this;
        }

        public Person build(){
            // Optional: do checks and validations here...
            return new Person(this);
        }

    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

}
