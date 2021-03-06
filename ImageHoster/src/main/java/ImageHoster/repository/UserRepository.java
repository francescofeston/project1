package ImageHoster.repository;

import ImageHoster.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

//Write the annotation which is a special type of @Component annotation and describes that the class defines a data repository
public class UserRepository {
    //Get an instance of EntityManagerFactory from persistence unit with name as 'imageHoster'
    @PersistenceUnit(unitName = "imageHoster")
    private EntityManagerFactory emf;

    //The method receives the User object to be persisted in the database
    //Creates an instance of EntityManager
    //Starts a transaction
    //The transaction is committed if it is successful
    //The transaction is rolled back in case of unsuccessful transaction
    public void registerUser(User newUser) {
        EntityManager em = emf.createEntityManager();
        //Complete the method
    }
}