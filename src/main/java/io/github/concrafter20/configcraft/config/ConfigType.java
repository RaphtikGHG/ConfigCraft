package io.github.concrafter20.configcraft.config;

public enum ConfigType {
    CONF(2);


    private final int value;

    ConfigType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
