package com.heima.mapper;

import com.heima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author shkstart
 * @create 2020-04-16 20:14
 */
public interface UserRepository extends JpaRepository<User,Long> , JpaSpecificationExecutor<User> {

    User findByusernameAndPassword(String name,String pwd);
}
