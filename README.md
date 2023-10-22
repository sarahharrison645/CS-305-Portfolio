# CS-305-Portfolio
Submission for Module 8-1 Assignment

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?
-Artemis Financial is a consulting company that specializes in developing individual financial plans for their clients- such as savings, retirement, investment and insurance. They hired Global Rain to take on the task of bringing them in to the modern security age and helping to bolster their current Restful API to protect against cyber-security attacks using industry best practices and standards.

What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?
- I feel that I performed static testing and manual review of the existing code very well. When comparing the program against the dependency checks being run, I was able to individually addresscritical and high level security concerns and ensure that I thoroughly addressed each and every one of them to create the most secure program possible. Software security can be what makes or breaks a company. Not only do cyber attacks cause a loss of profit and resources on a company's end, but they can cause issues in the long-run if customers lose trust in a comapny and it's program when it comes to protecting their personal information.
  
What part of the vulnerability assessment was challenging or helpful to you?
- I think the most challenging part of the vulnerability assessment for me was simply trying to understand what each dependency issue was trying to tell me. Technical jargon is still a bit challenging for me so it took some additional research regarding CVE's and CPE's to fully understand the best fix for certain issues.
- 
How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
-First and foremost I utilized crytography to employ a SSL certificate using SHA-256 in order to make the Restful API secure. Additionally, I updatedd each of the Maven dependencies the the most recent versions in order to ensure that the program was using the most secure standards possible. Overall I tried to use industry best standards for coding and syntax to ensure that my code was strong and understandable for anyone else who worked on the code after me which sets up a good foundation for the programs' future security.
How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
The easiest was for me to ensure the code was functional and secure was to test it myself. Running the program through my IDE and thn opening the Restful API through a web browser helped me to experience the software from the user's end. Additionally, I made sure to run frequent dependency checkd, after each revision, to ensure my revised code was not introducing additional errors.

What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
-I think the Maven dependency check was invaluable to this experience and was a real game change for me. I found that a pattern/routine of revious then retesting helped me to make corrections incrementally and not have ot backtrack later on.

Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
- I think I would show future employers the pom.xml file from this assignment in comparison with the original. I think I did a good job revising the file in order to incorporate updated versions of Maven dependencies that may not have been originally obvious.
