package com.example.demo.storage;

public interface IWidgetsRepository {
    WidgetModel add(int x, int y, Integer zIndex, int width, int height);
    WidgetModel update(long id, Integer x, Integer y, Integer zIndex, Integer width, Integer height) throws NotFoundException;
    WidgetModel get(long id) throws NotFoundException;
    WidgetModel[] getAll() throws NotFoundException;
    void delete(long id);
}
