package rb.practice.metaphysical_app.models;

public abstract class AbstractEntity {

    //TODO: Add @ID @GeneratedValue
    private int id;
    private static int nextId;

    //TODO: Add validation to not be blank
    private String name;

    //TODO: Update constructor to be default(empty) when we start persistence
    public AbstractEntity() {
        id = nextId;
        nextId++;
    }

    public AbstractEntity(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
