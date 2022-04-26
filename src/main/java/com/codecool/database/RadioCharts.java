package com.codecool.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RadioCharts {
    private final String dbUrl;
    private final String dbUser;
    private final String dbPassword;

    public RadioCharts(String dbUrl, String dbUser, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }


    public List<String> getArtists() {
        try (Connection connection = DriverManager.getConnection(this.dbUrl, this.dbUser, this.dbPassword)) {

            List<String> result = new ArrayList<>();
            return result;
        }
        catch (Exception e) {
            throw new RuntimeException();
        }

    }

    public String getMostPlayedSong() {
        try (Connection connection = DriverManager.getConnection(this.dbUrl, this.dbUser, this.dbPassword)) {

            String result = "";
            return result;
        }
        catch (Exception e) {
            throw new RuntimeException();
        }

    }

    public String getMostActiveArtist() {
        try (Connection connection = DriverManager.getConnection(this.dbUrl, this.dbUser, this.dbPassword)) {

            String result = "";
            return result;
        }
        catch (Exception e) {
            throw new RuntimeException();
        }
    }
}