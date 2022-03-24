package com.example.isolated;

public class Rule {
    private String name,explanation;
    private int id;
    private String imgUrl;
    private boolean isExpanded;

    public Rule(String name, String explanation, int id, String imgUrl) {
        this.name = name;
        this.explanation = explanation;
        this.id = id;
        this.imgUrl = imgUrl;
        isExpanded = false;
    }


    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "name='" + name + '\'' +
                ", explanation='" + explanation + '\'' +
                ", id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
