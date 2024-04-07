# Demo-UI-Automation
**Demo**: UI Automation Framework using **Selenium** and **Cucumber**

**Prerequisites**

Before running the Git repository from the command line, ensure that you have the following prerequisites installed on your system:

- Git: Download and install Git from here.
- Command Line Interface (CLI): Ensure you have access to a CLI such as Terminal (macOS/Linux) or Command Prompt (Windows).

**Steps to Run**
**1. Clone the Repository:**

  Open your CLI.
  
  Navigate to the directory where you want to clone the repository.
  
  Use the following command to clone the repository:
  
  bash
    
  git clone <repository_url>
  
  Replace <repository_url> with the URL of this Git repository.
  

**2. Navigate to the Repository:**

  After cloning, navigate into the repository directory using the cd command:
  
  bash
    
  cd repository_name
  
  Replace repository_name with the name of the directory where the repository was cloned.
  

**3. Run the program:**

  Run

  mvn clean verify -Dusername="your moodle username" -Dpassword="your moodle password" -Dcucumber.filter.tags=@"tagname"

  Currently, there are 4 tags.

  @Positive     (Log In: Positive Test flow)                                             1 Test Case

  @Negative     (Log In: Negative Test flow)                                             2 Test Cases

  @Regression   (Log In: Both Positive and Negative Test flow)                           3 Test Cases

  @Test         (All: Login Positive and Negative Test flow + Download Alll HW)          4 Test Cases
