package org.ieti.MertGeorge.util;

import java.util.List;


public class Store {
    private String product;
    private Integer numberOrder;
    Integer id;
    String adress;
    Boolean validate;
    List<Integer> grades;
    public Store(String product, int numberOrder, Integer id, Boolean validate, List<Integer> grades) {
        this.product = product;
        this.numberOrder= numberOrder;
        this.id = id;
        this.validate = validate;
        this.grades = grades;
    }



    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setNumberOrder(Integer numberOrder) {
        this.numberOrder = numberOrder;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setValidate(Boolean validate) {
        this.validate = validate;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public Integer getNumberOrder() {
        return numberOrder;
    }

    public Integer getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public Boolean getValidate() {
        return validate;
    }

    public List<Integer> getGrades() {
        return grades;
    }


    public Store() {
    }

    public Store(String product, Integer numberOrder, Integer id, String adress, Boolean validate, List<Integer> grades) {
        this.product = product;
        this.numberOrder = numberOrder;
        this.id = id;
        this.adress = adress;
        this.validate = validate;
        this.grades = grades;
    }
}
