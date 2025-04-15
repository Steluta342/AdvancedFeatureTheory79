package org.example.part1_class_types.class_enum;

public enum AccessRole {
    //obiecte constante de tipul AccessRole (optional) - constante prestabilite
    ADMIN("All acces", 3),
    MODERATOR("Moderate Access", 2),
    USER("Read-only Access", 1);

    //atribute ale unui obiect constant
    private final String acessLevel;
    private final int priority;

    //constructor
    AccessRole(String acessLevel, int priority) {
        this.acessLevel = acessLevel;
        this.priority = priority;
    }

    //getter
    public String getAcessLevel() {
        return acessLevel;
    }

    public int getPriority() {
        return priority;
    }

}
