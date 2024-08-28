package com.project.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DatabaseUtil {
  private Connection connection;
  private Logger logger = Logger.getLogger(this.getClass().getName());
  public void getConnection() {
    try {
      if(connection == null || connection.isClosed()) {
        connection = DriverManager.getConnection("jdbc:sqlite:Portaldoslagos.db");
        logger.info("Connected to database");
        createAllTables();
      }
    } catch (SQLException e) {
      logger.info(e.toString());
    }
  }

  public void createAllTables() {
    createTablePorteiros();
    createTableMoradores();
    createTableVisitantes();
  }
  private void createTablePorteiros() {
    getConnection();
    String query = "CREATE TABLE IF NOT EXISTS porteiros ("
        + "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
        + "nome TEXT NOT NULL, "
        + "registroGeral TEXT NOT NULL, "
        + "cpf TEXT NOT NULL, "
        + "senha TEXT NOT NULL)";
    try (PreparedStatement statement = connection.prepareStatement(query)){
      statement.executeUpdate();
      logger.info("Table created");
    } catch (SQLException e) {
      logger.info(e.toString());
    }
  }

  private void createTableMoradores() {
    getConnection();
    String query = "CREATE TABLE IF NOT EXISTS moradores ("
        + "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
        + "nome TEXT NOT NULL, "
        + "cpf TEXT NOT NULL, "
        + "registroGeral TEXT NOT NULL, "
        + "telefone TEXT NOT NULL"
        + "lote TEXT NOT NULL)";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
      statement.executeUpdate();
      logger.info("Table created");
    } catch (SQLException e) {
      logger.info(e.toString());
    }
  }

  private void createTableVisitantes() {
    getConnection();
    String query = "CREATE TABLE IF NOT EXISTS visitantes ("
        + "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
        + "nome TEXT NOT NULL, "
        + "cpf TEXT NOT NULL, "
        + "registroGeral TEXT NOT NULL, "
        + "lote TEXT NOT NULL)";
    try (PreparedStatement statement = connection.prepareStatement(query)){
      statement.executeUpdate();
          logger.info("Table created");
    } catch (SQLException e) {
      logger.info(e.toString());
    }
  }
}
