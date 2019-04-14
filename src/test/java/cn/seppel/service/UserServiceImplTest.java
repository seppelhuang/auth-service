package cn.seppel.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    public void create() {
        userServiceImpl.create("user_3", "888888");

    }

    @Test
    public void passwordEncodeUtil() {
        System.out.println(passwordEncoder.encode("123456"));

    }
}