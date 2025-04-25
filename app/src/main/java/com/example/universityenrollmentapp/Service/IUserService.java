package com.example.universityenrollmentapp.Service;



import java.util.List;

public interface IUserService {
    void Register(String email,String password,String UserName);
    com.example.universityenrollmentapp.Service.User Login(String email, String password);;

    List<User> getAllUsers();
}

