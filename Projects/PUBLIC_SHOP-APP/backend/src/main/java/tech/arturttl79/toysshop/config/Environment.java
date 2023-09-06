package tech.arturttl79.toysshop.config;

public final class Environment {
    private final String host;

    private static Environment instance;

    private Environment() {
        this.host = "http://localhost:3000";
    }

    public static Environment getInstance() {
        if (instance == null) {
            instance = new Environment();
        }
        return instance;
    }

    public String getHost() {
        return instance.host;
    }
}
