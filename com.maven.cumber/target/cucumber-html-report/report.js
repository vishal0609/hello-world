$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test feature to launch browser",
  "description": "",
  "id": "test-feature-to-launch-browser",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Open Chrome browser and get google",
  "description": "",
  "id": "test-feature-to-launch-browser;open-chrome-browser-and-get-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "All setup is ther",
  "rows": [
    {
      "cells": [
        "user1",
        "pass1"
      ],
      "line": 4
    },
    {
      "cells": [
        "user2",
        "pass2"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "GET google page",
  "rows": [
    {
      "cells": [
        "id",
        "name"
      ],
      "line": 7
    },
    {
      "cells": [
        "1",
        "\"dffd\""
      ],
      "line": 8
    },
    {
      "cells": [
        "2",
        "\"ccsd\""
      ],
      "line": 9
    },
    {
      "cells": [
        "3",
        "\"dfsdf\""
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.all_setup_is_ther(DataTable)"
});
formatter.result({
  "duration": 5817424946,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.get_google_page(DataTable)"
});
formatter.result({
  "duration": 3399785841,
  "status": "passed"
});
});