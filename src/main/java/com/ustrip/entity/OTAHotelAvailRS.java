
package com.ustrip.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoomStays">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomTypes">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RoomType">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RoomDescription">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RatePlans">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RatePlan">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RatePlanDescription">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Text">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value="Rate is deducted of commission plus service and tax"/>
 *                                                                 &lt;enumeration value="Rate is non-refundable"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CancelPenalties">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="CancelPenalty">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PenaltyDescription">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Text">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
 *                                                                                     &lt;enumeration value="The rate is non-refundable"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="AmountPercent">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                             &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="Deadline">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                             &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MealsIncluded">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RoomRates">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RoomRate">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Rates">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Rate">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Base">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Taxes">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="Tax">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="TaxDescription">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;complexContent>
 *                                                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                           &lt;sequence>
 *                                                                                                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                           &lt;/sequence>
 *                                                                                                         &lt;/restriction>
 *                                                                                                       &lt;/complexContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                 &lt;/sequence>
 *                                                                                                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                                                 &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                                                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                             &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
 *                                                                             &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
 *                                                                             &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="Fees">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Fee">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="Description">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
 *                                                                                       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                                       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
 *                                                                   &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                                   &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
 *                                               &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GuestCounts">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GuestCount">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                               &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Total">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
 *                                     &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TPA_Extensions">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="HotelStays">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelStay">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BasicPropertyInfo">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                     &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
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
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "success",
    "roomStays",
    "hotelStays"
})
@XmlRootElement(name = "OTA_HotelAvailRS", namespace = "http://www.opentravel.org/OTA/2003/05")
public class OTAHotelAvailRS {

    @XmlElement(name = "Success", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected String success;
    @XmlElement(name = "RoomStays", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelAvailRS.RoomStays roomStays;
    @XmlElement(name = "HotelStays", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelAvailRS.HotelStays hotelStays;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected String timeStamp;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccess(String value) {
        this.success = value;
    }

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.RoomStays }
     *     
     */
    public OTAHotelAvailRS.RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.RoomStays }
     *     
     */
    public void setRoomStays(OTAHotelAvailRS.RoomStays value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the hotelStays property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.HotelStays }
     *     
     */
    public OTAHotelAvailRS.HotelStays getHotelStays() {
        return hotelStays;
    }

    /**
     * Sets the value of the hotelStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.HotelStays }
     *     
     */
    public void setHotelStays(OTAHotelAvailRS.HotelStays value) {
        this.hotelStays = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
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
     *         &lt;element name="HotelStay">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BasicPropertyInfo">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
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
        "hotelStay"
    })
    public static class HotelStays {

        @XmlElement(name = "HotelStay", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelAvailRS.HotelStays.HotelStay hotelStay;

        /**
         * Gets the value of the hotelStay property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRS.HotelStays.HotelStay }
         *     
         */
        public OTAHotelAvailRS.HotelStays.HotelStay getHotelStay() {
            return hotelStay;
        }

        /**
         * Sets the value of the hotelStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRS.HotelStays.HotelStay }
         *     
         */
        public void setHotelStay(OTAHotelAvailRS.HotelStays.HotelStay value) {
            this.hotelStay = value;
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
         *         &lt;element name="BasicPropertyInfo">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "basicPropertyInfo"
        })
        public static class HotelStay {

