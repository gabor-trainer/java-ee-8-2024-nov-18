### Hands-on Lab: 07 Understanding and Practice Database Connectivty and ORM and JPA in context of Java EE 8.md

### **Time Estimate**

**Total Time**: **15-30 minutes / per exercise**

\*Note: this lab is divided into multiple exercises, which you can accomplish in any partiuclar order or your preference.

- ***

### Prerequisites for all exercises

To complete any of the following exercised in this lab, ensure the following prerequisites are met:

- **Connect** to your lab machine using RDP, with the user name and password provided by instructor or lab manager.
- **IntelliJ IDEA** is installed and configured. GlassFish support is installed in IntelliJ IDEA.
- **GlassFish 5** application server is installed and configured.
- **JDK 8** is installed.
- **Maven** is installed and properly configured.
- **The repository Java-EE-8-Application-Development** is cloned on your lab machine.

In case of any of this are not met, please refer to the **Prerequisites**, and **Step 0** in [day one, lab 01 Working...](../day-01/01%20Working%20with%20a%20Simple%20JSF%20form%20Project.md) for guidance.

Special requirements for each exercise relating database access:

- **The CustomerDb database** is created and configured in GlassFish as per the instructions in the previous labs. Refer to ([day three, lab 06 Practicing with the Customer Database](../day-03/06%20Practicing%20with%20the%20Customer%20Database.md)) for guidance.

### Lab Objective

- Explore and practice database connectivity, ORM, and JPA in the context of Java EE 8.
- Learn manual transaction management in Java EE 8 (jpa_intro project).
- Understand relationship mapping in JPA (entityrelationship project).
- Work with composite primary keys in JPA (compositeprimarykeys project).
- Get familiar with JPQL (jpql project).
- Understand the concepts and usage of the Criteria API in JPA, including criteria updates and deletions (criteriaapi, criteriaupdate, criteriadelete projects).
- Learn entity validation techniques (beanvalidation project).

**Exercise 1: Database Connectivity and ORM**  
_Open the project folder and configure it for database connectivity and ORM in the context of Java EE 8. Explore how JPA works with Java applications to interact with relational databases._

#### **Think about the leared concepts and try to answer the following questions**

1.  **What is an ER model, and why is it important in database design?**
2.  **Can you explain what a Primary Key (PK) is and why it's crucial in a database?**
3.  **What exactly is a Foreign Key (FK), and how does it relate to other tables?**
4.  **What is a connection pool, and how does it help improve application performance?**
5.  **What is a datasource, and how does it simplify working with databases?**
6.  **Why do we need `persistence.xml`, and what role does it play in JPA?**

---

**Exercise 2: Manual Transaction Management**  
_Open the `jpa_intro` project in chapter 3 from existing source, and configure it to use with Glassfish. Configure the project to demonstrate manual transaction management in Java EE 8, focusing on controlling transactions programmatically._

- What is the purpose of the `JpaDemoBean` class in the project?
- What is the role of the `@Named` annotation in the `JpaDemoBean` class?
- Why is the `@RequestScoped` annotation used in the `JpaDemoBean` class?
- How does the `@PersistenceContext` annotation interact with the `EntityManager`?
- What is the function of the `UserTransaction` resource in this class?
- How does the `updateDatabase` method manage database transactions?
- What entities are manipulated in the `updateDatabase` method?
- What exception handling mechanism is implemented in the `updateDatabase` method?
- Why is the `entityManager.remove(customer)` call made, and what is its purpose?
- How does this class demonstrate the use of JPA for database persistence and retrieval?

---

**Exercise 3: Relationship Mapping in JPA**  
_Open the `entityrelationship` project in chapter 3 from existing source, and configure it to use with Glassfish. Analyze and configure various relationship mappings in JPA, such as one-to-one, one-to-many, and many-to-many associations._

#### **Think about the leared concepts and try to answer the following questions**

- How is the `@OneToOne` relationship between `Customer` and `LoginInfo` defined in the `Customer` entity?
- What does the `@ManyToMany` annotation in the `Order` and `Item` entities signify, and how is the relationship configured?
- How is the `@OneToMany` relationship between `Customer` and `Order` entities modeled, and what does the `mappedBy` attribute indicate?
- What role does the `@JoinTable` annotation play in the `Order` entity for the `items` field?
- How does the `@ManyToOne` relationship between `Order` and `Customer` entities work, and how is the foreign key defined?

---

**Exercise 4: Composite Primary Keys in JPA**  
_Open the `compositeprimarykeys` project in chapter 3 from existing source, and configure it to use with Glassfish. Implement and configure composite primary keys using annotations in JPA, and observe their impact on entity behavior._

#### **Think about the leared concepts and try to answer the following questions**

