package com.company;

import com.google.gson.Gson;

public class PersonParser {
    public static String serializeInJson(Person person) {
        Gson gson = new Gson();
        String personInJson = gson.toJson(person);
        return personInJson;
    }

    public static Person desiarilizeFromJson(String jsonPerson) {
        Gson gson = new Gson();
        Person person = gson.fromJson(jsonPerson, Person.class);
        return person;
    }

}
