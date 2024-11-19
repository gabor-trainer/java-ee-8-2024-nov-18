### Hands-on Lab: Exploring and Modifying the JSF AJAX Project

### **Time Estimate**

**Total Time**: **30-45 minutes**

---

### Prerequisites

To complete this lab, ensure the following prerequisites are met:

- **Connect** to your lab machine using RDP, with the user name and password provided by instructor or lab manager.
- **IntelliJ IDEA** is installed and configured. GlassFish support is installed in IntelliJ IDEA.
- **GlassFish 5** application server is installed and configured.
- **JDK 8** is installed.
- **Maven** is installed and properly configured.
- **The repository Java-EE-8-Application-Development** is cloned on your lab machine.

In case of any of this are not met, please refer to the **Prerequisites**, and **Step 0** in [day one, lab 01 Working...](../day-one/01%20Working%20with%20a%20Simple%20JSF%20form%20Project.md) for guidance.

---

### Lab Objective

**Note:** This lab provides some source code examples and instructions to guide you through the process of exploring and modifying a Java EE 8 JSF project. Always try to understand the code and experiment with it to get a better grasp of the concepts.
**When the lab asks you to modify the code, always try to do it first on your own. Using, and copy and pasting the solution code provided here is always the last resort. :-)**

- Understand JSF AJAX features.
- Make a meaningful modification to the project.

### **Step 1: Open the Project in IntelliJ IDEA**

### Step 1: Open the Project in IntelliJ IDEA

1.  Open IntelliJ IDEA.
2.  Select **File > Open**.
3.  Navigate to the cloned repository folder:  
    `Chapter02/jsfajax`.
4.  Click **Open** to load the Maven project. IntelliJ will automatically detect and import the Maven configuration.
5.  Configure the project to run with GlassFish 5 as per the instructions in the previous labs. Refer to ([day one, lab 01 Working...](../day-one/01%20Working%20with%20a%20Simple%20JSF%20form%20Project.md) for guidance.)
6.

### **Step 2: Explore the Project**

- Review and analyze the key source files in the `net.ensode.javaee8book.jsfajax` package.
- Explore the structure of the project and the JSF pages.
- Run and test the application using a browser.
- Press F12 and see the rendered HTML code, compare it with the .xhtml JSF source code.

### **Step 3: Make a Meaningful Modification**

1.  Add a new feature that displays an additional user input field and processes it alongside existing logic: Third Operand
2.  Modify the existing logic to add the third operand to the sum of the first two operands, so it will add three numbers.
3.  Test the modification by running the application and verifying that your modification works as expected.
