package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PurchaseProductPk implements Serializable {

    @Column(name = "id_compra")
    private Integer purchseId;

    @Column(name = "id_producto")
    private Integer productId;

    public Integer getPurchseId() {
        return purchseId;
    }

    public void setPurchseId(Integer purchseId) {
        this.purchseId = purchseId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
