package rb.practice.metaphysical_app.models;

import java.util.ArrayList;
import java.util.List;

public class MPProperty extends AbstractEntity {


    //TODO: add many to many annotation
    private List<Stone> stones = new ArrayList<>();

    //TODO: add many to many annotation
    private List<Herb> herbs = new ArrayList<>();

    //TODO: add validation if needed
    private String description;


    //empty constructor for hibernate
    public MPProperty() {
    }

    //overloaded constructor that takes in just name and description
    public MPProperty(String description) {
        super();
        this.description = description;
    }

    //TODO: remove this constructor if I end up not needing it
    //overloaded constructor that takes in everything, but I don't think I will need this. I want to add
    //properties to stones and herbs. I don't want to declare them as I am creating property tags
    public MPProperty(List<Stone> stones, List<Herb> herbs, String description) {
        super();
        this.stones = stones;
        this.herbs = herbs;
        this.description = description;
    }

    public List<Stone> getStones() {
        return stones;
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

    public List<Herb> getHerbs() {
        return herbs;
    }

    public void setHerbs(List<Herb> herbs) {
        this.herbs = herbs;
    }

    @Override
    public String toString() {
        return getName() + " : " + description;
    }
}
