3. Scopes of beans:
   
   Spring ApplicationContext supports different scopes for beans. Each scope defines the lifecycle and number of instances of a bean. Here are the commonly used scopes and their uses:
  
   - Singleton (default): Only one instance of the bean is created per ApplicationContext. Suitable for stateless beans that can be shared.
  
   - Prototype: A new instance of the bean is created whenever requested. Suitable for stateful beans that need a fresh instance each time.
  
   - Request: A new instance of the bean is created for each HTTP request. Suitable for web applications.
  
   - Session: A new instance of the bean is created for each HTTP session. Suitable for web applications.
  
   To specify the scope of a bean, you can use the `@Scope` annotation:
  
   ```java
   @Bean
   @Scope("prototype")
   public Person person() {
       return new Person();
   }
   ```
   
   In this example, the `person()` bean is defined with the prototype scope.
  
