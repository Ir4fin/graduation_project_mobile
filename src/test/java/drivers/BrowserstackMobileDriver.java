package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {
    static BrowserConfig config =
            ConfigFactory.create(
                    BrowserConfig.class,
                    System.getProperties()
            );


    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        mutableCapabilities.setCapability("browserstack.user", config.getBrowserstackUser());
        mutableCapabilities.setCapability("browserstack.key", config.getBrowserstackKey());
        mutableCapabilities.setCapability("app", config.getAppUrl());
        mutableCapabilities.setCapability("device", config.getDeviceName());
        mutableCapabilities.setCapability("os_version", config.getOsVersion());
        mutableCapabilities.setCapability("project", config.getProjectName());
        mutableCapabilities.setCapability("build", config.getBuildName());
        mutableCapabilities.setCapability("name", config.getName());
        return new RemoteWebDriver (getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
