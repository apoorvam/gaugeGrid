# Gauge with Selenium Grid

This is a sample Gauge project that uses Selenium as the driver to interact with a web browser. It uses Selenium Grid to run tests on multiple browsers.
## Running this example
The tests are run on Firefox by default.

### Prerequisites

This example requires the following softwares to run.
  * [Java 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or above
    * Note that Gauge works with Java 1.6 and above. But this particular example uses Java 1.7
  * [Gauge](http://getgauge.io/get-started/index.html)
  * Gauge Java plugin
    * can be installed using `gauge --install java`
  * Firefox/Chrome


### Setting the Selenium Grid

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

To check web console, go to http://localhost:4444/grid/console

### Run specs

* Clone repository and run

```
mvn test
```
This runs the sample specs using the firefox driver by default. To use a different browser, set the environment property `BROWSER` in `project_dir/env/user.properties`.

```
BROWSER = chrome
```







