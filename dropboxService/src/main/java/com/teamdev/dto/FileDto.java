package com.teamdev.dto;

import java.util.Map;

public class FileDto {

    private String name;
    private long size;

    private Map<String, Object> properties;

    public FileDto() {}

    public FileDto(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }
}
