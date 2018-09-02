
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
 *         &lt;element name="AuthenticationToken">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RequestTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaxRooms">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaxRoom" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ChildrenAges">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "authenticationToken",
    "checkIn",
    "checkOut",
    "rateKey",
    "rateCode",
    "roomTypeCode",
    "hotelCode",
    "paymentType",
    "paxRooms"
})
@XmlRootElement(name = "HotelRoomsRequest")
public class AliHotelRoomsRequest {

    @XmlElement(name = "AuthenticationToken", required = true)
    protected AliHotelRoomsRequest.AuthenticationToken authenticationToken;
    @XmlElement(name = "CheckIn", required = true)
    protected String checkIn;
    @XmlElement(name = "CheckOut", required = true)
    protected String checkOut;
    @XmlElement(name = "RateKey", required = true)
    protected String rateKey;
    @XmlElement(name = "RateCode", required = true)
    protected String rateCode;
    @XmlElement(name = "RoomTypeCode", required = true)
    protected String roomTypeCode;
    @XmlElement(name = "HotelCode", required = true)
    protected String hotelCode;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "PaxRooms", required = true)
    protected AliHotelRoomsRequest.PaxRooms paxRooms;

    /**
     * Gets the value of the authenticationToken property.
     *
     * @return
     *     possible object is
     *     {@link AliHotelRoomsRequest.AuthenticationToken }
     *
     */
    public AliHotelRoomsRequest.AuthenticationToken getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Sets the value of the authenticationToken property.
     *
     * @param value
     *     allowed object is
     *     {@link AliHotelRoomsRequest.AuthenticationToken }
     *
     */
    public void setAuthenticationToken(AliHotelRoomsRequest.AuthenticationToken value) {
        this.authenticationToken = value;
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
     * Gets the value of the rateKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * Sets the value of the rateKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRateKey(String value) {
        this.rateKey = value;
    }

    /**
     * Gets the value of the rateCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the roomTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * Sets the value of the roomTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
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
     * Gets the value of the paxRooms property.
     *
     * @return
     *     possible object is
     *     {@link AliHotelRoomsRequest.PaxRooms }
     *
     */
    public AliHotelRoomsRequest.PaxRooms getPaxRooms() {
        return paxRooms;
    }

    /**
     * Sets the value of the paxRooms property.
     *
     * @param value
     *     allowed object is
     *     {@link AliHotelRoomsRequest.PaxRooms }
     *
     */
    public void setPaxRooms(AliHotelRoomsRequest.PaxRooms value) {
        this.paxRooms = value;
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
     *         &lt;element name="RequestTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "requestTimestamp",
        "signature"
    })
    public static class AuthenticationToken {

        @XmlElement(name = "Username", required = true)
        protected String username;
        @XmlElement(name = "RequestTimestamp", required = true)
        protected String requestTimestamp;
        @XmlElement(name = "Signature", required = true)
        protected String signature;

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
         * Gets the value of the requestTimestamp property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRequestTimestamp() {
            return requestTimestamp;
        }

        /**
         * Sets the value of the requestTimestamp property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRequestTimestamp(String value) {
            this.requestTimestamp = value;
        }

        /**
         * Gets the value of the signature property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSignature() {
            return signature;
        }

        /**
         * Sets the value of the signature property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSignature(String value) {
            this.signature = value;
        }

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
     *         &lt;element name="PaxRoom" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ChildrenAges">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "paxRoom"
    })
    public static class PaxRooms {

        @XmlElement(name = "PaxRoom")
        protected List<AliHotelRoomsRequest.PaxRooms.PaxRoom> paxRoom;

        /**
         * Gets the value of the paxRoom property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxRoom property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxRoom().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AliHotelRoomsRequest.PaxRooms.PaxRoom }
         *
         *
         */
        public List<AliHotelRoomsRequest.PaxRooms.PaxRoom> getPaxRoom() {
            if (paxRoom == null) {
                paxRoom = new ArrayList<AliHotelRoomsRequest.PaxRooms.PaxRoom>();
            }
            return this.paxRoom;
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
         *         &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ChildrenAges">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "roomIndex",
            "adults",
            "children",
            "childrenAges"
        })
        public static class PaxRoom {

            @XmlElement(name = "RoomIndex", required = true)
            protected String roomIndex;
            @XmlElement(name = "Adults", required = true)
            protected String adults;
            @XmlElement(name = "Children", required = true)
            protected String children;
            @XmlElement(name = "ChildrenAges", required = true)
            protected AliHotelRoomsRequest.PaxRooms.PaxRoom.ChildrenAges childrenAges;

            /**
             * Gets the value of the roomIndex property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRoomIndex() {
                return roomIndex;
            }

            /**
             * Sets the value of the roomIndex property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRoomIndex(String value) {
                this.roomIndex = value;
            }

            /**
             * Gets the value of the adults property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAdults() {
                return adults;
            }

            /**
             * Sets the value of the adults property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAdults(String value) {
                this.adults = value;
            }

            /**
             * Gets the value of the children property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getChildren() {
                return children;
            }

            /**
             * Sets the value of the children property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setChildren(String value) {
                this.children = value;
            }

            /**
             * Gets the value of the childrenAges property.
             *
             * @return
             *     possible object is
             *     {@link AliHotelRoomsRequest.PaxRooms.PaxRoom.ChildrenAges }
             *
             */
            public AliHotelRoomsRequest.PaxRooms.PaxRoom.ChildrenAges getChildrenAges() {
                return childrenAges;
            }

            /**
             * Sets the value of the childrenAges property.
             *
             * @param value
             *     allowed object is
             *     {@link AliHotelRoomsRequest.PaxRooms.PaxRoom.ChildrenAges }
             *
             */
            public void setChildrenAges(AliHotelRoomsRequest.PaxRooms.PaxRoom.ChildrenAges value) {
                this.childrenAges = value;
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
             *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "age"
            })
            public static class ChildrenAges {

                @XmlElement(name = "Age")
                protected List<String> age;

                /**
                 * Gets the value of the age property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the age property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAge().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getAge() {
                    if (age == null) {
                        age = new ArrayList<String>();
                    }
                    return this.age;
                }

            }

        }

    }

}
