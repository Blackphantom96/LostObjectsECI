/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Martin
 */

public class Eps1 {
    private int id;
    private String name,foundBy,reciver,returner,reciverId,description;
    private Date foundDate, returnDate;

    public Eps1(){}
    
    public Eps1(int id, String name, String foundBy, String reciver, String returner, String reciverId, String description, Date foundDate, Date returnDate) {
        this.id = id;
        this.name = name;
        this.foundBy = foundBy;
        this.reciver = reciver;
        this.returner = returner;
        this.reciverId = reciverId;
        this.description = description;
        this.foundDate = foundDate;
        this.returnDate = returnDate;
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

    public String getFoundBy() {
        return foundBy;
    }

    public void setFoundBy(String foundBy) {
        this.foundBy = foundBy;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getReturner() {
        return returner;
    }

    public void setReturner(String returner) {
        this.returner = returner;
    }

    public String getReciverId() {
        return reciverId;
    }

    public void setReciverId(String reciverId) {
        this.reciverId = reciverId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eps1 other = (Eps1) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.foundBy, other.foundBy)) {
            return false;
        }
        if (!Objects.equals(this.reciver, other.reciver)) {
            return false;
        }
        if (!Objects.equals(this.returner, other.returner)) {
            return false;
        }
        if (!Objects.equals(this.reciverId, other.reciverId)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.foundDate, other.foundDate)) {
            return false;
        }
        if (!Objects.equals(this.returnDate, other.returnDate)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
