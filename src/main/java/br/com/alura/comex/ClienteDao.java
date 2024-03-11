package br.com.alura.comex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {
    public Connection con;

    public ClienteDao(Connection con) {
        this.con = con;
    }
    public void cadastroDeCliente(Cliente cli){
        String sql= "INSERT INTO clientes(nome)\n" +
                "VALUES (?)";

        try {
           PreparedStatement statement = con.prepareStatement(sql);
           statement.setString(1,cli.getNome());
           statement.execute();
           statement.close();
           con.close();
        }
         catch (Exception ex){
        }
    }
public void deletarCliente(int idCliente){
        String sql= "DELETE FROM clientes WHERE id= ?";

        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(14, idCliente);
            int linhaA = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}

    }
