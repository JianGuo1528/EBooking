
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
 *         &lt;element name="HotelCodes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelCode" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="100"/>
 *                         &lt;enumeration value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="RoomIndex">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Adults">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Children">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ChildrenAges">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Age" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="8"/>
 *                                             &lt;enumeration value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
    "hotelCodes",
    "checkIn",
    "checkOut",
    "cityCode",
    "paymentType",
    "paxRooms"
})
@XmlRootElement(name = "HotelListRequest")
public class AliHotelListRequest {

    @XmlElement(name = "AuthenticationToken", required = true)
    protected AliHotelListRequest.AuthenticationToken authenticationToken;
    @XmlElement(name = "HotelCodes")
    protected AliHotelListRequest.HotelCodes hotelCodes;
    @XmlElement(name = "CheckIn", required = true)
    protected String checkIn;
    @XmlElement(name = "CheckOut", required = true)
    protected String checkOut;
    @XmlElement(name = "CityCode", required = true)
    protected String cityCode;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "PaxRooms", required = true)
    protected AliHotelListRequest.PaxRooms paxRooms;

    /**
     * Gets the value of the authenticationToken property.
     *
     * @return
     *     possible object is
     *     {@link AliHotelListRequest.AuthenticationToken }
     *
     */
    public AliHotelListRequest.AuthenticationToken getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Sets the value of the authenticationToken property.
     *
     * @param value
     *     allowed object is
     *     {@link AliHotelListRequest.AuthenticationToken }
     *
     */
    public void setAuthenticationToken(AliHotelListRequest.AuthenticationToken value) {
        this.authenticationToken = value;
    }

    /**
     * Gets the value of the hotelCodes property.
     *
     * @return
     *     possible object is
     *     {@link AliHotelListRequest.HotelCodes }
     *
     */
    public AliHotelListRequest.HotelCodes getHotelCodes() {
        return hotelCodes;
    }

    /**
     * Sets the value of the hotelCodes property.
     *
     * @param value
     *     allowed object is
     *     {@link AliHotelListRequest.HotelCodes }
     *
     */
    public void setHotelCodes(AliHotelListRequest.HotelCodes value) {
        this.hotelCodes = value;
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
     *     {@link AliHotelListRequest.PaxRooms }
     *
     */
    public AliHotelListRequest.PaxRooms getPaxRooms() {
        return paxRooms;
    }

    /**
     * Sets the value of the paxRooms property.
     *
     * @param value
     *     allowed object is
     *     {@link AliHotelListRequest.PaxRooms }
     *
     */
    public void setPaxRooms(AliHotelListRequest.PaxRooms value) {
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
     *         &lt;element name="HotelCode" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="100"/>
     *               &lt;enumeration value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "hotelCode"
    })
    public static class HotelCodes {

        @XmlElement(name = "HotelCode")
        protected List<String> hotelCode;

        /**
         * Gets the value of the hotelCode property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelCode property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelCode().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getHotelCode() {
            if (hotelCode == null) {
                hotelCode = new ArrayList<String>();
            }
            return this.hotelCode;
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
     *                   &lt;element name="RoomIndex">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Adults">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Children">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ChildrenAges">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Age" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="8"/>
     *                                   &lt;enumeration value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
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
        "paxRoom"
    })
    public static class PaxRooms {

        @XmlElement(name = "PaxRoom")
        protected List<AliHotelListRequest.PaxRooms.PaxRoom> paxRoom;

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
         * {@link AliHotelListRequest.PaxRooms.PaxRoom }
         *
         *
         */
        public List<AliHotelListRequest.PaxRooms.PaxRoom> getPaxRoom() {
            if (paxRoom == null) {
                paxRoom = new ArrayList<AliHotelListRequest.PaxRooms.PaxRoom>();
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
         *         &lt;element name="RoomIndex">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Adults">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Children">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ChildrenAges">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Age" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="8"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
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
            protected AliHotelListRequest.PaxRooms.PaxRoom.ChildrenAges childrenAges;

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
             *     {@link AliHotelListRequest.PaxRooms.PaxRoom.ChildrenAges }
             *
             */
            public AliHotelListRequest.PaxRooms.PaxRoom.ChildrenAges getChildrenAges() {
                return childrenAges;
            }

            /**
             * Sets the value of the childrenAges property.
             *
             * @param value
             *     allowed object is
             *     {@link AliHotelListRequest.PaxRooms.PaxRoom.ChildrenAges }
             *
             */
            public void setChildrenAges(AliHotelListRequest.PaxRooms.PaxRoom.ChildrenAges value) {
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
             *         &lt;element name="Age" maxOccurs="unbounded" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="8"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
