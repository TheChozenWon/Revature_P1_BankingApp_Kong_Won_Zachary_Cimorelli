package com.team;
import com.team.database.MongoDBConnection;

public class App {
    public static void main(String[] args) {
        try {
            //Test MongoDB connection
            MongoDBConnection.testConnection();
        } catch (Exception e) {
            System.err.println("MongoDB connection failed: " + e.getMessage());
        } finally {
            //Close MongoDB connection
            MongoDBConnection.closeConnection();
        }
    }
}
