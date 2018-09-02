
package com.ustrip.entity;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ResponseTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hotel">
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
 *                   &lt;element name="RoomTypes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomType" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RoomTypeEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="MaxRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RateInfos">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RateInfo" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="RateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="RateEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Allotment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="MaxChildren" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Board">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="BoardCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="TotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="TotalTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="CancelPolicyInfos">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="StartWindowHours">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;enumeration value="0"/>
 *                                                                                     &lt;enumeration value="48"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="NightCount">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;enumeration value="1"/>
 *                                                                                     &lt;enumeration value="0"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="HotelFees">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                                                     &lt;element name="HotelFee">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/choice>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="RateComments">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="RateComment" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;enumeration value="drop the key at the gate"/>
 *                                                                           &lt;enumeration value="dinner can not be served"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PaxPriceRooms">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PaxPriceRoom" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="RoomIndex">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;enumeration value="1"/>
 *                                                                                     &lt;enumeration value="2"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Children">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;enumeration value="2"/>
 *                                                                                     &lt;enumeration value="0"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="ChildrenAges" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="DailyInfos">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="Day">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;enumeration value="2016-12-24"/>
 *                                                                                                         &lt;enumeration value="2016-12-25"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
    "responseTimestamp",
    "hotel"
})
@XmlRootElement(name = "HotelRoomsResponse")
public class AliHotelRoomsResponse {

