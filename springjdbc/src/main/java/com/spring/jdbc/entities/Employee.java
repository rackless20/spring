package com.spring.jdbc.entities;

public class Employee {
    private int eid;
    private String ename;
    private String dname;

    

    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    
 // Default Constructor
    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", dname=" + dname + "]";
    }
}
