package config;

import org.aeonbits.owner.Config;

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
