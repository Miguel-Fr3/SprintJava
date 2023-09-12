package org.example.repositories;

import org.example.models.Saude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class SaudeRepository implements IRepository<Saude>{
    protected static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    protected static final String USER = "rm99997";
    protected static final String PASS = "081104";
    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
    @Override
    public List<Saude> GetAll() {
        return null;
    }

    @Override
    public Saude GetById(int id) {
        return null;
    }

    @Override
    public void Save(Saude item) throws Exception {

    }

    @Override
    public void Update(Saude item) {

    }

    @Override
    public void Delete(int id) {

    }
}
