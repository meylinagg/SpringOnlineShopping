/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meylinagunawan.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Cart {
    private Map<Integer, Barang> isiKeranjang = new HashMap<>();

    public Cart() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the isiKeranjang
     */
    public Map<Integer, Barang> getIsiKeranjang() {
        return isiKeranjang;
    }

    /**
     * @param isiKeranjang the isiKeranjang to set
     */
    public void setIsiKeranjang(Map<Integer, Barang> isiKeranjang) {
        this.isiKeranjang = isiKeranjang;
    }
}
