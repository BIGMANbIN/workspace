package com.it.test;


import com.it.entity.User;
import com.it.exception.DataAccessException;
import com.it.util.ConnectionManager;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class DbUtilsTestCase {

    @Test
    public void testConnection() {
        ConnectionManager.getConnection();

    }

    @Test
    public void testSave() {
        QueryRunner queryRunner = new QueryRunner();
        String sql = "insert into admin(username,password,address) values(?,?,?)";
        try {
            queryRunner.update(ConnectionManager.getConnection(), sql, "hanhan", "123", "美国");
        } catch (SQLException e) {
            throw new DataAccessException("插入数据异常",e);
        }
    }

    @Test
    public void testUpdate() {
        QueryRunner queryRunner = new QueryRunner();
        String sql = "update admin set username = ? where id = ?";
        Connection connection = ConnectionManager.getConnection();
        try {
            queryRunner.update(connection, sql, "rose", 1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }
    }

    @Test
    public void testQueryById() {
        String sql = "select * from admin where id = ?";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        try {
            User user = queryRunner.query(connection, sql, new BeanHandler<>(User.class), 1);
            System.out.println(user);
            Assert.assertNotNull(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }


    }


    @Test
    public void testQueryAll() {
        String sql = "select * from admin";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        try {
            List<User> userList = queryRunner.query(connection, sql, new BeanListHandler<>(User.class));

            System.out.println(userList);
            Assert.assertEquals(userList.size(),6);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }
    }


    @Test
    public void testQueryByIdToMap() {
        String sql = "select * from admin where id = ?";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        try {
            Map<String, Object> result = queryRunner.query(connection, sql, new MapHandler(), 1);

            for (Map.Entry<String, Object> entry : result.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }


            Assert.assertNotNull(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }


    }


    @Test
    public void testQueryAllToMapList() {
        String sql = "select * from admin";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        try {
            List<Map<String, Object>> resultList = queryRunner.query(connection, sql, new MapListHandler());

            for (int i = 0; i < resultList.size(); i++) {
                Map<String, Object> result = resultList.get(i);
                for (Map.Entry<String, Object> entry : result.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
                System.out.println("---------------------------");
            }

            Assert.assertEquals(resultList.size(), 6);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }
    }


    @Test
    public void testCount() {
        String sql = "select count(*) from admin";

        Connection connection = ConnectionManager.getConnection();
        QueryRunner queryRunner = new QueryRunner();

        try {
            Long count = queryRunner.query(connection, sql, new ScalarHandler<Long>());
            Assert.assertEquals(new Long(6), count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }

    }

    @Test
    public void testQueryAllUsername() {
        String sql = "select username from admin";

        Connection connection = ConnectionManager.getConnection();
        QueryRunner queryRunner = new QueryRunner();

        try {
            List<String> nameList = queryRunner.query(connection, sql, new ColumnListHandler<String>());
            Assert.assertEquals(6, nameList.size());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }

    }
}