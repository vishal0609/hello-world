$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/test.feature");
formatter.feature({
  "line": 2,
  "name": "Test feature to launch browser",
  "description": "",
  "id": "test-feature-to-launch-browser",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@diff"
    }
  ]
});
formatter.scenario({
  "line": 14,
  "name": "Open Chrome browser and get google",
  "description": "",
  "id": "test-feature-to-launch-browser;open-chrome-browser-and-get-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@same"
    },
    {
      "line": 13,
      "name": "@same1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "All setup is ther",
  "rows": [
    {
      "cells": [
        "user2",
        "pass1"
      ],
      "line": 16
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "GET google page",
  "rows": [
    {
      "cells": [
        "id",
        "name"
      ],
      "line": 18
    },
    {
      "cells": [
        "2",
        "\"dffd\""
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.all_setup_is_ther(DataTable)"
});
formatter.result({
  "duration": 3423750413,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.get_google_page(DataTable)"
});
formatter.result({
  "duration": 1824332935,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Open Chrome browser and get google",
  "description": "",
  "id": "test-feature-to-launch-browser;open-chrome-browser-and-get-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@same1"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "All setup is ther",
  "rows": [
    {
      "cells": [
        "user3",
        "pass1"
      ],
      "line": 24
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "GET google page",
  "rows": [
    {
      "cells": [
        "id",
        "name"
      ],
      "line": 26
    },
    {
      "cells": [
        "3",
        "\"dffd\""
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "everthing is as required",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.all_setup_is_ther(DataTable)"
});
formatter.result({
  "duration": 3608909655,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.get_google_page(DataTable)"
});
formatter.result({
  "duration": 1443707632,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.everthing_is_as_required()"
});
formatter.result({
  "duration": 57064674,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#test\"}\n  (Session info: chrome\u003d81.0.4044.92)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027VISHAL-PC\u0027, ip: \u0027192.168.0.8\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.92, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\vishal\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50528}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a922229d5ea579ba39e441e3e1e33b5f\n*** Element info: {Using\u003did, value\u003dtest}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinitions.TestSteps.everthing_is_as_required(TestSteps.java:51)\r\n\tat ✽.And everthing is as required(Feature/test.feature:28)\r\n",
  "status": "failed"
});
});