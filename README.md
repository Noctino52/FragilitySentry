# FragilitySentry ![rsz_1rsz_1rsz_1rsz_fragilitysentrulogo](https://github.com/Noctino52/FragilitySentry/assets/20641545/d00df5f8-54e8-4786-8aa4-10b98c15bf89)

FragilitySentry is a tool that helps evaluate the robustness of end-to-end test cases for web applications.
It analyzes test cases to identify potential points of failure and provides insights to improve their reliability.

Using the Selenium framework for writing and executing test case, FragilitySentry take note of the page visited and the locator used to refer of the html elements.
If the istruction that compose the test used complex locator and page, more the score of the test getting worse and vicerversa.

The result of our metric have been testing in 3 sample web application, MantisBT, Dolibarr and Magento, with a custom set of test case.

### Functionality:

- Analyzes Selenium-based end-to-end test cases
- Identifies weak points and potential failures
- Provides recommendations for enhancing test case robustness


### System architecture

![Cattura-removebg-preview](https://github.com/Noctino52/FragilitySentry/assets/20641545/869c8079-c6f1-49ae-830b-4def2f12b4c4)


## Input

1. A directory containing test cases written with Selenium IDE in a JUnit environment.
2. A directory containing a file named "Result.csv". This file should list the names of individual test cases along with their success or failure status based on the version.
3. For execute our test: In the main file, specify the name of the application being tested (It must have the same name as the directories).

## Output

1. The "Result.csv" file contains the metric results for each test case, along with the point-biserial correlation coefficient value for each test outcome.
2. Inside the "Scores" directory, there are .csv files, each named after an executed test case. These files contain the different scores obtained from each instruction.

## Project status:
The project aims to provide a user-friendly tool for developers and QA engineers to enhance the reliability of their end-to-end test cases.
It is intended to be a valuable asset in the software development and testing process.

The core functionality of analyzing test cases and identifying weaknesses is complete.
The next steps involve refining the user interface and adding more advanced features for comprehensive robustness evaluation.

### Installation guidelines

1. Install the respective sample applications using the provided "docker-compose" files in PowerShell.
2. Clone the repository.
3. Configure the chromedriver to run in the IDE being used.

