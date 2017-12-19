/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meylinagunawan.model;

/**
 *
 * @author user
 */
public class Barang {
    private Product produk;
    private int jumlahBarang;

    public Barang() {
    }

    public Barang(Product produk, int jumlahBarang) {
        this.produk = produk;
        this.jumlahBarang = jumlahBarang;
    }

    /**
     * @return the produk
     */
    public Product getProduk() {
        return produk;
    }

    /**
     * @param produk the produk to set
     */
    public void setProduk(Product produk) {
        this.produk = produk;
    }

    /**
     * @return the jumlahBarang
     */
    public int getJumlahBarang() {
        return jumlahBarang;
    }

    /**
     * @param jumlahBarang the jumlahBarang to set
     */
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}
