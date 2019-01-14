$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("YouTubeSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Youtube Search Validations",
  "description": "",
  "id": "youtube-search-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UATTesting"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Youtube Search positive scenarios",
  "description": "",
  "id": "youtube-search-validations;youtube-search-positive-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open chrome browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter search criteria",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "YouTubeSearchStepDef.open_chrome_browser_and_enter_url()"
});
formatter.result({
  "duration": 13062919728,
  "status": "passed"
});
formatter.match({
  "location": "YouTubeSearchStepDef.enter_search_criteria()"
});
formatter.result({
  "duration": 1237731684,
  "status": "passed"
});
formatter.match({
  "location": "YouTubeSearchStepDef.click_on_search_button()"
});
formatter.result({
  "duration": 3967679456,
  "status": "passed"
});
});