1.  How does the `@IdClass` annotation in the `OrderItem` class define a composite primary key?
2.  What is the purpose of the `OrderItemPK` class, and how does it support the `OrderItem` entity?
3.  How does the `EntityManager.find()` method handle composite primary keys in the `CompositePrimaryKeyDemoBean` class?
4.  What role do the `equals()` and `hashCode()` methods play in the `OrderItemPK` class?
5.  Why is the `@PersistenceContext` annotation used in the `CompositePrimaryKeyDemoBean` class?

---

**Exercise 5: JPQL (Java Persistence Query Language)**  
_Open the `jpql` project in chapter 3 from existing source, and configure it to use with Glassfish. Practice creating and executing JPQL queries to retrieve and manipulate data stored in the database through JPA entities._

#### **Think about the leared concepts and try to answer the following questions**

---

**Exercise 6: Criteria API in JPA**  
_Open the `criteriaapi`, `criteriaupdate`, and `criteriadelete` project folders. Explore and configure projects to demonstrate how to use the Criteria API for dynamic query construction, as well as update and delete operations._

#### **Think about the leared concepts and try to answer the following questions**

---

**Exercise 7: Entity Validation**  
_Open the `beanvalidation` project in chapter 3 from existing source, and configure it to use with Glassfish. Set up and implement validation rules using JPA and Bean Validation annotations to enforce constraints on entity fields._

#### **Think about the leared concepts and try to answer the following questions**

**Answers for Exercise 1: Database Connectivity and ORM**

- **What is an ER model, and why is it important in database design?**  
  The **Entity-Relationship (ER) Model** is a blueprint for designing a database. It identifies the key entities, their attributes, and how they relate to each other. By mapping out these relationships visually, developers can create a logical and efficient database structure.
- **Can you explain what a Primary Key (PK) is and why it's crucial in a database?**  
  A **Primary Key** is like the unique identifier of a row in a database table. It guarantees that each entry is distinct and serves as the main identifier for retrieving or linking data.
- **What exactly is a Foreign Key (FK), and how does it relate to other tables?**  
  A **Foreign Key** acts as a reference between two tables by linking one table’s column(s) to the Primary Key in another. It ensures data consistency by enforcing relationships, like connecting orders to customers.
- **What is a connection pool, and how does it help improve application performance?**  
  A **connection pool** is like a database connection bank where reusable connections are stored. Instead of opening and closing a new connection for every query, applications borrow from the pool, speeding up operations and conserving resources. This improves performance by reducing connection open/close overhead and also helps manage the number of connections to the database, so improving scalability. Note, we will learn about object pooling in the context of Java EE in the upcoming days which is a very similar concept.
- **What is a datasource, and how does it simplify working with databases?**  
  A **datasource** is a shortcut for connecting to a database. It hides the complexity of managing connections and pools behind a simple, standardized interface, making it easier to interact with the database.
- **Why do we need `persistence.xml`, and what role does it play in JPA?**  
  The **`persistence.xml`** file is a central configuration information of a JPA setup. It tells the application how to connect to the database, which JPA provider to use, and which entities to manage. Without it, the persistence context cannot function.

---

**Answers for Exercise 2: Manual Transaction Management**

1.  **What is the purpose of the `JpaDemoBean` class in the project?**  
    The `JpaDemoBean` class is a managed bean used to demonstrate JPA functionalities, such as persisting, retrieving, updating, and deleting `Customer` entities in the database.
2.  **What is the role of the `@Named` annotation in the `JpaDemoBean` class?**  
    The `@Named` annotation makes the `JpaDemoBean` accessible in EL (Expression Language) expressions, allowing it to be used in JSF (JavaServer Faces) pages.
3.  **Why is the `@RequestScoped` annotation used in the `JpaDemoBean` class?**  
    The `@RequestScoped` annotation ensures that the bean is created and destroyed with each HTTP request, making it suitable for short-lived operations like database updates triggered by user actions.
4.  **How does the `@PersistenceContext` annotation interact with the `EntityManager`?**  
    The `@PersistenceContext` annotation injects an `EntityManager` instance, which is used to interact with the persistence context for performing CRUD operations on entities.
5.  **What is the function of the `UserTransaction` resource in this class?**  
    The `UserTransaction` resource manages transactions explicitly. It allows the bean to define transaction boundaries (e.g., begin and commit transactions) instead of relying on container-managed transactions.
6.  **How does the `updateDatabase` method manage database transactions?**  
    The `updateDatabase` method begins a transaction using `userTransaction.begin()`, performs multiple database operations (persist, find, update, and remove), and then commits the transaction using `userTransaction.commit()`.
7.  **What entities are manipulated in the `updateDatabase` method?**  
    The `updateDatabase` method manipulates three `Customer` entities:

    - `customer`: Created and persisted, but then removed later in the transaction.
    - `customer2`: Created and persisted.
    - `customer3`: Retrieved using `entityManager.find()` and then updated.

8.  **What exception handling mechanism is implemented in the `updateDatabase` method?**  
    The method handles various exceptions (`HeuristicMixedException`, `HeuristicRollbackException`, `IllegalStateException`, `NotSupportedException`, `RollbackException`, `SecurityException`, and `SystemException`) to catch transaction-related issues and ensure stability. If an exception occurs, the method logs the error and returns an error state ("error").
