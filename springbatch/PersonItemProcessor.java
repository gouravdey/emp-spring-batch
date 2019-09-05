package com.example.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PersonItemProcessor implements ItemProcessor<Person, NewPerson> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public NewPerson process(final Person person) throws Exception {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        final int id = person.getId();
        final String name = person.getName();
        final String designation = person.getDesignation();
        final String dateOfBirth = person.getDateOfBirth();

        LocalDate personDob = LocalDate.parse(dateOfBirth, formatter);

//        int dobYear = c.get(Calendar.YEAR);
//        int dobMonth = c.get(Calendar.MONTH) + 1;
//        int dobDate = c.get(Calendar.DATE);
//
//        LocalDate personDob = LocalDate.of(dobYear, dobMonth, dobDate);

        final int age = Period.between(personDob, LocalDate.now()).getYears();

        final NewPerson transformedPerson = new NewPerson(id, name, designation, dateOfBirth, age);

        return transformedPerson;
    }

}
