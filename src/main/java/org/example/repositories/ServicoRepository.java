package org.example.repositories;

import org.example.models.Servico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class ServicoRepository implements IRepository<Servico>{
    protected static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    protected static final String USER = "rm99997";
    protected static final String PASS = "081104";
    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
    @Override
    public List<Servico> GetAll() {
        return null;
    }

    @Override
    public Servico GetById(int id) {
        return null;
    }

    @Override
    public void Save(Servico item) throws Exception {

    }

    @Override
    public void Update(Servico item) {

    }

    @Override
    public void Delete(int id) {

    }
}
