
package com.ustrip.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="ResponseTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hotels">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Hotel" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MinTaxPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "responseTimestamp",
    "hotels"
})
@XmlRootElement(name = "HotelListResponse")
public class AliHotelListResponse {

    @XmlElement(name = "ResponseTimestamp", required = true)
    protected String responseTimestamp;
    @XmlElement(name = "Hotels", required = true)
    protected AliHotelListResponse.Hotels hotels;

    /**
     * Gets the value of the responseTimestamp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseTimestamp() {
        return responseTimestamp;
    }

    /**
     * Sets the value of the responseTimestamp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseTimestamp(String value) {
        this.responseTimestamp = value;
    }

    /**
     * Gets the value of the hotels property.
     *
     * @return
     *     possible object is
     *     {@link AliHotelListResponse.Hotels }
     *
     */
    public AliHotelListResponse.Hotels getHotels() {
        return hotels;
    }

    /**
     * Sets the value of the hotels property.
     *
     * @param value
     *     allowed object is
     *     {@link AliHotelListResponse.Hotels }
     *
     */
    public void setHotels(AliHotelListResponse.Hotels value) {
        this.hotels = value;
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
     *         &lt;element name="Hotel" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MinTaxPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "hotel"
    })
    public static class Hotels {

        @XmlElement(name = "Hotel")
        protected List<AliHotelListResponse.Hotels.Hotel> hotel;

        /**
         * Gets the value of the hotel property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotel property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotel().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AliHotelListResponse.Hotels.Hotel }
         *
         *
         */
        public List<AliHotelListResponse.Hotels.Hotel> getHotel() {
            if (hotel == null) {
                hotel = new ArrayList<AliHotelListResponse.Hotels.Hotel>();
            }
            return this.hotel;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MinTaxPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "name",
            "englishName",
            "address",
            "cityCode",
            "hotelCode",
            "checkIn",
            "checkOut",
            "paymentType",
            "minPrice",
            "minTaxPrice",
            "currencyCode"
        })
        public static class Hotel {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "EnglishName", required = true)
            protected String englishName;
            @XmlElement(name = "Address", required = true)
            protected String address;
            @XmlElement(name = "CityCode", required = true)
            protected String cityCode;
            @XmlElement(name = "HotelCode", required = true)
            protected String hotelCode;
            @XmlElement(name = "CheckIn", required = true)
            protected String checkIn;
            @XmlElement(name = "CheckOut", required = true)
            protected String checkOut;
            @XmlElement(name = "PaymentType", required = true)
            protected String paymentType;
            @XmlElement(name = "MinPrice", required = true)
            protected String minPrice;
            @XmlElement(name = "MinTaxPrice", required = true)
            protected String minTaxPrice;
            @XmlElement(name = "CurrencyCode", required = true)
            protected String currencyCode;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the englishName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnglishName() {
                return englishName;
            }

            /**
             * Sets the value of the englishName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnglishName(String value) {
                this.englishName = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the cityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityCode() {
                return cityCode;
            }

            /**
             * Sets the value of the cityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityCode(String value) {
                this.cityCode = value;
            }

            /**
             * Gets the value of the hotelCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCode() {
                return hotelCode;
            }

            /**
             * Sets the value of the hotelCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCode(String value) {
                this.hotelCode = value;
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
             * Gets the value of the minPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinPrice() {
                return minPrice;
            }

            /**
             * Sets the value of the minPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinPrice(String value) {
                this.minPrice = value;
            }

            /**
             * Gets the value of the minTaxPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinTaxPrice() {
                return minTaxPrice;
            }

            /**
             * Sets the value of the minTaxPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinTaxPrice(String value) {
                this.minTaxPrice = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

        }

    }

}
