/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaines;

import entities.Employe;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.EmployeService;

/**
 *
 * @author Adnane Elayachi
 */

@ManagedBean
@RequestScoped
public class EmployeBean {
     private Employe employe;
    private List<Employe> employes;
    private EmployeService  es;
    
      public EmployeBean() {
        employe = new Employe();
        es = new EmployeService();
    }
      
      
    public void onCreateAction(){
        es.create(employe);
        employe = new Employe();
        
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    
}
