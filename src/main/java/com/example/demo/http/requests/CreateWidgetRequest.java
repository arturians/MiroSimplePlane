package com.example.demo.http.requests;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CreateWidgetRequest {

    @NotNull
    private Integer x;

    @NotNull
    private Integer y;

    private Integer zIndex;

    @NotNull
    @Min(value = 1, message = "Width should be positive")
    private Integer width;

    @NotNull
    @Min(value = 1, message = "Height should be positive")
    private Integer height;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZIndex() {
        return zIndex;
    }

    public void setZIndex(Integer zIndex) {
        this.zIndex = zIndex;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
