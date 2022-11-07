package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
     
    @Column(nullable = false, unique = true, length = 45)
    private String email;
     
    @Column(nullable = false, length = 64)
    private String password;
     
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    public Long getId(){
        return Id;
    }
    public void setId(Long Id)
    {
        this.Id=Id;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getFirstname()
    {
        return firstName;
    }
    public void setFirstname(String firstname)
    {
        this.firstName=firstname;
    }
    public String getLastname()
    {
        return lastName;
    }
    public void setLastname(String lastname)
    {
        this.lastName=lastname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

