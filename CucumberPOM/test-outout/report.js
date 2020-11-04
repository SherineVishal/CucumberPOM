$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sheri/git/CucumberBDDPOM/CucumberPOM/src/main/java/com/qa/features/crm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user login to app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 8795516400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_Page()"
});
formatter.result({
  "duration": 59448000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_login_to_app()"
});
formatter.result({
  "duration": 717597800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 9378500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 979471000,
  "status": "passed"
});
});