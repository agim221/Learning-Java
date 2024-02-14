package belajar.java.junit;

import belajar.java.junit.data.Person;
import belajar.java.junit.repository.PersonRepository;
import belajar.java.junit.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions(
        @ExtendWith(MockitoExtension.class)
)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp () {
//        personRepository = Mockito.mock(PersonRepository.class);
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testFound() {
        Mockito.when(personRepository.selectById("Agim"))
                .thenReturn(new Person("Agim", 18));
        var person = personService.get("Agim");

        Assertions.assertNotNull(person);
    }
}
