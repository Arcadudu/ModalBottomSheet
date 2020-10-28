package ru.arcadudu.modalbottomsheet;

public class Model {

    private String title, content, description;
    private int image;

    public Model(String title, String description, String content, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
