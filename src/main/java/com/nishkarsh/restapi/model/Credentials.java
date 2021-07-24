package com.nishkarsh.restapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "passwordkeeper")
public class Credentials {
    @Id
   private String website;

@NotBlank
    private String username;
@NotBlank
    private String password	;
public Credentials(){
        super();
    }
public Credentials(String website, String username, String password) {
        super();
        this.website = website;
        this.username = username;
        this.password = password;
     
    }
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
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

}