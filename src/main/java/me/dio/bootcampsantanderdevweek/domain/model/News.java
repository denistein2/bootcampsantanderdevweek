package me.dio.bootcampsantanderdevweek.domain.model;

public class News {
    private String icon;
    private String description;

    // Construtor
    public News(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }

    // Getters e Setters
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "News{" +
                "icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
