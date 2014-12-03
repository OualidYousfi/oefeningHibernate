/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO.Services;

import BO.TblCursisten;
import DAL.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 11627
 */
public class StudentService {
    private Session session;
    
    public StudentService() {
        this.session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }
    
    public List<TblCursisten> getAllCursisten()
    {
        String database = "TblCursisten";
        
        Query q = session.createQuery("from " + database);
        ArrayList<TblCursisten> list = (ArrayList<TblCursisten>) q.list();
        
        return list;
    }
}
