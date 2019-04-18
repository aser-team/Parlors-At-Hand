/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parlour.at.hand.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author shakiba
 */
@Entity
public class parlor {
    @Id
    private int pid;
    private String pname;
    private String pfor;
    private String pservicel;
    private String pservicet;
    private String powner;
    private int pcontact;
    private String pemail;
    private String username;
    private String password;
    private int rating;
    private String photo;

    public parlor() {
    }

    public parlor(int pid, String pname, String pfor, String pservicel, String pservicet, String powner, int pcontact, String pemail, String username, String password, int rating, String photo) {
        this.pid = pid;
        this.pname = pname;
        this.pfor = pfor;
        this.pservicel = pservicel;
        this.pservicet = pservicet;
        this.powner = powner;
        this.pcontact = pcontact;
        this.pemail = pemail;
        this.username = username;
        this.password = password;
        this.rating = rating;
        this.photo = photo;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPfor() {
        return pfor;
    }

    public void setPfor(String pfor) {
        this.pfor = pfor;
    }

    public String getPservicel() {
        return pservicel;
    }

    public void setPservicel(String pservicel) {
        this.pservicel = pservicel;
    }

    public String getPservicet() {
        return pservicet;
    }

    public void setPservicet(String pservicet) {
        this.pservicet = pservicet;
    }

    public String getPowner() {
        return powner;
    }

    public void setPowner(String powner) {
        this.powner = powner;
    }

    public int getPcontact() {
        return pcontact;
    }

    public void setPcontact(int pcontact) {
        this.pcontact = pcontact;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "parlor{" + "pid=" + pid + ", pname=" + pname + ", pfor=" + pfor + ", pservicel=" + pservicel + ", pservicet=" + pservicet + ", powner=" + powner + ", pcontact=" + pcontact + ", pemail=" + pemail + ", username=" + username + ", password=" + password + ", rating=" + rating + ", photo=" + photo + '}';
    }
    
    
    
}
