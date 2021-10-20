package com.olivertech;

public class Questionnaire {
    private Person2 id;
    private Question[] listOfQuestions;

    public Questionnaire(Person2 id, Question[] listOfQuestions) {
        this.id = id;
        this.listOfQuestions = listOfQuestions;
    }

    public Person2 getId() {
        return id;
    }

    public void setId(Person2 id) {
        this.id = id;
    }

    public Question[] getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(Question[] listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }
}
