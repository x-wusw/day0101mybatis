package xiaowu.dao;

import xiaowu.domain.User;

import java.util.List;
    //用戶的持久层接口
public interface IUserDao {
    /*
      查询所有操作
     */
    List<User> findALL();

}
