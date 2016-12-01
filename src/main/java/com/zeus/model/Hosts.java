package com.zeus.model;

public class Hosts {
    private Long hostid;

    private Long proxyHostid;

    private String host;

    private Integer status;

    private Integer disableUntil;

    private String error;

    private Integer available;

    private Integer errorsFrom;

    private Integer lastaccess;

    private Integer ipmiAuthtype;

    private Integer ipmiPrivilege;

    private String ipmiUsername;

    private String ipmiPassword;

    private Integer ipmiDisableUntil;

    private Integer ipmiAvailable;

    private Integer snmpDisableUntil;

    private Integer snmpAvailable;

    private Long maintenanceid;

    private Integer maintenanceStatus;

    private Integer maintenanceType;

    private Integer maintenanceFrom;

    private Integer ipmiErrorsFrom;

    private Integer snmpErrorsFrom;

    private String ipmiError;

    private String snmpError;

    private Integer jmxDisableUntil;

    private Integer jmxAvailable;

    private Integer jmxErrorsFrom;

    private String jmxError;

    private String name;

    private Integer flags;

    private Long templateid;

    private String description;

    public Long getHostid() {
        return hostid;
    }

    public void setHostid(Long hostid) {
        this.hostid = hostid;
    }

    public Long getProxyHostid() {
        return proxyHostid;
    }

    public void setProxyHostid(Long proxyHostid) {
        this.proxyHostid = proxyHostid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDisableUntil() {
        return disableUntil;
    }

    public void setDisableUntil(Integer disableUntil) {
        this.disableUntil = disableUntil;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getErrorsFrom() {
        return errorsFrom;
    }

    public void setErrorsFrom(Integer errorsFrom) {
        this.errorsFrom = errorsFrom;
    }

    public Integer getLastaccess() {
        return lastaccess;
    }

    public void setLastaccess(Integer lastaccess) {
        this.lastaccess = lastaccess;
    }

    public Integer getIpmiAuthtype() {
        return ipmiAuthtype;
    }

    public void setIpmiAuthtype(Integer ipmiAuthtype) {
        this.ipmiAuthtype = ipmiAuthtype;
    }

    public Integer getIpmiPrivilege() {
        return ipmiPrivilege;
    }

    public void setIpmiPrivilege(Integer ipmiPrivilege) {
        this.ipmiPrivilege = ipmiPrivilege;
    }

    public String getIpmiUsername() {
        return ipmiUsername;
    }

    public void setIpmiUsername(String ipmiUsername) {
        this.ipmiUsername = ipmiUsername == null ? null : ipmiUsername.trim();
    }

    public String getIpmiPassword() {
        return ipmiPassword;
    }

    public void setIpmiPassword(String ipmiPassword) {
        this.ipmiPassword = ipmiPassword == null ? null : ipmiPassword.trim();
    }

    public Integer getIpmiDisableUntil() {
        return ipmiDisableUntil;
    }

    public void setIpmiDisableUntil(Integer ipmiDisableUntil) {
        this.ipmiDisableUntil = ipmiDisableUntil;
    }

    public Integer getIpmiAvailable() {
        return ipmiAvailable;
    }

    public void setIpmiAvailable(Integer ipmiAvailable) {
        this.ipmiAvailable = ipmiAvailable;
    }

    public Integer getSnmpDisableUntil() {
        return snmpDisableUntil;
    }

    public void setSnmpDisableUntil(Integer snmpDisableUntil) {
        this.snmpDisableUntil = snmpDisableUntil;
    }

    public Integer getSnmpAvailable() {
        return snmpAvailable;
    }

    public void setSnmpAvailable(Integer snmpAvailable) {
        this.snmpAvailable = snmpAvailable;
    }

    public Long getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenanceid(Long maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public Integer getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(Integer maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    public Integer getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(Integer maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public Integer getMaintenanceFrom() {
        return maintenanceFrom;
    }

    public void setMaintenanceFrom(Integer maintenanceFrom) {
        this.maintenanceFrom = maintenanceFrom;
    }

    public Integer getIpmiErrorsFrom() {
        return ipmiErrorsFrom;
    }

    public void setIpmiErrorsFrom(Integer ipmiErrorsFrom) {
        this.ipmiErrorsFrom = ipmiErrorsFrom;
    }

    public Integer getSnmpErrorsFrom() {
        return snmpErrorsFrom;
    }

    public void setSnmpErrorsFrom(Integer snmpErrorsFrom) {
        this.snmpErrorsFrom = snmpErrorsFrom;
    }

    public String getIpmiError() {
        return ipmiError;
    }

    public void setIpmiError(String ipmiError) {
        this.ipmiError = ipmiError == null ? null : ipmiError.trim();
    }

    public String getSnmpError() {
        return snmpError;
    }

    public void setSnmpError(String snmpError) {
        this.snmpError = snmpError == null ? null : snmpError.trim();
    }

    public Integer getJmxDisableUntil() {
        return jmxDisableUntil;
    }

    public void setJmxDisableUntil(Integer jmxDisableUntil) {
        this.jmxDisableUntil = jmxDisableUntil;
    }

    public Integer getJmxAvailable() {
        return jmxAvailable;
    }

    public void setJmxAvailable(Integer jmxAvailable) {
        this.jmxAvailable = jmxAvailable;
    }

    public Integer getJmxErrorsFrom() {
        return jmxErrorsFrom;
    }

    public void setJmxErrorsFrom(Integer jmxErrorsFrom) {
        this.jmxErrorsFrom = jmxErrorsFrom;
    }

    public String getJmxError() {
        return jmxError;
    }

    public void setJmxError(String jmxError) {
        this.jmxError = jmxError == null ? null : jmxError.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Long getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Long templateid) {
        this.templateid = templateid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}