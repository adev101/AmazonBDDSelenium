$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("2. ProdSearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: abhinav.dev@gmail.com"
    },
    {
      "line": 2,
      "value": "#Comments: Demo project"
    },
    {
      "line": 3,
      "value": "#Scenario Description: User is able to search product Amazon successfully"
    }
  ],
  "line": 7,
  "name": "Product search on Amazon",
  "description": "",
  "id": "product-search-on-amazon",
  "keyword": "Feature"
});
formatter.background({
  "line": 10,
  "name": "Login to Amazon portal",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 11,
  "name": "Amazon portal is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "enter user id",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter password and click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on profile",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user is able to login successfully",
  "keyword": "And "
});
formatter.match({
  "location": "LaunchSteps.amazon_portal_is_launched()"
});
formatter.result({
  "duration": 6626986600,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.navigate_to_login_page()"
});
formatter.result({
  "duration": 5031319600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_user_id()"
});
formatter.result({
  "duration": 2892364500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_password()"
});
formatter.result({
  "duration": 23493753800,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.user_clicks_on_profile()"
});
formatter.result({
  "duration": 14097702300,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndSecuritySteps.user_is_able_to_login_successfully()"
});
formatter.result({
  "duration": 107006700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Product search",
  "description": "",
  "id": "product-search-on-amazon;product-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "input file is available at the path",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user is at home page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user searches for the product",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Lists all result on first page and saves the result price in same excel",
  "keyword": "Then "
});
formatter.match({
  "location": "ReadExcelProductSteps.check_input_file()"
});
formatter.result({
  "duration": 837900,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.user_is_at_home_page()"
});
formatter.result({
  "duration": 689955700,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.search_product()"
});
formatter.result({
  "duration": 2608306600,
  "status": "passed"
});
formatter.match({
  "location": "ProductResultSteps.list_all_results()"
});
formatter.result({
  "duration": 6186134500,
  "status": "passed"
});
formatter.background({
  "line": 10,
  "name": "Login to Amazon portal",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 11,
  "name": "Amazon portal is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "enter user id",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter password and click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on profile",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user is able to login successfully",
  "keyword": "And "
});
formatter.match({
  "location": "LaunchSteps.amazon_portal_is_launched()"
});
formatter.result({
  "duration": 4925966500,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.navigate_to_login_page()"
});
formatter.result({
  "duration": 4874734100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_user_id()"
});
formatter.result({
  "duration": 3010569300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_password()"
});
formatter.result({
  "duration": 23426575800,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.user_clicks_on_profile()"
});
formatter.result({
  "duration": 16075173700,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndSecuritySteps.user_is_able_to_login_successfully()"
});
formatter.result({
  "duration": 91662200,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Check wish list",
  "description": "",
  "id": "product-search-on-amazon;check-wish-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user is at home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user hovers on \u0027Account and Lists\u0027 link",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user clicks on \u0027your wish list\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user navigates to wish list page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "print the wish list items on console",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.user_is_at_home_page()"
});
formatter.result({
  "duration": 802232600,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.hover_account_link()"
});
formatter.result({
  "duration": 157460100,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.click_wish_list()"
});
formatter.result({
  "duration": 4068890300,
  "status": "passed"
});
formatter.match({
  "location": "WishListSteps.navigate_wish_list()"
});
formatter.result({
  "duration": 43674000,
  "status": "passed"
});
formatter.match({
  "location": "WishListSteps.print_wish_list()"
});
formatter.result({
  "duration": 157220800,
  "status": "passed"
});
formatter.uri("3. AmazonLogOut.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: abhinav.dev@gmail.com"
    },
    {
      "line": 2,
      "value": "#Scenario: Logout from Amazon web application"
    }
  ],
  "line": 5,
  "name": "Check log out from Amazon",
  "description": "I want to use this template for my feature file",
  "id": "check-log-out-from-amazon",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@tag"
    }
  ]
});
formatter.background({
  "line": 9,
  "name": "Login to Amazon portal",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "Amazon portal is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "enter user id",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter password and click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on profile",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is able to login successfully",
  "keyword": "And "
});
formatter.match({
  "location": "LaunchSteps.amazon_portal_is_launched()"
});
formatter.result({
  "duration": 5177857400,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.navigate_to_login_page()"
});
formatter.result({
  "duration": 5978226300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_user_id()"
});
formatter.result({
  "duration": 3049877000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_password()"
});
formatter.result({
  "duration": 23763597800,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.user_clicks_on_profile()"
});
formatter.result({
  "duration": 14621956000,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndSecuritySteps.user_is_able_to_login_successfully()"
});
formatter.result({
  "duration": 32058100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Logout from Amazon portal",
  "description": "",
  "id": "check-log-out-from-amazon;logout-from-amazon-portal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user is at home page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user hovers on \u0027Account and Lists\u0027 link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on logout link",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user successfully logs out",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.user_is_at_home_page()"
});
formatter.result({
  "duration": 752451100,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.hover_account_link()"
});
formatter.result({
  "duration": 150652900,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.user_click_logout_link()"
});
formatter.result({
  "duration": 2938612900,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.user_log_out_success()"
});
formatter.result({
  "duration": 2071246800,
  "status": "passed"
});
});