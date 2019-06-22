package be.businesstraining.autowire_by_constructor.domain;

public class Developer {
    private Language language;

    //autowire by constructor
    public Developer(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "language=" + language +
                '}';
    }
}