package org.example.repositories;

import org.example.models.Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankRepository implements IRepository<Bank>{
    protected static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    protected static final String USER = "rm99997";
    protected static final String PASS = "081104";
    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    @Override
    public List<Bank> GetAll() throws Exception {
        return null;
    }

    @Override
    public Bank GetById(int id) {
        return null;
    }

    @Override


    public void Save(Bank item) throws Exception {

    }

    @Override
    public void Update(Bank item) {

    }

    @Override
    public void Delete(int id) {

    }
}
