package org.example.model.dao;

import java.sql.*;
import java.util.Hashtable;

/**
 * Classe de gestion de la connexion à la base de données
 * Fournit des méthodes pour établir et gérer les connexions aux bases de données
 */
public class ConnectDB {
    // Constante pour le type de base de données MySQL
    public static final String MYSQL = "MYSQL";
    
    // Table de hachage pour stocker les drivers JDBC
    private static final Hashtable<String, String> drivers;
    
    // Connexion à la base de données
    private Connection connection;

    // Bloc d'initialisation statique pour charger les drivers
    static {
        drivers = new Hashtable<>();
        drivers.put(MYSQL, "com.mysql.cj.jdbc.Driver");
    }

    /**
     * Constructeur de la classe ConnectDB
     * Établit une connexion à la base de données spécifiée
     * 
     * @param type Type de base de données (ex: MYSQL)
     * @param server Adresse du serveur de base de données
     * @param dbName Nom de la base de données
     * @param user Nom d'utilisateur pour la connexion
     * @param password Mot de passe pour la connexion
     * @throws SQLException En cas d'erreur lors de la connexion
     * @throws ClassNotFoundException Si le driver JDBC n'est pas trouvé
     */
    public ConnectDB(String type, String server, String dbName, String user, String password) 
            throws SQLException, ClassNotFoundException {
        // Vérification du type de base de données
        if (type == null || !type.equals(MYSQL)) {
            throw new IllegalArgumentException("Type de base de données non supporté : " + type);
        }
        
        // Chargement du driver JDBC
        Class.forName(drivers.get(type));

        // Construction de l'URL de connexion selon le type de base de données
        String url;
        switch (type) {
            case MYSQL:
                // Format de l'URL pour MySQL
                url = "jdbc:mysql://" + server + "/" + dbName;
                break;
            default:
                throw new IllegalArgumentException("Type de base de données non supporté : " + type);
        }
        
        // Établissement de la connexion
        this.connection = DriverManager.getConnection(url, user, password);
    }
    
    /**
     * Retourne l'objet Connection actuel
     * 
     * @return L'objet Connection
     * @throws SQLException Si la connexion n'est pas établie ou a été fermée
     */
    public synchronized ResultSet executeQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public synchronized int executeUpdate(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(sql);
    }
    // fermer la connexion
    public synchronized void close() throws SQLException {
        if(connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
    
    /**
     * Ferme la connexion à la base de données
     */
    
}
