
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
 *         &lt;element name="AuthenticationToken">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CreateToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaoBaoHotelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaoBaoRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaoBaoRatePlanId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaoBaoGid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoomNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "authenticationToken",
    "taoBaoHotelId",
    "hotelId",
    "taoBaoRoomTypeId",
    "roomTypeId",
    "taoBaoRatePlanId",
    "ratePlanCode",
    "taoBaoGid",
    "checkIn",
    "checkOut",
    "roomNum",
    "customerNumber",
    "paymentType",
    "extensions"
})
@XmlRootElement(name = "ValidateRQ")
public class AliValidateRQ {

    @XmlElement(name = "AuthenticationToken", required = true)
    protected AliValidateRQ.AuthenticationToken authenticationToken;
    @XmlElement(name = "TaoBaoHotelId", required = true)
    protected String taoBaoHotelId;
    @XmlElement(name = "HotelId", required = true)
    protected String hotelId;
    @XmlElement(name = "TaoBaoRoomTypeId", required = true)
    protected String taoBaoRoomTypeId;
    @XmlElement(name = "RoomTypeId", required = true)
    protected String roomTypeId;
    @XmlElement(name = "TaoBaoRatePlanId", required = true)
    protected String taoBaoRatePlanId;
    @XmlElement(name = "RatePlanCode", required = true)
    protected String ratePlanCode;
    @XmlElement(name = "TaoBaoGid", required = true)
    protected String taoBaoGid;
    @XmlElement(name = "CheckIn", required = true)
    protected String checkIn;
    @XmlElement(name = "CheckOut", required = true)
    protected String checkOut;
    @XmlElement(name = "RoomNum", required = true)
    protected String roomNum;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "Extensions", required = true)
    protected String extensions;

    /**
     * Gets the value of the authenticationToken property.
     * 
     * @return
     *     possible object is
     *     {@link AliValidateRQ.AuthenticationToken }
     *     
     */
    public AliValidateRQ.AuthenticationToken getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Sets the value of the authenticationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliValidateRQ.AuthenticationToken }
     *     
     */
    public void setAuthenticationToken(AliValidateRQ.AuthenticationToken value) {
        this.authenticationToken = value;
    }

    /**
     * Gets the value of the taoBaoHotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaoBaoHotelId() {
        return taoBaoHotelId;
    }

    /**
     * Sets the value of the taoBaoHotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaoBaoHotelId(String value) {
        this.taoBaoHotelId = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the taoBaoRoomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaoBaoRoomTypeId() {
        return taoBaoRoomTypeId;
    }

    /**
     * Sets the value of the taoBaoRoomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaoBaoRoomTypeId(String value) {
        this.taoBaoRoomTypeId = value;
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the taoBaoRatePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaoBaoRatePlanId() {
        return taoBaoRatePlanId;
    }

    /**
     * Sets the value of the taoBaoRatePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaoBaoRatePlanId(String value) {
        this.taoBaoRatePlanId = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the taoBaoGid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaoBaoGid() {
        return taoBaoGid;
    }

    /**
     * Sets the value of the taoBaoGid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaoBaoGid(String value) {
        this.taoBaoGid = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckIn(String value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOut(String value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the roomNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNum() {
        return roomNum;
    }

    /**
     * Sets the value of the roomNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNum(String value) {
        this.roomNum = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensions(String value) {
        this.extensions = value;
    }


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
     *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CreateToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "username",
        "password",
        "createToken"
    })
    public static class AuthenticationToken {

        @XmlElement(name = "Username", required = true)
        protected String username;
        @XmlElement(name = "Password", required = true)
        protected String password;
        @XmlElement(name = "CreateToken", required = true)
        protected String createToken;

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the createToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreateToken() {
            return createToken;
        }

        /**
         * Sets the value of the createToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreateToken(String value) {
            this.createToken = value;
        }

    }

}
