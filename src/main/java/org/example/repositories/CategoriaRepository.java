package org.example.repositories;

import org.example.models.Categoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class CategoriaRepository implements IRepository<Categoria>{
    protected static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    protected static final String USER = "rm99997";
    protected static final String PASS = "081104";
    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
    @Override
    public List<Categoria> GetAll() {
        return null;
    }

    @Override
    public Categoria GetById(int id) {
        return null;
    }

    @Override
    public void Save(Categoria item) throws Exception {

    }

    @Override
    public void Update(Categoria item) {

    }

    @Override
    public void Delete(int id) {

    }
}