9.  **Why is the `entityManager.remove(customer)` call made, and what is its purpose?**  
    The `entityManager.remove(customer)` call is used to delete the `customer` entity from the database as part of demonstrating the `remove` operation within a transaction.
10. **How does this class demonstrate the use of JPA for database persistence and retrieval?**  
    This class shows how to use JPA to:

    - Persist entities using `entityManager.persist()`.
    - Retrieve an entity by its primary key using `entityManager.find()`.
    - Update an entity by modifying its fields within a transaction.
    - Remove an entity using `entityManager.remove()`.
    - Handle database operations within explicit transaction boundaries using `UserTransaction`.

---

**Answers for Exercise 3: Relationship Mapping in JPA**

- **How is the `@OneToOne` relationship between `Customer` and `LoginInfo` defined in the `Customer` entity?**  
  The `@OneToOne` relationship is defined in the `Customer` entity using the `@OneToOne(mappedBy = "customer")` annotation, where `mappedBy` indicates that the `customer` field in the `LoginInfo` entity owns the relationship. This means the `LoginInfo` entity contains the foreign key column for the relationship.
- **What does the `@ManyToMany` annotation in the `Order` and `Item` entities signify, and how is the relationship configured?**  
  The `@ManyToMany` annotation signifies a many-to-many relationship between `Order` and `Item`. In the `Order` entity, the relationship is configured using the `@JoinTable` annotation, which defines the join table `ORDER_ITEMS` and specifies `ORDER_ID` and `ITEM_ID` as the foreign key columns. The `mappedBy` attribute in the `Item` entity indicates that the relationship is owned by the `Order` entity.
- **How is the `@OneToMany` relationship between `Customer` and `Order` entities modeled, and what does the `mappedBy` attribute indicate?**  
  The `@OneToMany` relationship is modeled in the `Customer` entity with the annotation `@OneToMany(mappedBy = "customer")`. The `mappedBy` attribute specifies that the `customer` field in the `Order` entity owns the relationship, meaning the `Order` entity contains the foreign key column `CUSTOMER_ID`.
- **What role does the `@JoinTable` annotation play in the `Order` entity for the `items` field?**  
  The `@JoinTable` annotation in the `Order` entity defines the join table `ORDER_ITEMS` that facilitates the many-to-many relationship between `Order` and `Item`. It specifies how the foreign key columns (`ORDER_ID` and `ITEM_ID`) map the relationship between the two entities.
- **How does the `@ManyToOne` relationship between `Order` and `Customer` entities work, and how is the foreign key defined?**  
  The `@ManyToOne` relationship in the `Order` entity is defined using the `@ManyToOne` annotation and the `@JoinColumn(name = "CUSTOMER_ID")` annotation. This indicates that each `Order` is associated with one `Customer`, and the foreign key `CUSTOMER_ID` in the `ORDERS` table references the primary key of the `CUSTOMERS` table.

---

**Answers for Exercise 4: Composite Primary Keys in JPA**

- **How does the `@IdClass` annotation in the `OrderItem` class define a composite primary key?**  
  The `@IdClass` annotation in the `OrderItem` class specifies that the primary key consists of multiple fields (`orderId` and `itemId`). The annotation links the `OrderItem` class to the `OrderItemPK` class, which provides a composite key definition.
- **What is the purpose of the `OrderItemPK` class, and how does it support the `OrderItem` entity?**  
  The `OrderItemPK` class serves as the composite primary key for the `OrderItem` entity. It implements the `Serializable` interface and defines the fields `orderId` and `itemId`. It includes `equals()` and `hashCode()` methods to ensure the correct behavior of the composite key during persistence operations.
- **How does the `EntityManager.find()` method handle composite primary keys in the `CompositePrimaryKeyDemoBean` class?**  
  The `EntityManager.find()` method is used to retrieve an `OrderItem` entity based on its composite primary key. The key is represented by an instance of `OrderItemPK`, which is passed as the second argument to the `find()` method.
- **What role do the `equals()` and `hashCode()` methods play in the `OrderItemPK` class?**  
  The `equals()` and `hashCode()` methods ensure that instances of `OrderItemPK` are compared correctly based on their field values (`orderId` and `itemId`). These methods are crucial for JPA to identify entities with composite primary keys in collections or when performing operations like `find()` or `merge()`.
- **Why is the `@PersistenceContext` annotation used in the `CompositePrimaryKeyDemoBean` class?**  
  The `@PersistenceContext` annotation is used to inject an `EntityManager` instance into the `CompositePrimaryKeyDemoBean` class. This allows the bean to interact with the persistence context for performing database operations, such as retrieving an entity using a composite primary key.

---

**Answers for Exercise 5: JPQL (Java Persistence Query Language)**

---

**Answers for Exercise 6: Criteria API in JPA**

---

**Answers for Exercise 7: Entity Validation**
