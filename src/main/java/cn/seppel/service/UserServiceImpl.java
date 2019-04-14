package cn.seppel.service;

import cn.seppel.entity.User;
import cn.seppel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(String username, String password) {
        User user = new User();
        user.setUsername(username);
        password = passwordEncoder.encode(password);
        user.setPassword(password);
        User u = userRepository.save(user);
        return u;
    }
}
