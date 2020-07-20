$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/selelniumtest/CucumberBDDProj1/src/main/java/Features/CreateContacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 16,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user provides login credentials username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters contact details \"Tom\" and \"Peter\" and \"Manager\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContactsStepdefn.User_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 15382004445,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepdefn.title_of_page_is_Free_CRM()"
});
formatter.result({
  "duration": 41358209,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepdefn.user_provides_username_and_password()"
});
formatter.result({
  "duration": 1188113210,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepdefn.user_clicks_login_button()"
});
formatter.result({
  "duration": 9807642730,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepdefn.user_is_on_home_page()"
});
formatter.result({
  "duration": 17385390,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepdefn.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 3368376652,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 29
    },
    {
      "val": "Peter",
      "offset": 39
    },
    {
      "val": "Manager",
      "offset": 51
    }
  ],
  "location": "CreateContactsStepdefn.user_enters_contact_details(String,String,String)"
});
formatter.result({
  "duration": 4098164168,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepdefn.Close_the_browser()"
});
formatter.result({
  "duration": 822014242,
  "status": "passed"
});
});