            @XmlElement(name = "BasicPropertyInfo", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo basicPropertyInfo;

            /**
             * Gets the value of the basicPropertyInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo }
             *     
             */
            public OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo getBasicPropertyInfo() {
                return basicPropertyInfo;
            }

            /**
             * Sets the value of the basicPropertyInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo }
             *     
             */
            public void setBasicPropertyInfo(OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo value) {
                this.basicPropertyInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class BasicPropertyInfo {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "HotelCode")
                protected Integer hotelCode;
                @XmlAttribute(name = "HotelName")
                protected String hotelName;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the hotelCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Short }
                 *     
                 */
                public Integer getHotelCode() {
                    return hotelCode;
                }

                /**
                 * Sets the value of the hotelCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setHotelCode(Integer value) {
                    this.hotelCode = value;
                }

                /**
                 * Gets the value of the hotelName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * Sets the value of the hotelName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
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
     *         &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomTypes">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RoomType">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RoomDescription">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RatePlans">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RatePlan">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RatePlanDescription">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Text">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;enumeration value="Rate is deducted of commission plus service and tax"/>
     *                                                       &lt;enumeration value="Rate is non-refundable"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="CancelPenalties">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="CancelPenalty">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PenaltyDescription">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Text">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
     *                                                                           &lt;enumeration value="The rate is non-refundable"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="AmountPercent">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                   &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="Deadline">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                   &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MealsIncluded">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RoomRates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RoomRate">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Rates">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Rate">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Base">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Taxes">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Tax">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="TaxDescription">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                                 &lt;/sequence>
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                                       &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                                       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
     *                                                                   &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
     *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="Fees">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Fee">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Description">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                             &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
     *                                                                             &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                             &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                             &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
     *                                                         &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                                         &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
     *                                     &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GuestCounts">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GuestCount">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                     &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Total">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
     *                           &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TPA_Extensions">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "roomStay"
    })
    public static class RoomStays {

        @XmlElement(name = "RoomStay", namespace = "http://www.opentravel.org/OTA/2003/05")
        protected List<OTAHotelAvailRS.RoomStays.RoomStay> roomStay;

        /**
         * Gets the value of the roomStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.RoomStays.RoomStay }
         * 
         * 
         */
        public List<OTAHotelAvailRS.RoomStays.RoomStay> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<OTAHotelAvailRS.RoomStays.RoomStay>();
            }
            return this.roomStay;
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
         *         &lt;element name="RoomTypes">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomType">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RoomDescription">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RatePlans">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RatePlan">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RatePlanDescription">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Text">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;enumeration value="Rate is deducted of commission plus service and tax"/>
         *                                             &lt;enumeration value="Rate is non-refundable"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="CancelPenalties">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="CancelPenalty">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PenaltyDescription">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Text">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
         *                                                                 &lt;enumeration value="The rate is non-refundable"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="AmountPercent">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                         &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="Deadline">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                         &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MealsIncluded">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RoomRates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomRate">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Rates">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Rate">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Base">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Taxes">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="Tax">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="TaxDescription">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;complexContent>
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                                       &lt;sequence>
         *                                                                                         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                                       &lt;/sequence>
         *                                                                                     &lt;/restriction>
         *                                                                                   &lt;/complexContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                             &lt;/sequence>
         *                                                                             &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                             &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                             &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                                             &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                                             &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
         *                                                         &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
         *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="Fees">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Fee">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="Description">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
         *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
         *                                               &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                               &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
         *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GuestCounts">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GuestCount">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Total">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
         *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TPA_Extensions">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "roomTypes",
            "ratePlans",
            "roomRates",
            "guestCounts",
            "total",
            "tpaExtensions"
        })
        public static class RoomStay {

