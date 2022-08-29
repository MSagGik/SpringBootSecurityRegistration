package ru.msaggik.spring.SpringBootSecurityRegistration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.msaggik.spring.SpringBootSecurityRegistration.models.Person;
import ru.msaggik.spring.SpringBootSecurityRegistration.repositories.PeopleRepository;

@Service
public class RegistrationService {
    private final PeopleRepository peopleRepository;
    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    // метод регистрации
    @Transactional
    public void register(Person person) {
        peopleRepository.save(person);
    }
}
