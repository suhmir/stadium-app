package edu.spandit3.mysoccerstadiums;

public class Location {

    private final String name;
    private final String description;
    private final String location;
    private final int imageID;



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getImageID() {
        return imageID;
    }

    public Location(String name, String description, String location, int imageID) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.imageID = imageID;
    }
}
