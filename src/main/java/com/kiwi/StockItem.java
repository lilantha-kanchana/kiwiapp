package com.kiwi;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by malithi on 12/25/16.
 */
@Entity
@Table (name="STOCKITEMS")
public class StockItem  implements Serializable{
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String itemName;
    private String serialNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }

    //@Column(name = "itemName")
    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return " StockItem " + id + " item name " + itemName + " serial number " + serialNumber ;
    }

    //@Column(name = "serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

//    public void setSerialNumber(String serialNumber) {
//        this.serialNumber = serialNumber;
//    }
}
