package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface BrowserstackConfig extends Config{

    @Config.Key("browserstackUser")
    @Config.DefaultValue("anvarshamsutdino_oYLIPh")
    String browserstackUser();

    @Config.Key("browserstackKey")
    @Config.DefaultValue("GV4qXRshYpcseGprDpSh")
    String browserstackKey();

    @Config.Key("app")
    @Config.DefaultValue("bs://7f7eca6f4feb1827b7789a47bf564b4742a64e3c")
    String app();

    @Config.Key("device")
    @Config.DefaultValue("Google Pixel 3")
    String device();

    @Config.Key("osVersion")
    @Config.DefaultValue("9.0")
    String osVersion();
}
