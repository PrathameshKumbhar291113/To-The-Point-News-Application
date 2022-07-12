package com.example.tothepointnews;

public class CategoryRVModal{
    private String category;
    private String categoryImageUrl;

    public CategoryRVModal(String category, String categoryImageUrl) {
        this.category = category;
        this.categoryImageUrl = categoryImageUrl;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }
}
