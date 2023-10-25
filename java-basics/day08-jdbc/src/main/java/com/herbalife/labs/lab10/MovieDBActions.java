package com.herbalife.labs.lab10;

import java.sql.*;

public class MovieDBActions {
    private static final String connectionString  = "jdbc:mysql://localhost:3306/training";
    private static final String user  = "root";
    private static final String pwd  = "root";
    public static void Save(Movie movie){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionString, user, pwd);
            String query = "INSERT INTO movies (title, year, language, genre) values(?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, movie.getTitle());
            statement.setInt(2, movie.getYear());
            statement.setString(3, movie.getLanguage());
            statement.setString(4, movie.getGenre());
            statement.execute();
            statement.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void GetById(int id){
        return;
    }

    public static void GetAll(){
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionString,user,pwd);
            String query = "select * from movies";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                var movie = new Movie(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getInt("year"),
                        resultSet.getString("language"),
                        resultSet.getString("genre"));

                System.out.println(movie);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
