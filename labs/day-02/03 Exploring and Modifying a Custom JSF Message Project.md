**Hands-On Lab: Exploring and Modifying a Custom JSF Message Project**

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

In case of any of this are not met, please refer to the **Prerequisites**, and **Step 0** in [day one, lab 01 Working...](../day-01/01%20Working%20with%20a%20Simple%20JSF%20form%20Project.md) for guidance.

---

### Lab Objective

**Note:** This lab provides some source code examples and instructions to guide you through the process of exploring and modifying a Java EE 8 JSF project. Always try to understand the code and experiment with it to get a better grasp of the concepts.
**When the lab asks you to modify the code, always try to do it first on your own. Using, and copy and pasting the solution code provided here is always the last resort. :-)**

In this lab, you will:

1.  **Understand the existing JSF project**:

    - Review and analyze the key source files in the `net.ensode.javaee8book.jsfcustommess` package.
    - Explore the structure of the project and the JSF pages.

2.  **Run and debug the project**:

    - Deploy the application to GlassFish 5.
    - Run and test the application using a browser.

3.  **Make a meaningful modification**:

    - Add a new feature that displays an additional user input field and processes it alongside existing logic.

4.  **Test the modification**:

    - Verify that your modification works as expected.

---

### Step 1: Open the Project in IntelliJ IDEA

1.  Open IntelliJ IDEA.
2.  Select **File > Open**.
3.  Navigate to the cloned repository folder:  
    `Chapter02/jsfcustommess`.
4.  Click **Open** to load the Maven project. IntelliJ will automatically detect and import the Maven configuration.
5.  Configure the project to run with GlassFish 5 as per the instructions in the previous labs. Refer to ([day one, lab 01 Working...](../day-01/01%20Working%20with%20a%20Simple%20JSF%20form%20Project.md) for guidance.)

---

### Step 2: Review Key Project Files

Take time to understand the project structure and review the following files:

#### **Java Files** (in `net.ensode.javaee8book.jsfcustommess` package)

- `CustomMessagesBackingBean.java`:
  - This is the backing bean for the JSF page. Examine its annotations (`@Named`, `@RequestScoped`) and the logic implemented within the methods.

#### **JSF Page**

- **`customMessages.xhtml`**:
  - Review the usage of the `<h:messages>` tag to display custom messages.
  - Notice how the `#{customMessagesBackingBean}` EL expressions are tied to the backing bean methods and properties.

---

### Step 3: Deploy the Application to GlassFish 5

1.  Open IntelliJ IDEA's **Run/Debug Configurations** and create a new GlassFish server configuration:
    - Set the **Application Server** to your GlassFish 5 installation.
    - Set the **Deployment** path to the current project.
2.  Click **Run** to deploy the application.
3.  Access the application in a web browser at:  
    `http://localhost:8080/jsfcustommess`

---

### Step 4: Modify the Project

#### Task: Add a New Field for "User Age"

We will add a new feature to accept the user's age and display a custom message if the age is below 18.

##### Step-by-Step Implementation:

1.  **Update the Backing Bean**:

    - Open `CustomMessagesBackingBean.java`.
    - Add a new property `age` with getter and setter methods:

      ```Java
      private int age;

      public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }

      ```

    - Update the `processUserInput()` method to include a check for age and set a message if the age is below 18:

      ```Java
      public void processUserInput() {
          if (age < 18) {
              FacesContext.getCurrentInstance()
                  .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Users under 18 are not allowed."));
          }
          FacesContext.getCurrentInstance()
              .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Welcome, " + firstName + " " + lastName + "!"));
      }

      ```

2.  **Update the XHTML Page**:

    - Open `customMessages.xhtml`.
    - Add a new input field for the user's age:

      ```html
      <h:outputLabel for="age" value="Age: " />
      <h:inputText id="age" value="#{customMessagesBackingBean.age}" />
      <br />
      ```

    - Update the form submission button to process this new field.

3.  **Test Your Modification**:

    - Redeploy the application.
    - Access the form and enter an age below 18 to test the custom warning message.

---

### Step 5: Analyze the Changes

#### Questions for Students:

1.  What is the purpose of the `@RequestScoped` annotation in the backing bean?
2.  How does the `FacesContext` API help manage messages in a JSF application?
3.  Why do we use EL (Expression Language) to bind input fields to backing bean properties?

#### Answers:

1.  The `@RequestScoped` annotation ensures that the bean lives only for the duration of the HTTP request.
2.  The `FacesContext` API provides access to the context for the current request, allowing us to manage messages and other details.
3.  EL simplifies binding JSF components to Java properties, making the UI dynamic and interactive.

---

### Conclusion

By completing this lab, you learned to:

- Explore and understand an existing Java EE 8 JSF project.
- Deploy and debug the project in GlassFish 5.
- Extend the application with new functionality.
- Analyze how the JSF framework works with backing beans and custom messages.
