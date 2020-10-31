# Shaadi-com-QA
Manual QA Tech Challenge

This Project is to verify if the Community name and the mother tongue default selected is the same on the Marathi and Gujarati community Shaadi.com websites.\
The code is written in the JAVA language and the URLs are sent via JSON file. The project runs on TestNG. The Project was developed on Eclipse.\
It is run on the FireFox browser.

For this the Firefox browser exe file location must be set in the DriverT.java file under pathBinary variable

File details:\
The Main JAVA executable file is : Shaadi-com-QA/src/VerifyCommunityName/VerifyCommunityNameLogin.java\
JSON file consistin of URLs: Shaadi-com-QA/src/VerifyCommunityName/BaseFiles/URLs.json\
Driver initialization file: Shaadi-com-QA/src/VerifyCommunityName/BaseFiles/DriverT.java\
File to retrieve URLs: Shaadi-com-QA/src/VerifyCommunityName/BaseFiles/GetURLs.java\
File setting all the xpaths: Shaadi-com-QA/src/VerifyCommunityName/BaseFiles/VarPaths.java

The Main JAVA executable file should be run as TestNG.

External jars:\
Selenium jar: Shaadi-com-QA/Driver and Jars/selenium-server-standalone-3.141.59 (1).jar\
JSON reader jar: Shaadi-com-QA/Driver and Jars/json-simple-1.1.1.jar
