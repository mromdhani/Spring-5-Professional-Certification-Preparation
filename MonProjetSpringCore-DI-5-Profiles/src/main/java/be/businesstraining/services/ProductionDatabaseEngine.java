package be.businesstraining.services;

public class ProductionDatabaseEngine implements IDatabaseEngine {
    @Override
    public String getDatabaseEngine() {
        return "Oracle";
    }
}
