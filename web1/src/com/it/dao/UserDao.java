package com.it.dao;

import com.it.entity.User;
import com.it.util.DbHelp;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class UserDao {

        public void save(User user) {
            String sql = "insert into admin(username,password,address) values(?,?,?)";
            DbHelp.update(sql,user.getUsername(),user.getPassword(),user.getAddress());
        }

        public void del(Integer id) {
            String sql = "delete from admin where id = ?";
            DbHelp.update(sql,id);
        }

        public User findById(Integer id) {
            String sql = "select * from admin where id = ?";
            return DbHelp.query(sql,new BeanHandler<>(User.class),id);
        }

        public List<User> findAll() {
            String sql = "select * from admin";
            return DbHelp.query(sql,new BeanListHandler<>(User.class));
        }

        public static User findByUsername(String username) {
            String sql = "select * from admin where username = ?";
            return DbHelp.query(sql,new BeanHandler<>(User.class),username);
    }
}


