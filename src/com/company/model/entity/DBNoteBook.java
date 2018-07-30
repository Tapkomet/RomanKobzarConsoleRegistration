package com.company.model.entity;

/**
 * Created by Roman Kobzar on 20.07.2018.
 */
public enum DBNoteBook {
    NOTE_ONE("Taras", "taras123"),
    NOTE_TWO("Nikola","nik12345"),
    NOTE_THREE ("Petro","shoko123"),
    NOTE_FOUR("Рома","qwertyuiop"),
    NOTE_FIVE ("Леся","asdfghjkl");

    private final String firstName;
    private final String login;

    DBNoteBook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLogin() {
        return login;
    }

    public static boolean checkLogin (String loginData){
        for (DBNoteBook note : DBNoteBook.values()){
            if (note.getLogin().equals(loginData)){return true;}
        }
        return  false;
    }
}
