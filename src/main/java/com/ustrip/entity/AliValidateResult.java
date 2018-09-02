
package com.ustrip.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreateOrderValidateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InventoryPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "message",
    "createOrderValidateKey",
    "resultCode",
    "inventoryPrice"
})
@XmlRootElement(name = "Result")
public class AliValidateResult {

    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "CreateOrderValidateKey", required = true)
    protected String createOrderValidateKey;
    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "InventoryPrice", required = true)
    protected String inventoryPrice;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the createOrderValidateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateOrderValidateKey() {
        return createOrderValidateKey;
    }

    /**
     * Sets the value of the createOrderValidateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateOrderValidateKey(String value) {
        this.createOrderValidateKey = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the inventoryPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryPrice() {
        return inventoryPrice;
    }

    /**
     * Sets the value of the inventoryPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryPrice(String value) {
        this.inventoryPrice = value;
    }

}
