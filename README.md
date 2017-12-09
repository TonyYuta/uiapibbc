# BBC project: UI & API

# CLA Instructions

# Example with Firefox browser that generates a report
mvn clean test site -DdriverType=firefox -Dgroups=all

if you want to execute it without a report to just visually see the steps, do not include "site" flag, the report takes an additional 80 seconds or so.

# Example with Firefox without report
mvn clean test -DdriverType=firefox -Dgroups=all

# Supported browsers:
- Firefox v.54
- Chrome Version 60.0
- PhantomJS (v1.3) (not implemented yet)

# CLA Flags
-Ddriver (Specifies the browser not case) (chrome/firefox/phantom)
-Dgroups (Specify groups for testing)
site (if you want a report generated at the end of the test it will be located in project folder
/target/allure-results/site/index.html
