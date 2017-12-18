package com.meylinagunawan.model;

public class Register {

    private String name;
    private String password;
    private String numberHp;
    private String email;

    public Register() {
    }

    public Register(String name, String password, String numberHp, String email) {
        this.name = name;
        this.password = password;
        this.numberHp = numberHp;
        this.email = email;
    }
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the numberHp
     */
    public String getNumberHp() {
        return numberHp;
    }

    /**
     * @param numberHp the numberHp to set
     */
    public void setNumberHp(String numberHp) {
        this.numberHp = numberHp;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
