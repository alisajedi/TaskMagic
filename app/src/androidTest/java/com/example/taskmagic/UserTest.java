package com.example.taskmagic;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by Yipu on 21/02/2018.
 */

public class UserTest extends ActivityInstrumentationTestCase2 {
    public UserTest() {
        super(MainActivity.class);
    }

    public void testAddUser() {
        String firstname = "firstname";
        String lastname = "lastname";
        String email = "user@ua.ca";
        String username = "username";
        String password = "password";
        int phoneNumber = 123456789;
        Photo photo = new Photo();
        User user = new User(firstname, lastname, email, username, password, phoneNumber, photo);

        assertEquals(user.getFirstName(), firstname);
        assertEquals(user.getLastName(), lastname);
        assertEquals(user.getEmailAddress(), email);
        assertEquals(user.getUserName(), username);
        assertEquals(user.getPassword(), password);
        assertEquals(user.getPhoneNumber(), phoneNumber);
        assertEquals(user.getPhoto(), photo);

    }

    public void testEditUser() {
        String firstname = "firstname";
        String lastname = "lastname";
        String email = "user@ua.ca";
        String username = "username";
        String password = "password";
        int phoneNumber = 123456789;
        Photo photo = new Photo();
        User user = new User(firstname, lastname, email, username, password, phoneNumber, photo);

        String newFirstName = "newFirst";
        String newLastName = "newLast";
        String newEmail = "newEmail";
        String newUsername = "newUsername";
        String newPassword = "newPassword";
        int newPhoneNumber = 987654321;
        Photo photo2 = new Photo();

        user.setFirstName(newFirstName);
        assertEquals(user.getFirstName(), newFirstName);
        user.setLastName(newLastName);
        assertEquals(user.getLastName(), newLastName);
        user.setEmailAddress(newEmail);
        assertEquals(user.getEmailAddress(), newEmail);
        user.setUserName(newUsername);
        assertEquals(user.getUserName(), newUsername);
        user.setPassword(newPassword);
        assertEquals(user.getPassword(), newPassword);
        user.setPhoneNumber(newPhoneNumber);
        assertEquals(user.getPhoneNumber(), newPhoneNumber);
        user.setPhoto(photo2);
        assertEquals(user.getPhoto(), photo2);
    }

    public void testGetTasksList() {
        ArrayList<Task> taskList = new ArrayList<Task>();
        Task taskA = new Task(1,"TaskA", "Creating a task.", "requeste1");
        Task taskB = new Task(2,"TaskB", "Creating a task.", "requeste2");
        Task taskC = new Task(2,"TaskC", "Creating a task.", "requeste3");
        User user = new User("firstname", "lastname", "user@ua.ca",
                "username", "password", 123456789, new Photo());

        user.addTask(taskA);
        taskList.add(taskA);
        user.addTask(taskB);
        taskList.add(taskB);
        user.addTask(taskC);
        taskList.add(taskC);

        assertEquals(user.getTasksList(), taskList);
    }

}