package com.ritesh.methodreference;

import com.ritesh.interfaces.PersonCreation;
import com.ritesh.model.Person;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExmple {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("Rutuja","Patil",23),
                new Person("Ritesh","Ghule",24),
                new Person("Prajakta","Naphade",22),
                new Person("Snehal","Patil",23),
                new Person("Fake","user",215)
                );

        /*The reference to a static method holds the syntax ContainingClass::methodName.
        We'll try to check that person is valid or not with the help of Stream API:*/
        boolean isValidPerson = list.stream().allMatch(u -> Person.isValidPerson(u));
        System.out.println(isValidPerson);

        //using method reference for static method
        boolean isValid = list.stream().allMatch(Person::isValidPerson);
        System.out.println(isValid);

        /*3.2. Reference to an Instance Method
        The reference to an instance method holds the syntax containingInstance::methodName
        The following code calls method isValidPerson(Person person) of type Person, which validates an input parameter: */

        Person person = new Person("Ritesh","Ghule",24);
        boolean isIvalidPerson = list.stream().anyMatch(person::isInvalidPerson);
        System.out.println(isIvalidPerson);

        /*3.3. Reference to an Instance Method of an Object of a Particular Type
        This reference method takes the syntax ContainingType::methodName.
        Let's look at an example:*/

        long count= list.stream().filter(Person::isValidPerson).count();
        System.out.println(count);

        /*3.4. Reference to a Constructor
        A reference to a constructor takes the syntax ClassName::new. As constructor in Java is a
        special method, method reference could be applied to it too, with the help of new as a method name:*/

        PersonCreation person1 = Person::new;
        System.out.println(person1.getPerson("Ritesh","Ghule",24));

    }
}
