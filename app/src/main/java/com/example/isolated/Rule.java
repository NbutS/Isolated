package com.example.isolated;

public class Rule {
    private String name,explanation;
    private int id;
    private String imgUrl;


    public Rule(String name, String explanation, int id, String imgUrl) {
        this.name = name;
        this.explanation = explanation;
        this.id = id;
        this.imgUrl = imgUrl;
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
