package dz.stic.TrashServer.classpersistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Repository
public class MainTest {
    public Challenge  challenges (){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx=null;
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        try {
             tx = session.beginTransaction();
            Photo photo= new Photo(1,"c://azizzz",date);
            Challenge challenge=new Challenge(1,1,date,date,date,
                    new Address(1,0.22,0.525,"cnep","khroub","25100","algeria"));
            Administrator administrator=new Administrator();
            challenge.addPhoto(photo);
            session.save(photo);
            session.save(challenge);
            Query q = session.createQuery("FROM Challenge obj WHERE obj.id > :X").setString("X", "6");
            List<Challenge> result = (List<Challenge>) q.list();
            for(int i=0 ;i<result.size();i++){
                System.out.println(result.get(i).getAddress().getCity());
                return result.get(i);
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
        }
        session.close();
        sessionFactory.close();
    return null;
    }
}
