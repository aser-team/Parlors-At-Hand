/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parlour.at.hand.model;

/**
 *
 * @author Shakiba
 */
public class QueryModel {
    String name;
    String location;
    String service;
    String gender;

    public QueryModel(String name, String location, String service, String gender) {
        this.name = name;
        this.location = location;
        this.service = service;
        this.gender = gender;
    }
    
    public QueryModel(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
