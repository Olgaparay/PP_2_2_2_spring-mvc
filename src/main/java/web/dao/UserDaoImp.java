package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImp implements UserDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = em.find(User.class, id);
        if(user != null){
            em.remove(user);
        }
    }

    @Override
    public void updateUser(Long id, User user) {
        User userUpdate = getUserById(id);
        userUpdate.setName(user.getName());
        userUpdate.setAge(user.getAge());
    }
}
