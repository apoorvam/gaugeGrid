# Gauge with Selenium Grid

This is a sample [Gauge](http://getgauge.io/) project that uses Selenium as the driver to interact with a web browser. It uses Selenium Grid to run tests on multiple browsers.
This can also be used to run tests remotely, in different browsers, different platforms or even different versions of browsers.

## Prerequisites

This example requires the following softwares to run.
  * [Java 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or above
  * [Gauge](http://getgauge.io/get-started/index.html)
  * Gauge Java plugin
    * can be installed using `gauge --install java`
  * Firefox(>= v46)/Chromedriver in PATH


## Setting the Selenium Grid

* Download the Selenium Server [here](http://docs.seleniumhq.org/download/)

To set up the Hub, run
```
java -jar <path_to_selenium_server_jar> -role hub
```
This uses port 4444 by default for its web interface.

To set up a node, run
```
java -jar <path_to_selenium_server_jar> -role webdriver -hub http://localhost:4444/grid/register/ -port 5566
```
You can use the free port of choice.

To check web console, go to [http://localhost:4444/grid/console](http://localhost:4444/grid/console)

If you are running hub and nodes in different machines, `localhost` should be replaced with IP address of hub. This should also be updated in `project_dir/env/user.properties`.

## Run specs

* Clone repository and run

```
mvn test
```
This runs the sample specs using the firefox driver by default. To use a different browser, set the environment property `BROWSER` in `project_dir/env/user.properties`.

```
BROWSER = chrome
```







