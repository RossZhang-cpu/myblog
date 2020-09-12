package com.henryzhang.dao;

import com.henryzhang.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {  //<操作对象， 主键的形式>
    User findByUsernameAndPassword(String username, String password);
}
