package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${stage}.properties"})
public interface BrowserConfig extends Config {

    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("browser.remote")
    Boolean isRemote();

    @Key("remote.url")
    String getRemoteUrl();

}
