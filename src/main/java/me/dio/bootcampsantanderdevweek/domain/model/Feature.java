package me.dio.bootcampsantanderdevweek.domain.model;

public class Feature {
    private String icon;
    private String description;

    // Construtor
    public Feature(String icon, String description) {
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
        return "Feature{" +
                "icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
