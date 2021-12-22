In this project, we performed Web browser UI automation testing on the United airline’s Website that includes: smoke test, sanity test, and regression tests using Selenium Java.  We Implemented the BDD framework with cucumber and TestNG, following the page object model..


Writing our test cases with Gerkin language in cucumber feature files increases the readability and reusability.
![image](https://user-images.githubusercontent.com/91909656/147024197-b1606831-9040-423b-b3d3-a90dd9157b69.png)


Here is an example of the framework.
![image](https://user-images.githubusercontent.com/91909656/147024273-194a3cc1-1bcf-479f-9b3c-54c7ec85ae1c.png)


Page object model design pattern helped us to better organize our web elements and the corresponding pages,
once again increased the readability, reduces the code duplication, and improves test maintenance.

![image](https://user-images.githubusercontent.com/91909656/147024301-0143fd0f-162c-4f54-9de5-74876bd1c361.png)

And here is the full structure of the project.
![image](https://user-images.githubusercontent.com/91909656/147024323-68307f88-9d5b-43e9-80cc-4a578e175afd.png)

Runner class with CucumberOptions shown below acts as a link between the step definition class and the feature files, which allows us to run the project entirely, or multiple feature files by giving tag names, also generating reports, and more.

![image](https://user-images.githubusercontent.com/91909656/147024367-14c01106-7c76-43ca-969e-f52d03ed8457.png)

In this project, we developed total of 45 Test cases
smoke test cases: 4
sanity test cases: 5
regression test case: 36


