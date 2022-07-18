package com.company.bootstrap;

import com.company.entity.Address;
import com.company.entity.Person;
import com.company.repository.AddressRepository;
import com.company.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("Lisa","Jo");
        Person p3 = new Person("Nikole","Dou");

        Address a1 = new Address("King Street","3253");
        Address a2 = new Address("Lies Street","3207");
        Address a3 = new Address("Half Street","4395");


//        p1.setAddress(Arrays.asList(a1,a2));
        personRepository.save(p1);

        a1.setPerson(p1);
        a2.setPerson(p1);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);

    }
}