    @XmlElement(name = "ResponseTimestamp", required = true)
    protected String responseTimestamp;
    @XmlElement(name = "Hotel", required = true)
    protected AliHotelRoomsResponse.Hotel hotel;

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
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link AliHotelRoomsResponse.Hotel }
     *     
     */
    public AliHotelRoomsResponse.Hotel getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliHotelRoomsResponse.Hotel }
     *     
     */
    public void setHotel(AliHotelRoomsResponse.Hotel value) {
        this.hotel = value;
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
     *         &lt;element name="RoomTypes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomType" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RoomTypeEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="MaxRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RateInfos">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RateInfo" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="RateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="RateEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Allotment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="MaxChildren" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Board">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="BoardCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="TotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="TotalTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="CancelPolicyInfos">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="StartWindowHours">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;enumeration value="0"/>
     *                                                                           &lt;enumeration value="48"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="NightCount">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;enumeration value="1"/>
     *                                                                           &lt;enumeration value="0"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="HotelFees">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                                                           &lt;element name="HotelFee">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/choice>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="RateComments">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="RateComment" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;enumeration value="drop the key at the gate"/>
     *                                                                 &lt;enumeration value="dinner can not be served"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PaxPriceRooms">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PaxPriceRoom" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="RoomIndex">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;enumeration value="1"/>
     *                                                                           &lt;enumeration value="2"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Children">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;enumeration value="2"/>
     *                                                                           &lt;enumeration value="0"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="ChildrenAges" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="DailyInfos">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="Day">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                               &lt;enumeration value="2016-12-24"/>
     *                                                                                               &lt;enumeration value="2016-12-25"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
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
        "currencyCode",
        "roomTypes"
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
        @XmlElement(name = "RoomTypes", required = true)
        protected AliHotelRoomsResponse.Hotel.RoomTypes roomTypes;

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

        /**
         * Gets the value of the roomTypes property.
         * 
         * @return
         *     possible object is
         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes }
         *     
         */
        public AliHotelRoomsResponse.Hotel.RoomTypes getRoomTypes() {
            return roomTypes;
        }

        /**
         * Sets the value of the roomTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes }
         *     
         */
        public void setRoomTypes(AliHotelRoomsResponse.Hotel.RoomTypes value) {
            this.roomTypes = value;
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
         *         &lt;element name="RoomType" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RoomTypeEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="MaxRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RateInfos">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RateInfo" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="RateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="RateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="RateEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Allotment" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="MaxChildren" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Board">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="BoardCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="TotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="TotalTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="CancelPolicyInfos">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="StartWindowHours">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;enumeration value="0"/>
         *                                                                 &lt;enumeration value="48"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="NightCount">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;enumeration value="1"/>
         *                                                                 &lt;enumeration value="0"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="HotelFees">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;choice maxOccurs="unbounded" minOccurs="0">
         *                                                 &lt;element name="HotelFee">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/choice>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="RateComments">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="RateComment" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;enumeration value="drop the key at the gate"/>
         *                                                       &lt;enumeration value="dinner can not be served"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PaxPriceRooms">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PaxPriceRoom" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="RoomIndex">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;enumeration value="1"/>
         *                                                                 &lt;enumeration value="2"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Children">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;enumeration value="2"/>
         *                                                                 &lt;enumeration value="0"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="ChildrenAges" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="DailyInfos">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="Day">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                     &lt;enumeration value="2016-12-24"/>
         *                                                                                     &lt;enumeration value="2016-12-25"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
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
            "roomType"
        })
        public static class RoomTypes {

            @XmlElement(name = "RoomType")
            protected List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType> roomType;

            /**
             * Gets the value of the roomType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType }
             * 
             * 
             */
            public List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType> getRoomType() {
                if (roomType == null) {
                    roomType = new ArrayList<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType>();
                }
                return this.roomType;
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
             *         &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RoomTypeEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="MaxRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RateInfos">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RateInfo" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="RateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="RateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="RateEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Allotment" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="MaxChildren" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Board">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="BoardCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="TotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="TotalTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="CancelPolicyInfos">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="StartWindowHours">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;enumeration value="0"/>
             *                                                       &lt;enumeration value="48"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="NightCount">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;enumeration value="1"/>
             *                                                       &lt;enumeration value="0"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="HotelFees">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
             *                                       &lt;element name="HotelFee">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/choice>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="RateComments">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="RateComment" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;enumeration value="drop the key at the gate"/>
             *                                             &lt;enumeration value="dinner can not be served"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PaxPriceRooms">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PaxPriceRoom" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="RoomIndex">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;enumeration value="1"/>
             *                                                       &lt;enumeration value="2"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Children">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;enumeration value="2"/>
             *                                                       &lt;enumeration value="0"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="ChildrenAges" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="DailyInfos">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="Day">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                           &lt;enumeration value="2016-12-24"/>
             *                                                                           &lt;enumeration value="2016-12-25"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
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
                "roomTypeCode",
                "roomTypeName",
                "roomTypeEnglishName",
                "maxRoomOccupancy",
                "rateInfos"
            })
            public static class RoomType {

                @XmlElement(name = "RoomTypeCode", required = true)
                protected String roomTypeCode;
                @XmlElement(name = "RoomTypeName", required = true)
                protected String roomTypeName;
                @XmlElement(name = "RoomTypeEnglishName", required = true)
                protected String roomTypeEnglishName;
                @XmlElement(name = "MaxRoomOccupancy", required = true)
                protected String maxRoomOccupancy;
                @XmlElement(name = "RateInfos", required = true)
                protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos rateInfos;

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
                 * Gets the value of the roomTypeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomTypeName() {
                    return roomTypeName;
                }

                /**
                 * Sets the value of the roomTypeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomTypeName(String value) {
                    this.roomTypeName = value;
                }

                /**
                 * Gets the value of the roomTypeEnglishName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomTypeEnglishName() {
                    return roomTypeEnglishName;
                }

                /**
                 * Sets the value of the roomTypeEnglishName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomTypeEnglishName(String value) {
                    this.roomTypeEnglishName = value;
                }

                /**
                 * Gets the value of the maxRoomOccupancy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMaxRoomOccupancy() {
                    return maxRoomOccupancy;
                }

                /**
                 * Sets the value of the maxRoomOccupancy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMaxRoomOccupancy(String value) {
                    this.maxRoomOccupancy = value;
                }

                /**
                 * Gets the value of the rateInfos property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos }
                 *     
                 */
                public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos getRateInfos() {
                    return rateInfos;
                }

                /**
                 * Sets the value of the rateInfos property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos }
                 *     
                 */
                public void setRateInfos(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos value) {
                    this.rateInfos = value;
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
                 *         &lt;element name="RateInfo" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="RateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="RateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="RateEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Allotment" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="MaxChildren" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Board">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="BoardCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="TotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="TotalTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="CancelPolicyInfos">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="StartWindowHours">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;enumeration value="0"/>
                 *                                             &lt;enumeration value="48"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="NightCount">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;enumeration value="1"/>
                 *                                             &lt;enumeration value="0"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                 *                   &lt;element name="HotelFees">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
                 *                             &lt;element name="HotelFee">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/choice>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="RateComments">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="RateComment" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;enumeration value="drop the key at the gate"/>
                 *                                   &lt;enumeration value="dinner can not be served"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PaxPriceRooms">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PaxPriceRoom" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="RoomIndex">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;enumeration value="1"/>
                 *                                             &lt;enumeration value="2"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Children">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;enumeration value="2"/>
                 *                                             &lt;enumeration value="0"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="ChildrenAges" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="DailyInfos">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="Day">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                                 &lt;enumeration value="2016-12-24"/>
                 *                                                                 &lt;enumeration value="2016-12-25"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
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
                    "rateInfo"
                })
                public static class RateInfos {

                    @XmlElement(name = "RateInfo")
                    protected List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo> rateInfo;

                    /**
                     * Gets the value of the rateInfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRateInfo().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo }
                     * 
                     * 
                     */
                    public List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo> getRateInfo() {
                        if (rateInfo == null) {
                            rateInfo = new ArrayList<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo>();
                        }
                        return this.rateInfo;
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
                     *         &lt;element name="RateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="RateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="RateEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Allotment" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="MaxChildren" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Board">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="BoardCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="TotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="TotalTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="CancelPolicyInfos">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="StartWindowHours">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;enumeration value="0"/>
                     *                                   &lt;enumeration value="48"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="NightCount">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;enumeration value="1"/>
                     *                                   &lt;enumeration value="0"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                     *         &lt;element name="HotelFees">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
                     *                   &lt;element name="HotelFee">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/choice>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="RateComments">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="RateComment" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;enumeration value="drop the key at the gate"/>
                     *                         &lt;enumeration value="dinner can not be served"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PaxPriceRooms">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PaxPriceRoom" maxOccurs="unbounded" minOccurs="0">
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
                     *                             &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Children">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;enumeration value="2"/>
                     *                                   &lt;enumeration value="0"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="ChildrenAges" minOccurs="0">
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
                     *                             &lt;element name="DailyInfos">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="Day">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                       &lt;enumeration value="2016-12-24"/>
                     *                                                       &lt;enumeration value="2016-12-25"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
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
                        "rateKey",
                        "rateCode",
                        "rateName",
                        "rateEnglishName",
                        "allotment",
                        "maxOccupancy",
                        "maxChildren",
                        "refundable",
                        "board",
                        "paymentType",
                        "currencyCode",
                        "totalBasePrice",
                        "totalPrice",
                        "totalTaxAndFee",
                        "cancelPolicyInfos",
                        "hotelFees",
                        "rateComments",
                        "paxPriceRooms"
                    })
                    public static class RateInfo {

                        @XmlElement(name = "RateKey", required = true)
                        protected String rateKey;
                        @XmlElement(name = "RateCode", required = true)
                        protected String rateCode;
                        @XmlElement(name = "RateName", required = true)
                        protected String rateName;
                        @XmlElement(name = "RateEnglishName", required = true)
                        protected String rateEnglishName;
                        @XmlElement(name = "Allotment", required = true)
                        protected String allotment;
                        @XmlElement(name = "MaxOccupancy", required = true)
                        protected String maxOccupancy;
                        @XmlElement(name = "MaxChildren", required = true)
                        protected String maxChildren;
                        @XmlElement(name = "Refundable", required = true)
                        protected String refundable;
                        @XmlElement(name = "Board", required = true)
                        protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.Board board;
                        @XmlElement(name = "PaymentType", required = true)
                        protected String paymentType;
                        @XmlElement(name = "CurrencyCode", required = true)
                        protected String currencyCode;
                        @XmlElement(name = "TotalBasePrice", required = true)
                        protected String totalBasePrice;
                        @XmlElement(name = "TotalPrice", required = true)
                        protected String totalPrice;
                        @XmlElement(name = "TotalTaxAndFee", required = true)
                        protected String totalTaxAndFee;
                        @XmlElement(name = "CancelPolicyInfos", required = true)
                        protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos cancelPolicyInfos;
                        @XmlElement(name = "HotelFees", required = true)
                        protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees hotelFees;
                        @XmlElement(name = "RateComments", required = true)
                        protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.RateComments rateComments;
                        @XmlElement(name = "PaxPriceRooms", required = true)
                        protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms paxPriceRooms;

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
                         * Gets the value of the rateName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRateName() {
                            return rateName;
                        }

                        /**
                         * Sets the value of the rateName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRateName(String value) {
                            this.rateName = value;
                        }

                        /**
                         * Gets the value of the rateEnglishName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRateEnglishName() {
                            return rateEnglishName;
                        }

                        /**
                         * Sets the value of the rateEnglishName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRateEnglishName(String value) {
                            this.rateEnglishName = value;
                        }

                        /**
                         * Gets the value of the allotment property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAllotment() {
                            return allotment;
                        }

                        /**
                         * Sets the value of the allotment property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAllotment(String value) {
                            this.allotment = value;
                        }

                        /**
                         * Gets the value of the maxOccupancy property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMaxOccupancy() {
                            return maxOccupancy;
                        }

                        /**
                         * Sets the value of the maxOccupancy property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMaxOccupancy(String value) {
                            this.maxOccupancy = value;
                        }

                        /**
                         * Gets the value of the maxChildren property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMaxChildren() {
                            return maxChildren;
                        }

                        /**
                         * Sets the value of the maxChildren property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMaxChildren(String value) {
                            this.maxChildren = value;
                        }

                        /**
                         * Gets the value of the refundable property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRefundable() {
                            return refundable;
                        }

                        /**
                         * Sets the value of the refundable property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRefundable(String value) {
                            this.refundable = value;
                        }

                        /**
                         * Gets the value of the board property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.Board }
                         *     
                         */
                        public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.Board getBoard() {
                            return board;
                        }

                        /**
                         * Sets the value of the board property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.Board }
                         *     
                         */
                        public void setBoard(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.Board value) {
                            this.board = value;
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

                        /**
                         * Gets the value of the totalBasePrice property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTotalBasePrice() {
                            return totalBasePrice;
                        }

                        /**
                         * Sets the value of the totalBasePrice property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTotalBasePrice(String value) {
                            this.totalBasePrice = value;
                        }

                        /**
                         * Gets the value of the totalPrice property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTotalPrice() {
                            return totalPrice;
                        }

                        /**
                         * Sets the value of the totalPrice property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTotalPrice(String value) {
                            this.totalPrice = value;
                        }

                        /**
                         * Gets the value of the totalTaxAndFee property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTotalTaxAndFee() {
                            return totalTaxAndFee;
                        }

                        /**
                         * Sets the value of the totalTaxAndFee property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTotalTaxAndFee(String value) {
                            this.totalTaxAndFee = value;
                        }

                        /**
                         * Gets the value of the cancelPolicyInfos property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos }
                         *     
                         */
                        public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos getCancelPolicyInfos() {
                            return cancelPolicyInfos;
                        }

                        /**
                         * Sets the value of the cancelPolicyInfos property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos }
                         *     
                         */
                        public void setCancelPolicyInfos(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos value) {
                            this.cancelPolicyInfos = value;
                        }

                        /**
                         * Gets the value of the hotelFees property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees }
                         *     
                         */
                        public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees getHotelFees() {
                            return hotelFees;
                        }

                        /**
                         * Sets the value of the hotelFees property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees }
                         *     
                         */
                        public void setHotelFees(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees value) {
                            this.hotelFees = value;
                        }

                        /**
                         * Gets the value of the rateComments property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.RateComments }
                         *     
                         */
                        public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.RateComments getRateComments() {
                            return rateComments;
                        }

                        /**
                         * Sets the value of the rateComments property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.RateComments }
                         *     
                         */
                        public void setRateComments(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.RateComments value) {
                            this.rateComments = value;
                        }

                        /**
                         * Gets the value of the paxPriceRooms property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms }
                         *     
                         */
                        public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms getPaxPriceRooms() {
                            return paxPriceRooms;
                        }

                        /**
                         * Sets the value of the paxPriceRooms property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms }
                         *     
                         */
                        public void setPaxPriceRooms(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms value) {
                            this.paxPriceRooms = value;
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
                         *         &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="BoardCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "boardCode",
                            "boardCount"
                        })
                        public static class Board {

                            @XmlElement(name = "BoardCode", required = true)
                            protected String boardCode;
                            @XmlElement(name = "BoardCount", required = true)
                            protected String boardCount;

                            /**
                             * Gets the value of the boardCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getBoardCode() {
                                return boardCode;
                            }

                            /**
                             * Sets the value of the boardCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setBoardCode(String value) {
                                this.boardCode = value;
                            }

                            /**
                             * Gets the value of the boardCount property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getBoardCount() {
                                return boardCount;
                            }

                            /**
                             * Sets the value of the boardCount property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setBoardCount(String value) {
                                this.boardCount = value;
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
                         *         &lt;element name="CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="StartWindowHours">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;enumeration value="0"/>
                         *                         &lt;enumeration value="48"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="NightCount">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;enumeration value="1"/>
                         *                         &lt;enumeration value="0"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "cancelPolicyInfo"
                        })
                        public static class CancelPolicyInfos {

                            @XmlElement(name = "CancelPolicyInfo")
                            protected List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos.CancelPolicyInfo> cancelPolicyInfo;

                            /**
                             * Gets the value of the cancelPolicyInfo property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the cancelPolicyInfo property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getCancelPolicyInfo().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos.CancelPolicyInfo }
                             * 
                             * 
                             */
                            public List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos.CancelPolicyInfo> getCancelPolicyInfo() {
                                if (cancelPolicyInfo == null) {
                                    cancelPolicyInfo = new ArrayList<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.CancelPolicyInfos.CancelPolicyInfo>();
                                }
                                return this.cancelPolicyInfo;
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
                             *         &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="StartWindowHours">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;enumeration value="0"/>
                             *               &lt;enumeration value="48"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="NightCount">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;enumeration value="1"/>
                             *               &lt;enumeration value="0"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "cancelTime",
                                "startWindowHours",
                                "nightCount",
                                "timeZone",
                                "currencyCode"
                            })
                            public static class CancelPolicyInfo {

                                @XmlElement(name = "CancelTime", required = true)
                                protected String cancelTime;
                                @XmlElement(name = "StartWindowHours", required = true)
                                protected String startWindowHours;
                                @XmlElement(name = "NightCount", required = true)
                                protected String nightCount;
                                @XmlElement(name = "TimeZone", required = true)
                                protected String timeZone;
                                @XmlElement(name = "CurrencyCode", required = true)
                                protected String currencyCode;

                                /**
                                 * Gets the value of the cancelTime property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCancelTime() {
                                    return cancelTime;
                                }

                                /**
                                 * Sets the value of the cancelTime property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCancelTime(String value) {
                                    this.cancelTime = value;
                                }

                                /**
                                 * Gets the value of the startWindowHours property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getStartWindowHours() {
                                    return startWindowHours;
                                }

                                /**
                                 * Sets the value of the startWindowHours property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setStartWindowHours(String value) {
                                    this.startWindowHours = value;
                                }

                                /**
                                 * Gets the value of the nightCount property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getNightCount() {
                                    return nightCount;
                                }

                                /**
                                 * Sets the value of the nightCount property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setNightCount(String value) {
                                    this.nightCount = value;
                                }

                                /**
                                 * Gets the value of the timeZone property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getTimeZone() {
                                    return timeZone;
                                }

                                /**
                                 * Sets the value of the timeZone property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setTimeZone(String value) {
                                    this.timeZone = value;
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


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;choice maxOccurs="unbounded" minOccurs="0">
                         *         &lt;element name="HotelFee">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/choice>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "hotelFee"
                        })
                        public static class HotelFees {

                            @XmlElement(name = "HotelFee")
                            protected List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees.HotelFee> hotelFee;

                            /**
                             * Gets the value of the hotelFee property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the hotelFee property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getHotelFee().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees.HotelFee }
                             * 
                             * 
                             */
                            public List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees.HotelFee> getHotelFee() {
                                if (hotelFee == null) {
                                    hotelFee = new ArrayList<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.HotelFees.HotelFee>();
                                }
                                return this.hotelFee;
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
                             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "type",
                                "amount",
                                "currencyCode"
                            })
                            public static class HotelFee {

                                @XmlElement(name = "Type", required = true)
                                protected String type;
                                @XmlElement(name = "Amount", required = true)
                                protected String amount;
                                @XmlElement(name = "CurrencyCode", required = true)
                                protected String currencyCode;

                                /**
                                 * Gets the value of the type property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getType() {
                                    return type;
                                }

                                /**
                                 * Sets the value of the type property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setType(String value) {
                                    this.type = value;
                                }

                                /**
                                 * Gets the value of the amount property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getAmount() {
                                    return amount;
                                }

                                /**
                                 * Sets the value of the amount property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setAmount(String value) {
                                    this.amount = value;
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
                         *         &lt;element name="PaxPriceRoom" maxOccurs="unbounded" minOccurs="0">
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
                         *                   &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Children">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;enumeration value="2"/>
                         *                         &lt;enumeration value="0"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="ChildrenAges" minOccurs="0">
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
                         *                   &lt;element name="DailyInfos">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="Day">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                             &lt;enumeration value="2016-12-24"/>
                         *                                             &lt;enumeration value="2016-12-25"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "paxPriceRoom"
                        })
                        public static class PaxPriceRooms {

                            @XmlElement(name = "PaxPriceRoom")
                            protected List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom> paxPriceRoom;

                            /**
                             * Gets the value of the paxPriceRoom property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the paxPriceRoom property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getPaxPriceRoom().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom }
                             * 
                             * 
                             */
                            public List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom> getPaxPriceRoom() {
                                if (paxPriceRoom == null) {
                                    paxPriceRoom = new ArrayList<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom>();
                                }
                                return this.paxPriceRoom;
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
                             *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Children">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;enumeration value="2"/>
                             *               &lt;enumeration value="0"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="ChildrenAges" minOccurs="0">
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
                             *         &lt;element name="DailyInfos">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="Day">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                   &lt;enumeration value="2016-12-24"/>
                             *                                   &lt;enumeration value="2016-12-25"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "roomIndex",
                                "adults",
                                "children",
                                "childrenAges",
                                "dailyInfos"
                            })
                            public static class PaxPriceRoom {

                                @XmlElement(name = "RoomIndex", required = true)
                                protected String roomIndex;
                                @XmlElement(name = "Adults", required = true)
                                protected String adults;
                                @XmlElement(name = "Children", required = true)
                                protected String children;
                                @XmlElement(name = "ChildrenAges")
                                protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.ChildrenAges childrenAges;
                                @XmlElement(name = "DailyInfos", required = true)
                                protected AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos dailyInfos;

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
                                 *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.ChildrenAges }
                                 *     
                                 */
                                public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.ChildrenAges getChildrenAges() {
                                    return childrenAges;
                                }

                                /**
                                 * Sets the value of the childrenAges property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.ChildrenAges }
                                 *     
                                 */
                                public void setChildrenAges(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.ChildrenAges value) {
                                    this.childrenAges = value;
                                }

                                /**
                                 * Gets the value of the dailyInfos property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos }
                                 *     
                                 */
                                public AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos getDailyInfos() {
                                    return dailyInfos;
                                }

                                /**
                                 * Sets the value of the dailyInfos property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos }
                                 *     
                                 */
                                public void setDailyInfos(AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos value) {
                                    this.dailyInfos = value;
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
                                 *         &lt;element name="DailyInfo" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="Day">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                         &lt;enumeration value="2016-12-24"/>
                                 *                         &lt;enumeration value="2016-12-25"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                    "dailyInfo"
                                })
                                public static class DailyInfos {

                                    @XmlElement(name = "DailyInfo")
                                    protected List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos.DailyInfo> dailyInfo;

                                    /**
                                     * Gets the value of the dailyInfo property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the dailyInfo property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getDailyInfo().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos.DailyInfo }
                                     * 
                                     * 
                                     */
                                    public List<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos.DailyInfo> getDailyInfo() {
                                        if (dailyInfo == null) {
                                            dailyInfo = new ArrayList<AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos.DailyInfo>();
                                        }
                                        return this.dailyInfo;
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
                                     *         &lt;element name="Day">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *               &lt;enumeration value="2016-12-24"/>
                                     *               &lt;enumeration value="2016-12-25"/>
                                     *             &lt;/restriction>
                                     *           &lt;/simpleType>
                                     *         &lt;/element>
                                     *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="TaxAndFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                        "day",
                                        "price",
                                        "basePrice",
                                        "taxAndFee",
                                        "currencyCode"
                                    })
                                    public static class DailyInfo {

                                        @XmlElement(name = "Day", required = true)
                                        protected String day;
                                        @XmlElement(name = "Price", required = true)
                                        protected String price;
                                        @XmlElement(name = "BasePrice", required = true)
                                        protected String basePrice;
                                        @XmlElement(name = "TaxAndFee", required = true)
                                        protected String taxAndFee;
                                        @XmlElement(name = "CurrencyCode", required = true)
                                        protected String currencyCode;

                                        /**
                                         * Gets the value of the day property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getDay() {
                                            return day;
                                        }

                                        /**
                                         * Sets the value of the day property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setDay(String value) {
                                            this.day = value;
                                        }

                                        /**
                                         * Gets the value of the price property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getPrice() {
                                            return price;
                                        }

                                        /**
                                         * Sets the value of the price property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setPrice(String value) {
                                            this.price = value;
                                        }

                                        /**
                                         * Gets the value of the basePrice property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getBasePrice() {
                                            return basePrice;
                                        }

                                        /**
                                         * Sets the value of the basePrice property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setBasePrice(String value) {
                                            this.basePrice = value;
                                        }

                                        /**
                                         * Gets the value of the taxAndFee property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getTaxAndFee() {
                                            return taxAndFee;
                                        }

                                        /**
                                         * Sets the value of the taxAndFee property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setTaxAndFee(String value) {
                                            this.taxAndFee = value;
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
                         *         &lt;element name="RateComment" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;enumeration value="drop the key at the gate"/>
                         *               &lt;enumeration value="dinner can not be served"/>
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
                            "rateComment"
                        })
                        public static class RateComments {

                            @XmlElement(name = "RateComment")
                            protected List<String> rateComment;

                            /**
                             * Gets the value of the rateComment property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the rateComment property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getRateComment().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link String }
                             * 
                             * 
                             */
                            public List<String> getRateComment() {
                                if (rateComment == null) {
                                    rateComment = new ArrayList<String>();
                                }
                                return this.rateComment;
                            }

                        }

                    }

                }

            }

        }

    }

}
