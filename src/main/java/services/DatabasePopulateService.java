package services;

import utils.Database;
import utils.SQLScriptReader;

public class DatabasePopulateService {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.executeUpdate(SQLScriptReader.readScriptFromFile("sql/populate_db.sql"));
        database.closeConnection();
    }
}
