package com.codersait.techprimersrestdemo.repository.UserRepository;

import com.codersait.techprimersrestdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {

    public User findByName(String name);
}
