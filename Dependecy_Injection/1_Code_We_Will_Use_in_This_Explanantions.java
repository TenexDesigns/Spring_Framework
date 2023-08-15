

1_  HelloClass

This is where we define @Configuation and our Beans
The record keyword is used to make instances of classes without nneded to create epate files for them



------------------------------------------------------------------------------------------------------------
record Person(String name, int age){

}

record Person2(String name, int age,Address address){

}

record Address(int lane, String city){

}
@Configuration
public class Hello {

    @Bean
    public String name(){
        return "Ranga";
    }

    @Bean
    public int age(){
        return 234;
    }

    @Bean
    public Address address(){

        return new Address(344,"Nairobi");

    }


    @Bean
    public Address address3(){

        return new Address(6537,"From George");

    }


    @Bean
    public Person person(){
        var person = new Person("George",45);
        return  person;
    }
    @Bean
    public Person2 james(){
        return  new Person2("James",345, new Address(677,"King"));
    }


    @Bean
    public Person2 kelvin(String name, int age ,Address address){
        return  new Person2(name,age, address);
    }

    @Bean
    public Person2 Henry(){
        return  new Person2("Henry",3, address());
    }



    @Bean
    public Person person2(){
        var person = new Person(name(),age());
        return  person;
    }
}





Main Class
--------------------------------------------------------------------------------------------



public class Main {

    public static void main(String[] args) {
        //1. Launch a spring context -AnnotationConfigApplicationContext(Hello.class); pass the class to be managed in the brackets
        //2. Configure the thing that we want sping to manage - @Configuration - put this decorator on top of the class to be managed i.e The Hello class
        //3.Things managed by spring are called spring beans

        var context = new AnnotationConfigApplicationContext(Hello.class);

      //  4. Retrieving Beans managed by Spring - Use context.getBean();
       System.out.println(context.getBean("address3"));
       System.out.println(context.getBean("age"));
       System.out.println(context.getBean("person"));
       System.out.println(context.getBean("person2"));
       System.out.println(context.getBean("james"));
       System.out.println(context.getBean("Henry"));
       System.out.println(context.getBean("kelvin"));

       var  ans =context.getBeanDefinitionNames(); // Used To list all the beans avalible in our application context



       for(String name: ans ) {
           System.out.println(name);

       }


        int age = context.getBean("age", int.class);
        Address address = context.getBean("address", Address.class);

        System.out.println(address.city());
        // Using the beans
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}



