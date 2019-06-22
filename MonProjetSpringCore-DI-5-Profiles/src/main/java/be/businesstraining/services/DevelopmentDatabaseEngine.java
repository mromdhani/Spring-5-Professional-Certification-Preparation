package be.businesstraining.services;

public class DevelopmentDatabaseEngine implements IDatabaseEngine {
    @Override
    public String getDatabaseEngine() {
        return "H2";
    }
}
