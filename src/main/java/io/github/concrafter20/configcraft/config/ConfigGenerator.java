package io.github.concrafter20.configcraft.config;

import io.github.concrafter20.configcraft.ConfigCraft;
import io.github.concrafter20.configcraft.config.errors.IllegalCharacterException;

public class ConfigGenerator {

    ConfigInfo info;

    private int type;

    public ConfigGenerator(ConfigInfo info) {
        this.info = info;
        String illeagalChars = "/<>:\"\\|?*";
        if (Tools.containsIllegalChar(info.fileName, illeagalChars)) {
            throw new IllegalCharacterException("Config file cannot contain \"" + illeagalChars + "\" !" );
        }
    }


}
