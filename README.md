# Test automation project (mobile application) for service WeGoTrip
![wegotrip.png](images/screens/WGT.jpg)

> WeGoTrip is the best travel app with audio guide to pass
> self guided walking tours and to buy tickets to museums of the world
> with personal skip the line or fast-track access.

## :page_with_curl:	Table of contents

> :heavy_check_mark: [Tools and technologies](#Technologist-Tools-and-technologies)
>
> :heavy_check_mark: [Implemented checks](#bookmark_tabs-Implemented-checks)
>
> :heavy_check_mark: [Running tests from the terminal](#-Running-tests-from-the-terminal)
>
> :heavy_check_mark: [Run tests in Jenkins](#-Run-tests-in-Jenkins)
>
> :heavy_check_mark: [Test results report in Allure Report](#-Test-result-report-in-Allure-Report)
> 
> :heavy_check_mark: [Integration with Allure TestOps](#-Integration-with-Allure-TestOps)
> 
> :heavy_check_mark: [Integration with Jira](#-Integration-with-Jira)
>
> :heavy_check_mark: [Notifications in Telegram using bot](#-Notifications-in-Telegram-using-bot)
>
> :heavy_check_mark: [Example of running test in Selenoid](#-Example-of-running-test-in-Selenoid)

## :technologist: Tools and technologies

<p  align="center"

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Selenoid" src="images/logo/Selenoid.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/Selenide.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="GitHub" src="images/logo/GitHub.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="Jira" src="images/logo/Jira.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>
</p>

> *In this project, autotests are written in <code><strong>*Java*</strong></code> using the <code><strong>*Selenide*</strong></code> framework for UI tests.*
>
>*<code><strong>*Gradle*</strong></code> is used to build the project.*
>
>*<code><strong>*JUnit 5*</strong></code> is used as a framework for unit testing.*
>
>*The tests are run from <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> is used to launch browsers in containers  <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> are used to visualize test results.*


## :bookmark_tabs: Implemented checks

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI

> - [x] *Checking the operation of the button "Help"*
>- [x] *Checking the operation of the button "Favorites"*
>- [x] *Checking the operation of the button "Account"*
>- [x] *Checking the operation of the button "Explore all destinations"*
>- [x] *Checking city page title*
>- [x] *Checking block "Top attractions in city"*
>- [x] *Checking block "Popular cities to visit in country"*
>- [x] *Checking block "Top attractions in country"*
>- [x] *Checking authorization with login/password*
>- [x] *Checking search for attractions*
>- [x] *Checking search for cities*


## :computer: Running tests from the terminal 

### Local tests run

```bash
gradle clean test
```

### Remote tests run

```bash
gradle clean test 
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### Build parameters

> <code>REMOTE_URL</code> – the address of the remote server where the tests will be run.
>
> <code>BROWSER</code> – the browser in which the tests will be run (by default - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – the browser version in which the tests will be run (by default - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – the size of the browser window in which the tests will be performed (by default - <code>1920x1080</code>_).

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Run tests in [Jenkins](https://jenkins.autotests.cloud/job/AUTO-638/)

*To start the build, you need to specify the parameter values and click <code><strong>*Build*</strong></code>.*

<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="800">
</p>

*After the assembly is completed, an icon will appear in the <code><strong>*Build History*</strong></code> block next to the assembly number
<img width="2%" title="Allure Report" src="images/logo/Allure.svg"><code><strong>*Allure
Report*</strong></code>, clicking on which will open a page with a generated html report.*

<p align="center">
  <img src="images/screens/Jenkins2.png" alt="job" width="1000">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> Test results report in [Allure Report](https://jenkins.autotests.cloud/job/AUTO-638/8/allure/)

### :pushpin: General information

*The main page of the Allure report contains the following information blocks:*

> - [x] <code><strong>*ALLURE REPORT*</strong></code> - displays the date and time of passing the test, the total number of cases run, as well as a diagram indicating the percentage and number of successful, dropped and broken during the execution of tests
>- [x] <code><strong>*TREND*</strong></code> - displays the trend of passing tests from build to build
>- [x] <code><strong>*SUITES*</strong></code> - displays the distribution of test results by test sets
>- [x] <code><strong>*ENVIRONMENT*</strong></code> - displays the text environment on which the tests were run (in this case, the information is not specified)
>- [x] <code><strong>*CATEGORIES*</strong></code> - displays the text environment on which the tests were run (in this case, the information is not specified)
>- [x] <code><strong>*FEATURES BY STORIES*</strong></code> - displays the distribution of tests by the functionality they are checking
>- [x] <code><strong>*EXECUTORS*</strong></code> - displays the executor of the current build

<p align="center">
  <img src="images/screens/Allure_Report.png" alt="Allure Report" width="900">
</p>

## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> Integration with [Allure TestOps](https://allure.autotests.cloud/launch/10145)

### :pushpin: The main dashboard

<p align="center">
  <img src="images/screens/Allure_TO.png" alt="dashboards" width="900">
</p>

### :pushpin: Test cases

<p align="center">
  <img src="images/screens/Allure_TO3.png" alt="test cases" width="900">
</p>

## <img width="4%" title="Jira" src="images/logo/Jira.svg"> Integration with [Jira](https://jira.autotests.cloud/browse/AUTO-638)

<p align="center">
  <img src="images/screens/Jira.png" alt="jira" width="1000">
</p>

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Notifications in Telegram using bot

> After the assembly is completed, a special bot created in <code>Telegram</code> automatically processes and sends a message with a report on the test run.

<p align="center">
<img title="Telegram Notifications" src="images/screens/Telegram.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Example of running test in Selenoid

> Video is attached to each test in the report.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test.gif">
</p>

