package dev.luanfernandes.examples.srp.right;

public class Course {
    private String name;
    private String category;
    private String description;

    public Course createCourse(){
        return new Course();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
