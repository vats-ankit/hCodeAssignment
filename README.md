Please run Testng.xml file to run the script through editor
here we have congif.properties file which stores info related to browser and webapp url
then we have 1 base class under src/test/java/testCase.com which has code to launch browser using property file
then we have 4 page classes under src/test/java/pageObject.com which contain web elements and there actions for the required test cases like handling common web elements(TextBoxClass), handling web tables(WebTablClass), handling dynamic element(DynamicElement class), and uploading a file(FileUploadClass)
we have a TestCase class under src/test/java/testCase.com which include all the test cases 
we have test data files under TestData( excel for taking data and text file to upload)
we have testng.xml file to run the script and pom.xml file to import dependencies
