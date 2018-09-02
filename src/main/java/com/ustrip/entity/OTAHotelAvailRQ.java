
package com.ustrip.entity;

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
 *         &lt;element name="POS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Source">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RequestorID">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CompanyName">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
 *         &lt;element name="AvailRequestSegments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailRequestSegment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HotelSearchCriteria">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Criterion">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="HotelRef">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="StayDateRange">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                         &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RatePlanCandidates">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RatePlanCandidate">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RoomStayCandidates">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RoomStayCandidate">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="GuestCounts">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="GuestCount">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                                       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "availRequestSegments"
})
@XmlRootElement(name = "OTA_HotelAvailRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
public class OTAHotelAvailRQ {

    @XmlElement(name = "POS", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelAvailRQ.POS pos;
    @XmlElement(name = "AvailRequestSegments", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelAvailRQ.AvailRequestSegments availRequestSegments;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected String timeStamp;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQ.POS }
     *     
     */
    public OTAHotelAvailRQ.POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQ.POS }
     *     
     */
    public void setPOS(OTAHotelAvailRQ.POS value) {
        this.pos = value;
    }

    /**
     * Gets the value of the availRequestSegments property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQ.AvailRequestSegments }
     *     
     */
    public OTAHotelAvailRQ.AvailRequestSegments getAvailRequestSegments() {
        return availRequestSegments;
    }

    /**
     * Sets the value of the availRequestSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQ.AvailRequestSegments }
     *     
     */
    public void setAvailRequestSegments(OTAHotelAvailRQ.AvailRequestSegments value) {
        this.availRequestSegments = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AvailRequestSegment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HotelSearchCriteria">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Criterion">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="HotelRef">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="StayDateRange">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                               &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RatePlanCandidates">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RatePlanCandidate">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RoomStayCandidates">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RoomStayCandidate">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="GuestCounts">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="GuestCount">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                             &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                             &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
        "availRequestSegment"
    })
    public static class AvailRequestSegments {

        @XmlElement(name = "AvailRequestSegment", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment availRequestSegment;

        /**
         * Gets the value of the availRequestSegment property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment getAvailRequestSegment() {
            return availRequestSegment;
        }

        /**
         * Sets the value of the availRequestSegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment }
         *     
         */
        public void setAvailRequestSegment(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment value) {
            this.availRequestSegment = value;
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
         *         &lt;element name="HotelSearchCriteria">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Criterion">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="HotelRef">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="StayDateRange">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RatePlanCandidates">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="RatePlanCandidate">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RoomStayCandidates">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="RoomStayCandidate">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="GuestCounts">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="GuestCount">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                   &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                                   &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
            "hotelSearchCriteria"
        })
        public static class AvailRequestSegment {

            @XmlElement(name = "HotelSearchCriteria", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria;

            /**
             * Gets the value of the hotelSearchCriteria property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria }
             *     
             */
            public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
                return hotelSearchCriteria;
            }

            /**
             * Sets the value of the hotelSearchCriteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria }
             *     
             */
            public void setHotelSearchCriteria(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria value) {
                this.hotelSearchCriteria = value;
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
             *         &lt;element name="Criterion">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="HotelRef">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="StayDateRange">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RatePlanCandidates">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="RatePlanCandidate">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RoomStayCandidates">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="RoomStayCandidate">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="GuestCounts">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="GuestCount">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                         &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                                         &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
                "criterion"
            })
            public static class HotelSearchCriteria {

                @XmlElement(name = "Criterion", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion criterion;

                /**
                 * Gets the value of the criterion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion }
                 *     
                 */
                public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion getCriterion() {
                    return criterion;
                }

                /**
                 * Sets the value of the criterion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion }
                 *     
                 */
                public void setCriterion(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion value) {
                    this.criterion = value;
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
                 *         &lt;element name="HotelRef">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="StayDateRange">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RatePlanCandidates">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="RatePlanCandidate">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RoomStayCandidates">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="RoomStayCandidate">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
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
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
                    "hotelRef",
                    "stayDateRange",
                    "ratePlanCandidates",
                    "roomStayCandidates"
                })
                public static class Criterion {

                    @XmlElement(name = "HotelRef", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef hotelRef;
                    @XmlElement(name = "StayDateRange", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.StayDateRange stayDateRange;
                    @XmlElement(name = "RatePlanCandidates", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates ratePlanCandidates;
                    @XmlElement(name = "RoomStayCandidates", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates roomStayCandidates;

                    /**
                     * Gets the value of the hotelRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef }
                     *     
                     */
                    public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef getHotelRef() {
                        return hotelRef;
                    }

                    /**
                     * Sets the value of the hotelRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef }
                     *     
                     */
                    public void setHotelRef(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef value) {
                        this.hotelRef = value;
                    }

                    /**
                     * Gets the value of the stayDateRange property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.StayDateRange }
                     *     
                     */
                    public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.StayDateRange getStayDateRange() {
                        return stayDateRange;
                    }

                    /**
                     * Sets the value of the stayDateRange property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.StayDateRange }
                     *     
                     */
                    public void setStayDateRange(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.StayDateRange value) {
                        this.stayDateRange = value;
                    }

                    /**
                     * Gets the value of the ratePlanCandidates property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates }
                     *     
                     */
                    public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates getRatePlanCandidates() {
                        return ratePlanCandidates;
                    }

                    /**
                     * Sets the value of the ratePlanCandidates property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates }
                     *     
                     */
                    public void setRatePlanCandidates(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates value) {
                        this.ratePlanCandidates = value;
                    }

                    /**
                     * Gets the value of the roomStayCandidates property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates }
                     *     
                     */
                    public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates getRoomStayCandidates() {
                        return roomStayCandidates;
                    }

                    /**
                     * Sets the value of the roomStayCandidates property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates }
                     *     
                     */
                    public void setRoomStayCandidates(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates value) {
                        this.roomStayCandidates = value;
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
                    public static class HotelRef {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "HotelCode")
                        protected Integer hotelCode;

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
                     *         &lt;element name="RatePlanCandidate">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "ratePlanCandidate"
                    })
                    public static class RatePlanCandidates {

                        @XmlElement(name = "RatePlanCandidate", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates.RatePlanCandidate ratePlanCandidate;

                        /**
                         * Gets the value of the ratePlanCandidate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates.RatePlanCandidate }
                         *     
                         */
                        public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates.RatePlanCandidate getRatePlanCandidate() {
                            return ratePlanCandidate;
                        }

                        /**
                         * Sets the value of the ratePlanCandidate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates.RatePlanCandidate }
                         *     
                         */
                        public void setRatePlanCandidate(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RatePlanCandidates.RatePlanCandidate value) {
                            this.ratePlanCandidate = value;
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
                         *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        public static class RatePlanCandidate {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "RatePlanCode")
                            protected String ratePlanCode;

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
                     *         &lt;element name="RoomStayCandidate">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
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
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
                        "roomStayCandidate"
                    })
                    public static class RoomStayCandidates {

                        @XmlElement(name = "RoomStayCandidate", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate roomStayCandidate;

                        /**
                         * Gets the value of the roomStayCandidate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate }
                         *     
                         */
                        public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate getRoomStayCandidate() {
                            return roomStayCandidate;
                        }

                        /**
                         * Sets the value of the roomStayCandidate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate }
                         *     
                         */
                        public void setRoomStayCandidate(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate value) {
                            this.roomStayCandidate = value;
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
                         *       &lt;/sequence>
                         *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}Integer" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "guestCounts"
                        })
                        public static class RoomStayCandidate {

                            @XmlElement(name = "GuestCounts", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts guestCounts;
                            @XmlAttribute(name = "RoomTypeCode")
                            protected String roomTypeCode;
                            @XmlAttribute(name = "Quantity")
                            protected Integer quantity;

                            /**
                             * Gets the value of the guestCounts property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts }
                             *     
                             */
                            public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts getGuestCounts() {
                                return guestCounts;
                            }

                            /**
                             * Sets the value of the guestCounts property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts }
                             *     
                             */
                            public void setGuestCounts(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts value) {
                                this.guestCounts = value;
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
                             * Gets the value of the quantity property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Integer }
                             *     
                             */
                            public Integer getQuantity() {
                                return quantity;
                            }

                            /**
                             * Sets the value of the quantity property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Integer }
                             *     
                             */
                            public void setQuantity(Integer value) {
                                this.quantity = value;
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
                                protected OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts.GuestCount guestCount;

                                /**
                                 * Gets the value of the guestCount property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts.GuestCount }
                                 *     
                                 */
                                public OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts.GuestCount getGuestCount() {
                                    return guestCount;
                                }

                                /**
                                 * Sets the value of the guestCount property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts.GuestCount }
                                 *     
                                 */
                                public void setGuestCount(OTAHotelAvailRQ.AvailRequestSegments.AvailRequestSegment.HotelSearchCriteria.Criterion.RoomStayCandidates.RoomStayCandidate.GuestCounts.GuestCount value) {
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
                     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
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
                    public static class StayDateRange {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "End")
                        @XmlSchemaType(name = "date")
                        protected String end;
                        @XmlAttribute(name = "Start")
                        @XmlSchemaType(name = "date")
                        protected String start;

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
                         * Gets the value of the end property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEnd() {
                            return end;
                        }

                        /**
                         * Sets the value of the end property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEnd(String value) {
                            this.end = value;
                        }

                        /**
                         * Gets the value of the start property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStart() {
                            return start;
                        }

                        /**
                         * Sets the value of the start property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStart(String value) {
                            this.start = value;
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
     *         &lt;element name="Source">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RequestorID">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CompanyName">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
        "source"
    })
    public static class POS {

        @XmlElement(name = "Source", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelAvailRQ.POS.Source source;

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.POS.Source }
         *     
         */
        public OTAHotelAvailRQ.POS.Source getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.POS.Source }
         *     
         */
        public void setSource(OTAHotelAvailRQ.POS.Source value) {
            this.source = value;
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
         *         &lt;element name="RequestorID">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CompanyName">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}Integer" />
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
            "requestorID"
        })
        public static class Source {

            @XmlElement(name = "RequestorID", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelAvailRQ.POS.Source.RequestorID requestorID;

            /**
             * Gets the value of the requestorID property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRQ.POS.Source.RequestorID }
             *     
             */
            public OTAHotelAvailRQ.POS.Source.RequestorID getRequestorID() {
                return requestorID;
            }

            /**
             * Sets the value of the requestorID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRQ.POS.Source.RequestorID }
             *     
             */
            public void setRequestorID(OTAHotelAvailRQ.POS.Source.RequestorID value) {
                this.requestorID = value;
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
             *         &lt;element name="CompanyName">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}short" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}Integer" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "companyName"
            })
            public static class RequestorID {

                @XmlElement(name = "CompanyName", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelAvailRQ.POS.Source.RequestorID.CompanyName companyName;
                @XmlAttribute(name = "ID")
                protected String id;
                @XmlAttribute(name = "MessagePassword")
                protected String messagePassword;
                @XmlAttribute(name = "Type")
                protected Integer type;

                /**
                 * Gets the value of the companyName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRQ.POS.Source.RequestorID.CompanyName }
                 *     
                 */
                public OTAHotelAvailRQ.POS.Source.RequestorID.CompanyName getCompanyName() {
                    return companyName;
                }

                /**
                 * Sets the value of the companyName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRQ.POS.Source.RequestorID.CompanyName }
                 *     
                 */
                public void setCompanyName(OTAHotelAvailRQ.POS.Source.RequestorID.CompanyName value) {
                    this.companyName = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the messagePassword property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessagePassword() {
                    return messagePassword;
                }

                /**
                 * Sets the value of the messagePassword property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessagePassword(String value) {
                    this.messagePassword = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setType(Integer value) {
                    this.type = value;
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
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                public static class CompanyName {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "CodeContext")
                    protected Integer codeContext;

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
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the codeContext property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Integer getCodeContext() {
                        return codeContext;
                    }

                    /**
                     * Sets the value of the codeContext property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setCodeContext(Integer value) {
                        this.codeContext = value;
                    }

                }

            }

        }

    }

}
