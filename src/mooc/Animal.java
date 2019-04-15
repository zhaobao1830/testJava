package mooc;

import javafx.scene.AmbientLight;

import java.util.Objects;

public class Animal {
    int age = 10;
    String name = "zb";


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
