package com.team.database;

public class MongoDBConnectionTest {
    public static void main(String[] args) {
        try {
            MongoDBConnection.testConnection();
        } catch (Exception e) {
            System.out.println(
                    "MongoDB connection failed: " + e.getMessage()
            );
        } finally {
            MongoDBConnection.closeConnection();
        }
    }
}
