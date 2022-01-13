package DAO;

import Models.Seguro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.SessionFactoryUtil;

import java.sql.SQLException;


public class SeguroDAO {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;


    public SeguroDAO() {
        sessionFactory = SessionFactoryUtil.getSession();
    }

    public boolean insertarSeguro(Seguro seguro) {
        try {
            iniciarTransaccion();
            session.save(seguro);
            transaction.commit();
            session.close();
            liberar();
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause instanceof SQLException) {
                System.out.println(cause.getMessage());
            }
            return false;
        }
        return true;

    }


    public void eliminarSeguro(Seguro seguro) {
        iniciarTransaccion();
        session.delete(seguro);
        transaction.commit();
        session.close();
        liberar();
    }

    public void actualizarSeguro(Seguro seguro) {
        iniciarTransaccion();
        session.update(seguro);
        transaction.commit();
        session.close();
        liberar();
    }

    public Seguro buscar(int idSeguro) {
        Seguro seguro;
        iniciarTransaccion();
        seguro = session.get(Seguro.class, idSeguro);
        transaction.commit();
        session.close();
        liberar();
        return seguro;
    }


    private void iniciarTransaccion() {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    private void liberar() {

        if (transaction != null)
            transaction = null;
        if (session != null) {
            session = null;
        }
    }

}
