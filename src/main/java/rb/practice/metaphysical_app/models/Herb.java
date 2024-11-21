package rb.practice.metaphysical_app.models;

import java.util.ArrayList;
import java.util.List;

public class Herb extends AbstractEntity {

    //TODO: remove this field if I end up not connecting stones and herbs together
    private List<Stone> stones = new ArrayList<>();

    //TODO: This is ENUM class and I might need to alter the code here
    //TODO: add many to many relationship
    private List<ZodiacSign> associatedSigns = new ArrayList<>();

    //TODO: This is ENUM class and I might need to alter this code as well
    //TODO: add many to many relationship
    private List<Element> associatedElement = new ArrayList<>();

    //TODO: add many to many relationship
    private List<MPProperty> properties = new ArrayList<>();


    //empty constructor hibernate
    public Herb(){}

    public Herb(List<Stone> stones, List<ZodiacSign> associatedSigns, List<Element> associatedElement, List<MPProperty> properties) {
        super();
        this.stones = stones;
        this.associatedSigns = associatedSigns;
        this.associatedElement = associatedElement;
        this.properties = properties;
    }

    public List<Stone> getStones() {
        return stones;
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

    public List<ZodiacSign> getAssociatedSigns() {
        return associatedSigns;
    }

    public void setAssociatedSigns(List<ZodiacSign> associatedSigns) {
        this.associatedSigns = associatedSigns;
    }

    public List<Element> getAssociatedElement() {
        return associatedElement;
    }

    public void setAssociatedElement(List<Element> associatedElement) {
        this.associatedElement = associatedElement;
    }

    public List<MPProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<MPProperty> properties) {
        this.properties = properties;
    }

    //TODO: may need to make a loop or StringBuilder to list out the elements in the properties arraylist
    @Override
    public String toString() {
        return getName() + " is known for these properties : " + properties;
    }
}
