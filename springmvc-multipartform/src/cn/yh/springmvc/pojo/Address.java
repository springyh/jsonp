package cn.yh.springmvc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class Address {
    private Long id;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String drivertime;

    private String aname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrivertime() {
        return drivertime;
    }

    public void setDrivertime(String drivertime) {
        this.drivertime = drivertime == null ? null : drivertime.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }
}