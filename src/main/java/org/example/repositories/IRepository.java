package org.example.repositories;

import java.util.List;

public interface IRepository <T> {
    List<T> GetAll();
    T GetById(int id);
    void Save(T item) throws Exception;
    void Update(T item);
    void Delete(int id);
}
