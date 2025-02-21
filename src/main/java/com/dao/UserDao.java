package com.dao;

import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private HibernateTemplate hibernateTemplate;
    private Session entityManager;


    public void createDetails(User user){
        this.hibernateTemplate.save(user);
    }

    public User getProduct(int pid){
      return  this.hibernateTemplate.get(User.class, pid);

    }
    public User getUserByMobile(String mobile) {
        try(Session session = sessionFactory.openSession()) {
            Query<User> query = session.createQuery("FROM User WHERE mobile = :mobile", User.class);
            query.setParameter("mobile", mobile);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




}
