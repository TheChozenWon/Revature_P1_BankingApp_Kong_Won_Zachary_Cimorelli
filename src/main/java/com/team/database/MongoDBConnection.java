package com.team.database;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBConnection {

    //Read the connection string from an environment variable
    private static final String CONNECTION_STRING =
            System.getenv("MONGODB_URI");

    //One shared MongoClient for the application
    private static final MongoClient mongoClient = createClient();

    //Connect to the banking_app database
    private static final MongoDatabase database =
            mongoClient.getDatabase("banking_app");

    //Create the MongoClient
    private static MongoClient createClient() {
        if (CONNECTION_STRING == null ||
                CONNECTION_STRING.isBlank()) {
            throw new IllegalStateException(
                    "MONGODB_URI environment variable is missing."
            );
        }
        return MongoClients.create(CONNECTION_STRING);
    }

    //Retrieve the database
    public static MongoDatabase getDatabase() {
        return database;
    }

    //Retrieve the account_notes collection
    public static MongoCollection<Document> getAccountNotes() {
        return database.getCollection("account_notes");
    }

    //Retrieve the activity_logs collection
    public static MongoCollection<Document> getActivityLogs() {
        return database.getCollection("activity_logs");
    }

    //Test the database connection
    public static void testConnection() {
        database.runCommand(new Document("ping", 1));
        System.out.println(
                "Successfully connected to MongoDB Atlas!"
        );
    }

    //Close the connection when the application shuts down
    public static void closeConnection() {
        mongoClient.close();
    }
}