            @XmlElement(name = "RoomTypes", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes roomTypes;
            @XmlElement(name = "RatePlans", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans ratePlans;
            @XmlElement(name = "RoomRates", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates roomRates;
            @XmlElement(name = "GuestCounts", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts guestCounts;
            @XmlElement(name = "Total", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRS.RoomStays.RoomStay.Total total;
            @XmlElement(name = "TPA_Extensions", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRS.RoomStays.RoomStay.TPAExtensions tpaExtensions;

            /**
             * Gets the value of the roomTypes property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes getRoomTypes() {
                return roomTypes;
            }

            /**
             * Sets the value of the roomTypes property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes }
             *     
             */
            public void setRoomTypes(OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes value) {
                this.roomTypes = value;
            }

            /**
             * Gets the value of the ratePlans property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans getRatePlans() {
                return ratePlans;
            }

            /**
             * Sets the value of the ratePlans property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans }
             *     
             */
            public void setRatePlans(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans value) {
                this.ratePlans = value;
            }

            /**
             * Gets the value of the roomRates property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates getRoomRates() {
                return roomRates;
            }

            /**
             * Sets the value of the roomRates property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates }
             *     
             */
            public void setRoomRates(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates value) {
                this.roomRates = value;
            }

            /**
             * Gets the value of the guestCounts property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts getGuestCounts() {
                return guestCounts;
            }

            /**
             * Sets the value of the guestCounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts }
             *     
             */
            public void setGuestCounts(OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts value) {
                this.guestCounts = value;
            }

            /**
             * Gets the value of the total property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.Total }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.Total getTotal() {
                return total;
            }

            /**
             * Sets the value of the total property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.Total }
             *     
             */
            public void setTotal(OTAHotelAvailRS.RoomStays.RoomStay.Total value) {
                this.total = value;
            }

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.TPAExtensions }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.TPAExtensions getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.TPAExtensions }
             *     
             */
            public void setTPAExtensions(OTAHotelAvailRS.RoomStays.RoomStay.TPAExtensions value) {
                this.tpaExtensions = value;
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
             *         &lt;element name="GuestCount">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "guestCount"
            })
            public static class GuestCounts {

                @XmlElement(name = "GuestCount", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts.GuestCount guestCount;

                /**
                 * Gets the value of the guestCount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts.GuestCount }
                 *     
                 */
                public OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts.GuestCount getGuestCount() {
                    return guestCount;
                }

                /**
                 * Sets the value of the guestCount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts.GuestCount }
                 *     
                 */
                public void setGuestCount(OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts.GuestCount value) {
                    this.guestCount = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class GuestCount {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "AgeQualifyingCode")
                    protected Integer ageQualifyingCode;
                    @XmlAttribute(name = "Count")
                    protected Integer count;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the ageQualifyingCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getAgeQualifyingCode() {
                        return ageQualifyingCode;
                    }

                    /**
                     * Sets the value of the ageQualifyingCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setAgeQualifyingCode(Integer value) {
                        this.ageQualifyingCode = value;
                    }

                    /**
                     * Gets the value of the count property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getCount() {
                        return count;
                    }

                    /**
                     * Sets the value of the count property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setCount(Integer value) {
                        this.count = value;
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
             *         &lt;element name="RatePlan">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RatePlanDescription">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Text">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;enumeration value="Rate is deducted of commission plus service and tax"/>
             *                                   &lt;enumeration value="Rate is non-refundable"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="CancelPenalties">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="CancelPenalty">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PenaltyDescription">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Text">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
             *                                                       &lt;enumeration value="The rate is non-refundable"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="AmountPercent">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                               &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="Deadline">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                               &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MealsIncluded">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "ratePlan"
            })
            public static class RatePlans {

                @XmlElement(name = "RatePlan", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan ratePlan;

                /**
                 * Gets the value of the ratePlan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan }
                 *     
                 */
                public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan getRatePlan() {
                    return ratePlan;
                }

                /**
                 * Sets the value of the ratePlan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan }
                 *     
                 */
                public void setRatePlan(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan value) {
                    this.ratePlan = value;
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
                 *         &lt;element name="RatePlanDescription">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Text">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;enumeration value="Rate is deducted of commission plus service and tax"/>
                 *                         &lt;enumeration value="Rate is non-refundable"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="CancelPenalties">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CancelPenalty">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PenaltyDescription">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Text">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
                 *                                             &lt;enumeration value="The rate is non-refundable"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="AmountPercent">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *                                     &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="Deadline">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *                                     &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MealsIncluded">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "ratePlanDescription",
                    "cancelPenalties",
                    "mealsIncluded"
                })
                public static class RatePlan {

                    @XmlElement(name = "RatePlanDescription", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription ratePlanDescription;
                    @XmlElement(name = "CancelPenalties", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties cancelPenalties;
                    @XmlElement(name = "MealsIncluded", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded mealsIncluded;
                    @XmlAttribute(name = "RatePlanCode")
                    protected String ratePlanCode;
                    @XmlAttribute(name = "PrepaidIndicator")
                    protected String prepaidIndicator;

                    /**
                     * Gets the value of the ratePlanDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription }
                     *     
                     */
                    public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription getRatePlanDescription() {
                        return ratePlanDescription;
                    }

                    /**
                     * Sets the value of the ratePlanDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription }
                     *     
                     */
                    public void setRatePlanDescription(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription value) {
                        this.ratePlanDescription = value;
                    }

                    /**
                     * Gets the value of the cancelPenalties property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties }
                     *     
                     */
                    public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties getCancelPenalties() {
                        return cancelPenalties;
                    }

                    /**
                     * Sets the value of the cancelPenalties property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties }
                     *     
                     */
                    public void setCancelPenalties(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties value) {
                        this.cancelPenalties = value;
                    }

                    /**
                     * Gets the value of the mealsIncluded property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded }
                     *     
                     */
                    public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded getMealsIncluded() {
                        return mealsIncluded;
                    }

                    /**
                     * Sets the value of the mealsIncluded property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded }
                     *     
                     */
                    public void setMealsIncluded(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded value) {
                        this.mealsIncluded = value;
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
                     * Gets the value of the prepaidIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrepaidIndicator() {
                        return prepaidIndicator;
                    }

                    /**
                     * Sets the value of the prepaidIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrepaidIndicator(String value) {
                        this.prepaidIndicator = value;
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
                     *         &lt;element name="CancelPenalty">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PenaltyDescription">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Text">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
                     *                                   &lt;enumeration value="The rate is non-refundable"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="AmountPercent">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                     *                           &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="Deadline">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                     *                           &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "cancelPenalty"
                    })
                    public static class CancelPenalties {

                        @XmlElement(name = "CancelPenalty", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty cancelPenalty;

                        /**
                         * Gets the value of the cancelPenalty property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty }
                         *     
                         */
                        public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty getCancelPenalty() {
                            return cancelPenalty;
                        }

                        /**
                         * Sets the value of the cancelPenalty property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty }
                         *     
                         */
                        public void setCancelPenalty(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty value) {
                            this.cancelPenalty = value;
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
                         *         &lt;element name="PenaltyDescription">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Text">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
                         *                         &lt;enumeration value="The rate is non-refundable"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="AmountPercent">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                         *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="Deadline">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                         *                 &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "penaltyDescription",
                            "amountPercent",
                            "deadline"
                        })
                        public static class CancelPenalty {

                            @XmlElement(name = "PenaltyDescription", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.PenaltyDescription penaltyDescription;
                            @XmlElement(name = "AmountPercent", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.AmountPercent amountPercent;
                            @XmlElement(name = "Deadline", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.Deadline deadline;
                            @XmlAttribute(name = "PolicyCode")
                            protected String policyCode;

                            /**
                             * Gets the value of the penaltyDescription property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.PenaltyDescription }
                             *     
                             */
                            public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.PenaltyDescription getPenaltyDescription() {
                                return penaltyDescription;
                            }

                            /**
                             * Sets the value of the penaltyDescription property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.PenaltyDescription }
                             *     
                             */
                            public void setPenaltyDescription(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.PenaltyDescription value) {
                                this.penaltyDescription = value;
                            }

                            /**
                             * Gets the value of the amountPercent property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.AmountPercent }
                             *     
                             */
                            public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.AmountPercent getAmountPercent() {
                                return amountPercent;
                            }

                            /**
                             * Sets the value of the amountPercent property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.AmountPercent }
                             *     
                             */
                            public void setAmountPercent(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.AmountPercent value) {
                                this.amountPercent = value;
                            }

                            /**
                             * Gets the value of the deadline property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.Deadline }
                             *     
                             */
                            public OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.Deadline getDeadline() {
                                return deadline;
                            }

                            /**
                             * Sets the value of the deadline property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.Deadline }
                             *     
                             */
                            public void setDeadline(OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.Deadline value) {
                                this.deadline = value;
                            }

                            /**
                             * Gets the value of the policyCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPolicyCode() {
                                return policyCode;
                            }

                            /**
                             * Sets the value of the policyCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPolicyCode(String value) {
                                this.policyCode = value;
                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                             *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class AmountPercent {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "NmbrOfNights")
                                protected Integer nmbrOfNights;
                                @XmlAttribute(name = "Percent")
                                protected Integer percent;                                 
                                @XmlAttribute(name = "TaxInclusive")
                                protected String taxInclusive;

                                public Integer getPercent() {
									return percent;
								}

								public void setPercent(Integer percent) {
									this.percent = percent;
								}

								/**
                                 * Gets the value of the value property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * Sets the value of the value property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * Gets the value of the nmbrOfNights property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Integer }
                                 *     
                                 */
                                public Integer getNmbrOfNights() {
                                    return nmbrOfNights;
                                }

                                /**
                                 * Sets the value of the nmbrOfNights property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Integer }
                                 *     
                                 */
                                public void setNmbrOfNights(Integer value) {
                                    this.nmbrOfNights = value;
                                }

                                /**
                                 * Gets the value of the taxInclusive property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getTaxInclusive() {
                                    return taxInclusive;
                                }

                                /**
                                 * Sets the value of the taxInclusive property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setTaxInclusive(String value) {
                                    this.taxInclusive = value;
                                }

                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                             *       &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class Deadline {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "OffsetTimeUnit")
                                protected String offsetTimeUnit;
                                @XmlAttribute(name = "OffsetUnitMultiplier")
                                protected Integer offsetUnitMultiplier;
                                @XmlAttribute(name = "OffsetDropTime")
                                protected String offsetDropTime;
                                @XmlAttribute(name = "AbsoluteDeadline")
                                @XmlSchemaType(name = "dateTime")
                                protected String absoluteDeadline;

                                /**
                                 * Gets the value of the value property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * Sets the value of the value property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * Gets the value of the offsetTimeUnit property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getOffsetTimeUnit() {
                                    return offsetTimeUnit;
                                }

                                /**
                                 * Sets the value of the offsetTimeUnit property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setOffsetTimeUnit(String value) {
                                    this.offsetTimeUnit = value;
                                }

                                /**
                                 * Gets the value of the offsetUnitMultiplier property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Integer }
                                 *     
                                 */
                                public Integer getOffsetUnitMultiplier() {
                                    return offsetUnitMultiplier;
                                }

                                /**
                                 * Sets the value of the offsetUnitMultiplier property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Integer }
                                 *     
                                 */
                                public void setOffsetUnitMultiplier(Integer value) {
                                    this.offsetUnitMultiplier = value;
                                }

                                /**
                                 * Gets the value of the offsetDropTime property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getOffsetDropTime() {
                                    return offsetDropTime;
                                }

                                /**
                                 * Sets the value of the offsetDropTime property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setOffsetDropTime(String value) {
                                    this.offsetDropTime = value;
                                }

                                /**
                                 * Gets the value of the absoluteDeadline property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getAbsoluteDeadline() {
                                    return absoluteDeadline;
                                }

                                /**
                                 * Sets the value of the absoluteDeadline property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setAbsoluteDeadline(String value) {
                                    this.absoluteDeadline = value;
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
                             *         &lt;element name="Text">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;enumeration value="Cancellations received less than 48 hours prior to arrival date are subject to 1 night room charge and taxes. "/>
                             *               &lt;enumeration value="The rate is non-refundable"/>
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
                                "text"
                            })
                            public static class PenaltyDescription {

                                @XmlElement(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                protected String text;

                                /**
                                 * Gets the value of the text property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getText() {
                                    return text;
                                }

                                /**
                                 * Sets the value of the text property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setText(String value) {
                                    this.text = value;
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
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class MealsIncluded {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "Breakfast")
                        protected String breakfast;
                        @XmlAttribute(name = "Lunch")
                        protected String lunch;
                        @XmlAttribute(name = "Dinner")
                        protected String dinner;
                        @XmlAttribute(name = "NumberOfMeal")
                        protected Integer numberOfMeal;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the breakfast property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBreakfast() {
                            return breakfast;
                        }

                        /**
                         * Sets the value of the breakfast property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBreakfast(String value) {
                            this.breakfast = value;
                        }

                        /**
                         * Gets the value of the lunch property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLunch() {
                            return lunch;
                        }

                        /**
                         * Sets the value of the lunch property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLunch(String value) {
                            this.lunch = value;
                        }

                        /**
                         * Gets the value of the dinner property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDinner() {
                            return dinner;
                        }

                        /**
                         * Sets the value of the dinner property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDinner(String value) {
                            this.dinner = value;
                        }

                        /**
                         * Gets the value of the numberOfMeal property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getNumberOfMeal() {
                            return numberOfMeal;
                        }

                        /**
                         * Sets the value of the numberOfMeal property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setNumberOfMeal(Integer value) {
                            this.numberOfMeal = value;
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
                     *         &lt;element name="Text">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;enumeration value="Rate is deducted of commission plus service and tax"/>
                     *               &lt;enumeration value="Rate is non-refundable"/>
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
                        "text"
                    })
                    public static class RatePlanDescription {

                        @XmlElement(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected String text;

                        /**
                         * Gets the value of the text property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getText() {
                            return text;
                        }

                        /**
                         * Sets the value of the text property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setText(String value) {
                            this.text = value;
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
             *         &lt;element name="RoomRate">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Rates">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Rate">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Base">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Taxes">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="Tax">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="TaxDescription">
             *                                                                       &lt;complexType>
             *                                                                         &lt;complexContent>
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                             &lt;sequence>
             *                                                                               &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                             &lt;/sequence>
             *                                                                           &lt;/restriction>
             *                                                                         &lt;/complexContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                   &lt;/sequence>
             *                                                                   &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                   &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                                                   &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                                                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
             *                                               &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
             *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="Fees">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Fee">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="Description">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
             *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
             *                                     &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                                     &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
             *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                "roomRate"
            })
            public static class RoomRates {

                @XmlElement(name = "RoomRate", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate roomRate;

                /**
                 * Gets the value of the roomRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate }
                 *     
                 */
                public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate getRoomRate() {
                    return roomRate;
                }

                /**
                 * Sets the value of the roomRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate }
                 *     
                 */
                public void setRoomRate(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate value) {
                    this.roomRate = value;
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
                 *         &lt;element name="Rates">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Rate">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Base">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Taxes">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="Tax">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="TaxDescription">
                 *                                                             &lt;complexType>
                 *                                                               &lt;complexContent>
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                                   &lt;sequence>
                 *                                                                     &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                                   &lt;/sequence>
                 *                                                                 &lt;/restriction>
                 *                                                               &lt;/complexContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                         &lt;/sequence>
                 *                                                         &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                         &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *                                                         &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                 *                                     &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="Fees">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Fee">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="Description">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
                 *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
                 *                           &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                           &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
                 *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "rates"
                })
                public static class RoomRate {

                    @XmlElement(name = "Rates", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates rates;
                    @XmlAttribute(name = "RoomTypeCode")
                    protected String roomTypeCode;
                    @XmlAttribute(name = "RatePlanCode")
                    protected String ratePlanCode;
                    @XmlAttribute(name = "RatePlanCategory")
                    protected Integer ratePlanCategory;

                    /**
                     * Gets the value of the rates property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates }
                     *     
                     */
                    public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates getRates() {
                        return rates;
                    }

                    /**
                     * Sets the value of the rates property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates }
                     *     
                     */
                    public void setRates(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates value) {
                        this.rates = value;
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
                     * Gets the value of the ratePlanCategory property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Integer getRatePlanCategory() {
                        return ratePlanCategory;
                    }

                    /**
                     * Sets the value of the ratePlanCategory property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setRatePlanCategory(Integer value) {
                        this.ratePlanCategory = value;
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
                     *         &lt;element name="Rate">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Base">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Taxes">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="Tax">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="TaxDescription">
                     *                                                   &lt;complexType>
                     *                                                     &lt;complexContent>
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                                         &lt;sequence>
                     *                                                           &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                         &lt;/sequence>
                     *                                                       &lt;/restriction>
                     *                                                     &lt;/complexContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                               &lt;/sequence>
                     *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                               &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                     *                                               &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                     &lt;/sequence>
                     *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                     *                           &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="Fees">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Fee">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="Description">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                     &lt;/sequence>
                     *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
                     *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
                     *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
                        "rate"
                    })
                    public static class Rates {

                        @XmlElement(name = "Rate", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate rate;

                        /**
                         * Gets the value of the rate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate }
                         *     
                         */
                        public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate getRate() {
                            return rate;
                        }

                        /**
                         * Sets the value of the rate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate }
                         *     
                         */
                        public void setRate(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate value) {
                            this.rate = value;
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
                         *         &lt;element name="Base">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Taxes">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="Tax">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="TaxDescription">
                         *                                         &lt;complexType>
                         *                                           &lt;complexContent>
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                               &lt;sequence>
                         *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                               &lt;/sequence>
                         *                                             &lt;/restriction>
                         *                                           &lt;/complexContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                     &lt;/sequence>
                         *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                     &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                         *                                     &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                           &lt;/sequence>
                         *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                         *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="Fees">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Fee">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="Description">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                     &lt;/sequence>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                           &lt;/sequence>
                         *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
                         *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
                         *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
                         *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "base",
                            "fees"
                        })
                        public static class Rate {

                            @XmlElement(name = "Base", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base base;
                            @XmlElement(name = "Fees", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees fees;
                            @XmlAttribute(name = "EffectiveDate")
                            @XmlSchemaType(name = "date")
                            protected String effectiveDate;
                            @XmlAttribute(name = "ExpireDate")
                            @XmlSchemaType(name = "date")
                            protected String expireDate;

                            /**
                             * Gets the value of the base property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base }
                             *     
                             */
                            public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base getBase() {
                                return base;
                            }

                            /**
                             * Sets the value of the base property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base }
                             *     
                             */
                            public void setBase(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base value) {
                                this.base = value;
                            }

                            /**
                             * Gets the value of the fees property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees }
                             *     
                             */
                            public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees getFees() {
                                return fees;
                            }

                            /**
                             * Sets the value of the fees property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees }
                             *     
                             */
                            public void setFees(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees value) {
                                this.fees = value;
                            }

                            /**
                             * Gets the value of the effectiveDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getEffectiveDate() {
                                return effectiveDate;
                            }

                            /**
                             * Sets the value of the effectiveDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setEffectiveDate(String value) {
                                this.effectiveDate = value;
                            }

                            /**
                             * Gets the value of the expireDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getExpireDate() {
                                return expireDate;
                            }

                            /**
                             * Sets the value of the expireDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setExpireDate(String value) {
                                this.expireDate = value;
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
                             *         &lt;element name="Taxes">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="Tax">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="TaxDescription">
                             *                               &lt;complexType>
                             *                                 &lt;complexContent>
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                                     &lt;sequence>
                             *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                                     &lt;/sequence>
                             *                                   &lt;/restriction>
                             *                                 &lt;/complexContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                           &lt;/sequence>
                             *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                             *                           &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                 &lt;/sequence>
                             *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                             *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
                             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "taxes"
                            })
                            public static class Base {

                                @XmlElement(name = "Taxes", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes taxes;
                                @XmlAttribute(name = "AmountBeforeTax")
                                protected Double amountBeforeTax;
                                @XmlAttribute(name = "AmountAfterTax")
                                protected Double amountAfterTax;
                                @XmlAttribute(name = "CurrencyCode")
                                protected String currencyCode;

                                /**
                                 * Gets the value of the taxes property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes }
                                 *     
                                 */
                                public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes getTaxes() {
                                    return taxes;
                                }

                                /**
                                 * Sets the value of the taxes property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes }
                                 *     
                                 */
                                public void setTaxes(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes value) {
                                    this.taxes = value;
                                }

                                /**
                                 * Gets the value of the amountBeforeTax property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Double }
                                 *     
                                 */
                                public Double getAmountBeforeTax() {
                                    return amountBeforeTax;
                                }

                                /**
                                 * Sets the value of the amountBeforeTax property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Double }
                                 *     
                                 */
                                public void setAmountBeforeTax(Double value) {
                                    this.amountBeforeTax = value;
                                }

                                /**
                                 * Gets the value of the amountAfterTax property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Double }
                                 *     
                                 */
                                public Double getAmountAfterTax() {
                                    return amountAfterTax;
                                }

                                /**
                                 * Sets the value of the amountAfterTax property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Double }
                                 *     
                                 */
                                public void setAmountAfterTax(Double value) {
                                    this.amountAfterTax = value;
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
                                 * <p>Java class for anonymous complex type.
                                 * 
                                 * <p>The following schema fragment specifies the expected content contained within this class.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="Tax">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="TaxDescription">
                                 *                     &lt;complexType>
                                 *                       &lt;complexContent>
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                           &lt;sequence>
                                 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                           &lt;/sequence>
                                 *                         &lt;/restriction>
                                 *                       &lt;/complexContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                 &lt;/sequence>
                                 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                 *                 &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *       &lt;/sequence>
                                 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "tax"
                                })
                                public static class Taxes {

                                    @XmlElement(name = "Tax", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                    protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax tax;
                                    @XmlAttribute(name = "CurrencyCode")
                                    protected String currencyCode;

                                    /**
                                     * Gets the value of the tax property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax }
                                     *     
                                     */
                                    public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax getTax() {
                                        return tax;
                                    }

                                    /**
                                     * Sets the value of the tax property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax }
                                     *     
                                     */
                                    public void setTax(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax value) {
                                        this.tax = value;
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
                                     * <p>Java class for anonymous complex type.
                                     * 
                                     * <p>The following schema fragment specifies the expected content contained within this class.
                                     * 
                                     * <pre>
                                     * &lt;complexType>
                                     *   &lt;complexContent>
                                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *       &lt;sequence>
                                     *         &lt;element name="TaxDescription">
                                     *           &lt;complexType>
                                     *             &lt;complexContent>
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *                 &lt;sequence>
                                     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *                 &lt;/sequence>
                                     *               &lt;/restriction>
                                     *             &lt;/complexContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *       &lt;/sequence>
                                     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                     *       &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                     *     &lt;/restriction>
                                     *   &lt;/complexContent>
                                     * &lt;/complexType>
                                     * </pre>
                                     * 
                                     * 
                                     */
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "taxDescription"
                                    })
                                    public static class Tax {

                                        @XmlElement(name = "TaxDescription", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                        protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax.TaxDescription taxDescription;
                                        @XmlAttribute(name = "Type")
                                        protected String type;
                                        @XmlAttribute(name = "CurrencyCode")
                                        protected String currencyCode;
                                        @XmlAttribute(name = "Percent")
                                        protected Integer percent;
                                        @XmlAttribute(name = "ChargeUnit")
                                        protected Integer chargeUnit;
                                        @XmlAttribute(name = "Code")
                                        protected Integer code;

                                        /**
                                         * Gets the value of the taxDescription property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax.TaxDescription }
                                         *     
                                         */
                                        public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax.TaxDescription getTaxDescription() {
                                            return taxDescription;
                                        }

                                        /**
                                         * Sets the value of the taxDescription property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax.TaxDescription }
                                         *     
                                         */
                                        public void setTaxDescription(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax.TaxDescription value) {
                                            this.taxDescription = value;
                                        }

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
                                         * Gets the value of the percent property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Integer }
                                         *     
                                         */
                                        public Integer getPercent() {
                                            return percent;
                                        }

                                        /**
                                         * Sets the value of the percent property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Integer }
                                         *     
                                         */
                                        public void setPercent(Integer value) {
                                            this.percent = value;
                                        }

                                        /**
                                         * Gets the value of the chargeUnit property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Integer }
                                         *     
                                         */
                                        public Integer getChargeUnit() {
                                            return chargeUnit;
                                        }

                                        /**
                                         * Sets the value of the chargeUnit property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Integer }
                                         *     
                                         */
                                        public void setChargeUnit(Integer value) {
                                            this.chargeUnit = value;
                                        }

                                        /**
                                         * Gets the value of the code property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Integer }
                                         *     
                                         */
                                        public Integer getCode() {
                                            return code;
                                        }

                                        /**
                                         * Sets the value of the code property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Integer }
                                         *     
                                         */
                                        public void setCode(Integer value) {
                                            this.code = value;
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
                                         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                            "text"
                                        })
                                        public static class TaxDescription {

                                            @XmlElement(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                            protected String text;

                                            /**
                                             * Gets the value of the text property.
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getText() {
                                                return text;
                                            }

                                            /**
                                             * Sets the value of the text property.
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setText(String value) {
                                                this.text = value;
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
                             *         &lt;element name="Fee">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="Description">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                           &lt;/sequence>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                 &lt;/sequence>
                             *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
                             *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
                                "fee"
                            })
                            public static class Fees {

                                @XmlElement(name = "Fee", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee fee;

                                /**
                                 * Gets the value of the fee property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee }
                                 *     
                                 */
                                public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee getFee() {
                                    return fee;
                                }

                                /**
                                 * Sets the value of the fee property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee }
                                 *     
                                 */
                                public void setFee(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee value) {
                                    this.fee = value;
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
                                 *         &lt;element name="Description">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                 &lt;/sequence>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *       &lt;/sequence>
                                 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}Double" />
                                 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *       &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "description"
                                })
                                public static class Fee {

                                    @XmlElement(name = "Description", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                    protected OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee.Description description;
                                    @XmlAttribute(name = "Type")
                                    protected String type;
                                    @XmlAttribute(name = "Amount")
                                    protected Double amount;
                                    @XmlAttribute(name = "CurrencyCode")
                                    protected String currencyCode;
                                    @XmlAttribute(name = "ChargeUnit")
                                    protected Integer chargeUnit;
                                    @XmlAttribute(name = "Code")
                                    protected Integer code;

                                    /**
                                     * Gets the value of the description property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee.Description }
                                     *     
                                     */
                                    public OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee.Description getDescription() {
                                        return description;
                                    }

                                    /**
                                     * Sets the value of the description property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee.Description }
                                     *     
                                     */
                                    public void setDescription(OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Fees.Fee.Description value) {
                                        this.description = value;
                                    }

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
                                     *     {@link Double }
                                     *     
                                     */
                                    public Double getAmount() {
                                        return amount;
                                    }

                                    /**
                                     * Sets the value of the amount property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Double }
                                     *     
                                     */
                                    public void setAmount(Double value) {
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

                                    /**
                                     * Gets the value of the chargeUnit property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link Integer }
                                     *     
                                     */
                                    public Integer getChargeUnit() {
                                        return chargeUnit;
                                    }

                                    /**
                                     * Sets the value of the chargeUnit property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Integer }
                                     *     
                                     */
                                    public void setChargeUnit(Integer value) {
                                        this.chargeUnit = value;
                                    }

                                    /**
                                     * Gets the value of the code property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link Integer }
                                     *     
                                     */
                                    public Integer getCode() {
                                        return code;
                                    }

                                    /**
                                     * Sets the value of the code property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Integer }
                                     *     
                                     */
                                    public void setCode(Integer value) {
                                        this.code = value;
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
                                     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                        "text"
                                    })
                                    public static class Description {

                                        @XmlElement(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                        protected String text;

                                        /**
                                         * Gets the value of the text property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getText() {
                                            return text;
                                        }

                                        /**
                                         * Sets the value of the text property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setText(String value) {
                                            this.text = value;
                                        }

                                    }

                                }

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
             *         &lt;element name="RoomType">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RoomDescription">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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

                @XmlElement(name = "RoomType", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType roomType;

                /**
                 * Gets the value of the roomType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType }
                 *     
                 */
                public OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType getRoomType() {
                    return roomType;
                }

                /**
                 * Sets the value of the roomType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType }
                 *     
                 */
                public void setRoomType(OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType value) {
                    this.roomType = value;
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
                 *         &lt;element name="RoomDescription">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "roomDescription"
                })
                public static class RoomType {

                    @XmlElement(name = "RoomDescription", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType.RoomDescription roomDescription;
                    @XmlAttribute(name = "RoomTypeCode")
                    protected String roomTypeCode;
                    @XmlAttribute(name = "NumberOfUnits")
                    protected Integer numberOfUnits;

                    /**
                     * Gets the value of the roomDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType.RoomDescription }
                     *     
                     */
                    public OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType.RoomDescription getRoomDescription() {
                        return roomDescription;
                    }

                    /**
                     * Sets the value of the roomDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType.RoomDescription }
                     *     
                     */
                    public void setRoomDescription(OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType.RoomDescription value) {
                        this.roomDescription = value;
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
                     * Gets the value of the numberOfUnits property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getNumberOfUnits() {
                        return numberOfUnits;
                    }

                    /**
                     * Sets the value of the numberOfUnits property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setNumberOfUnits(Integer value) {
                        this.numberOfUnits = value;
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
                     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "text"
                    })
                    public static class RoomDescription {

                        @XmlElement(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected String text;

                        /**
                         * Gets the value of the text property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getText() {
                            return text;
                        }

                        /**
                         * Sets the value of the text property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setText(String value) {
                            this.text = value;
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
             *         &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "isReserved"
            })
            public static class TPAExtensions {

                @XmlElement(name = "IsReserved", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected String isReserved;

                /**
                 * Gets the value of the isReserved property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsReserved() {
                    return isReserved;
                }

                /**
                 * Sets the value of the isReserved property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsReserved(String value) {
                    this.isReserved = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
             *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}Double" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Total {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "AmountBeforeTax")
                protected Double amountBeforeTax;
                @XmlAttribute(name = "AmountAfterTax")
                protected Double amountAfterTax;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the amountBeforeTax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getAmountBeforeTax() {
                    return amountBeforeTax;
                }

                /**
                 * Sets the value of the amountBeforeTax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setAmountBeforeTax(Double value) {
                    this.amountBeforeTax = value;
                }

                /**
                 * Gets the value of the amountAfterTax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getAmountAfterTax() {
                    return amountAfterTax;
                }

                /**
                 * Sets the value of the amountAfterTax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setAmountAfterTax(Double value) {
                    this.amountAfterTax = value;
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
