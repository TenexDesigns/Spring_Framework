In the provided context, the following are beans:

**1. `age()` Bean:**
```java
@Bean
public int age(){
    return 234;
}
```
This method defines a bean named "age" of type `int`. When you call `context.getBean("age")`, you will get the value `234`. However, its important to note that while primitive types can be returned from `@Bean` methods, it's less common. Beans are typically instances of classes.

**2. `address()` Bean:**
```java
@Bean
public Address address(){
    return new Address(344,"Nairobi");
}
```
This method defines a bean named "address" of type `Address`. When you call `context.getBean("address")`, you will get a new instance of the `Address` class with values `344` and `"Nairobi"`. This is an example of a prototype-scoped bean, as a new instance is created every time the bean is requested.

**3. `Address` Record:**
```java
record Address(int lane, String city) {
}
```
This is the definition of the `Address` record. While the record itself is not a bean, it serves as the blueprint for creating instances of the `Address` class, which can be managed as beans by the Spring ApplicationContext.

In Spring, beans are objects that are managed by the Spring container (ApplicationContext). They are created, configured, and maintained by the container, allowing you to focus on using these objects rather than manually creating and managing them. Beans are typically instances of classes, and they can have various scopes (singleton, prototype, etc.) based on how they should be managed by the container.

In the provided context, the `age()` and `address()` methods are responsible for creating beans named "age" and "address" respectively. The `Address` record serves as a blueprint for creating instances of `Address` objects, which can be managed as beans in the Spring container.




  
