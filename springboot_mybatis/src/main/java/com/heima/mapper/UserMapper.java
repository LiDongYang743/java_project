package com.heima.mapper;

import com.heima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-16 20:14
 */
@Mapper
public interface UserMapper {

    List<User> queryUserList();

}
