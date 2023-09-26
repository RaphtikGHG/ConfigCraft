package io.github.concrafter20.configcraft.config;

/**
 *   This is used to give the
 *   config generator some info.
 *   You can generate it using the
 *   Factory.getInfo(args) or using
 *   new ConfigInfo(args) this will be
 *   passed as an argument to the
 *   Factory for the generator
*/
public class ConfigInfo {
    ConfigType configType;
    String fileName;

    public ConfigInfo(ConfigType configType, String fileName) {
        this.configType = configType;
        this.fileName = fileName;
    }

}
