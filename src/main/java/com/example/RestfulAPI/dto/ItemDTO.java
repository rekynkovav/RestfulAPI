package com.example.RestfulAPI.dto;

public class ItemDTO {

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ItemDTO() {
    }

    public ItemDTO(String title) {
        this.title = title;
    }
}
