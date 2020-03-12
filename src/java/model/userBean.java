/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
 
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
 import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
  
/**
 *
 * @author ahmed elhagrasi
 */
@ManagedBean(name = "bean")
@SessionScoped
public class userBean {
    
    private String name;
    private String depart;
    private int Age;
    private int Salary;
    private static final Map <String,Object> country;
    private String locale;

    
    static{
      country= new LinkedHashMap();
    country.put("english", Locale.ENGLISH);
    country.put("arabic", new Locale("ar"));
    }
    public userBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

   public String addEmployee(){
    return "success";
   }

    public  Map<String, Object> getCountry() {
        return country;
    }

    
   
  
     

  
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
 
    
   
 public void LocalChange(ValueChangeEvent e ){
        String localeVal = e.getNewValue().toString();
        for(Map.Entry<String,Object> entry: country.entrySet()){
            if (entry.getValue().toString().equals(localeVal)) {
                FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)entry.getValue());
            }
        }
 }

}