//package hungpt.deverloper.core.test;
//
//import hungpt.deverloper.core.dao.RoleDao;
//import hungpt.deverloper.core.daoimpl.RoleDaoImpl;
//import hungpt.deverloper.core.persistence.entity.RoleEntity;
//import org.testng.annotations.Test;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class RoleTest {
//    @Test
//    public void checkFindAll() {
//        RoleDao roleDao = new RoleDaoImpl();
//        List<RoleEntity> list = roleDao.findAll();
//    }
//
//    @Test
//    public void update() {
//        RoleDao roleDao = new RoleDaoImpl();
//        RoleEntity roleEntity = new RoleEntity();
//        roleEntity.setRoleID(2);
//        roleEntity.setRoleName("User_2");
//        roleDao.update(roleEntity);
//    }
//
//
//    @Test
//    public void save() {
//        RoleDao roleDao = new RoleDaoImpl();
//        RoleEntity roleEntity = new RoleEntity();
//        roleEntity.setRoleID(1);
//        roleEntity.setRoleName("Admin");
//
//        RoleEntity roleEntity1 = new RoleEntity();
//        roleEntity1.setRoleID(2);
//        roleEntity1.setRoleName("User");
//
//        roleDao.update(roleEntity);
//        roleDao.update(roleEntity1);
//    }
//
//    @Test
//    public void find() {
//        RoleDao roleDao = new RoleDaoImpl();
//        RoleEntity roleEntity = roleDao.findbyID(2);
//    }
//
//    @Test
//    public void findByProperty() {
//        RoleDao roleDao = new RoleDaoImpl();
//        String property = null;
//        Object value = null;
//        String sortExpress = null;
//        String sortDerection = null;
//        Object obj = roleDao.findByProperty(property, value, sortExpress, sortDerection);
//    }
//
//    @Test
//    public void delete() {
//        RoleDao roleDao = new RoleDaoImpl();
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        Integer count = roleDao.delete(list);
//    }
//}
