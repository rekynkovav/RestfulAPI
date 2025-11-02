package com.example.RestfulAPI.dto;

import java.util.Objects;

public class ItemDTO {

    private String title;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public ItemDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemDTO itemDTO = (ItemDTO) o;
        return id == itemDTO.id && Objects.equals(title, itemDTO.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id);
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
               "title='" + title + '\'' +
               ", id=" + id +
               '}';
    }
}
