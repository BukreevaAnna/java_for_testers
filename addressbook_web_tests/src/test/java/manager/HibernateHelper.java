package manager;

import model.GroupData;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class HibernateHelper extends HelperBase{

    private SessionFactory sessionFactory;

        public HibernateHelper(ApplicationManager manager) {
            super(manager);

            sessionFactory = new Configuration()
//                    .addAnnotatedClass(ContactRecord.class)
//                    .addAnnotatedClass(GroupRecord.class)
                    .setProperty(AvailableSettings.URL, "jdbc:mysql://localhost/addressbook")
                    .setProperty(AvailableSettings.USER, "root")
                    .setProperty(AvailableSettings.PASS, "")
                    .buildSessionFactory();
        }

    public List<GroupData> getGroupList () {
        return sessionFactory.fromSession(session -> {
            return session.createQuery("from GroupRecord", GroupData.class).list();
        });
    }
}

