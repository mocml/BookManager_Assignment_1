/*
 * Copyright(C) 2021 ,FPT UNIVERSITY
 * 
 * DATE        Version         Author          DESCRIPTION
 * 10/08/2021    1.0            Vanhv   
 */


/**
 *
 * @author vanhv
 */
public class Reader {

    private String rCode;
    private String name;
    private int bYear;

    public Reader() {
    }  

    public Reader(String rCode, String name, int bYear) {
        this.rCode = rCode;
        this.name = name;
        this.bYear = bYear;
    }

    public String getrCode() {
        return rCode;
    }

    public void setrCode(String rCode) {
        this.rCode = rCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    @Override
    public String toString() {
        return "Reader{" + "rCode=" + rCode + ", name=" + name + ", bYear=" + bYear + '}';
    }
    
}
