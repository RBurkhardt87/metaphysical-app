package rb.practice.metaphysical_app.models;

import org.yaml.snakeyaml.introspector.Property;

import java.util.ArrayList;
import java.util.List;

public class Stone extends AbstractEntity {

    //TODO: Add Many to Many annotation
    private List<ZodiacSign> associatedSigns = new ArrayList<>();

    //TODO: Add many to many annotation
    private List<Element> associatedElement = new ArrayList<>();

    //TODO: Add many to many annotation
    private List<MPProperty> properties = new ArrayList<>();


    public Stone() {
    }

    public Stone(List<ZodiacSign> associatedSigns, List<Element> associatedElement, List<MPProperty> properties) {
        super();
        this.associatedSigns = associatedSigns;
        this.associatedElement = associatedElement;
        this.properties = properties;
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


    //TODO: I might need to write a loop to print out the arraylist. Or try StringBuilder maybe
    @Override
    public String toString() {
        return getName() + "is associated with " +
                associatedSigns + " zodiac signs and the elemental signs of " +
                associatedElement + ". Some of the properties it is known for is " +
                properties;
    }
}
