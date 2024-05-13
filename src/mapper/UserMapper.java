package mapper;

import chapter05.User;

/*
用户模块的持久层接口
 */
//@Mapper
public interface UserMapper {
    /**
     * 插入用户的数据
     * @param user
     * @return 受影响的行数（增、删、改，都受影响的行数作为返回值，可以根据返回值来判断是否执行成功
     */
    Integer insert(User user);

    /**
     * 根据用户名来查询用户的数据
     * @param username 用户名
     * @return 如果找到对应的用户则返回这个用户的数据，如果没找到则返回null值
     */
    User findByUsername(String username);
}
