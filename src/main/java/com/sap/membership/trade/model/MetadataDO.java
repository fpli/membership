package com.sap.membership.trade.model;

public class MetadataDO {
    private Integer id;

    private Integer sortNum;

    private String tableField;

    private String param;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getTableField() {
        return tableField;
    }

    public void setTableField(String tableField) {
        this.tableField = tableField == null ? null : tableField.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }
}