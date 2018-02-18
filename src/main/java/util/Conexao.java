package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

    private static final EntityManagerFactory emf = Persistence.
            createEntityManagerFactory("testeaws");

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
