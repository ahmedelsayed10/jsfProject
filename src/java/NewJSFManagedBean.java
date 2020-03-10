
import javax.faces.bean.ManagedBean;
 import javax.faces.bean.SessionScoped;


 

 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
/**
 *
 * @author ahmed elhagrasi
 */
 @ManagedBean(name = "bean")
 @SessionScoped
 
 
public class NewJSFManagedBean {
     
    private int id;
    private String name;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
