
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
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Warnings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Warning">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Errors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Error">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelReservations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelReservation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ResGlobalInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="HotelReservationIDs">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
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
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}long" />
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
    "warnings",
    "errors",
    "hotelReservations"
})
@XmlRootElement(name = "OTA_HotelResRS", namespace = "http://www.opentravel.org/OTA/2003/05")
public class OTAHotelResRS {

    @XmlElement(name = "Success", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected String success;
    @XmlElement(name = "Warnings", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelResRS.Warnings warnings;
    @XmlElement(name = "Errors", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelResRS.Errors errors;
    @XmlElement(name = "HotelReservations", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelResRS.HotelReservations hotelReservations;
    @XmlAttribute(name = "Version")
    protected Float version;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;

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
     * Gets the value of the warnings property.
     *
     * @return
     *     possible object is
     *     {@link OTAHotelResRS.Warnings }
     *
     */
    public OTAHotelResRS.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     *
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRS.Warnings }
     *
     */
    public void setWarnings(OTAHotelResRS.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the errors property.
     *
     * @return
     *     possible object is
     *     {@link OTAHotelResRS.Errors }
     *
     */
    public OTAHotelResRS.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     *
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRS.Errors }
     *
     */
    public void setErrors(OTAHotelResRS.Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the hotelReservations property.
     *
     * @return
     *     possible object is
     *     {@link OTAHotelResRS.HotelReservations }
     *
     */
    public OTAHotelResRS.HotelReservations getHotelReservations() {
        return hotelReservations;
    }

    /**
     * Sets the value of the hotelReservations property.
     *
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRS.HotelReservations }
     *
     */
    public void setHotelReservations(OTAHotelResRS.HotelReservations value) {
        this.hotelReservations = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setVersion(Float value) {
        this.version = value;
    }

    /**
     * Gets the value of the echoToken property.
     *
     * @return
     *     possible object is
     *     {@link Long }
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
     *     {@link Long }
     *
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
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
     *         &lt;element name="Error">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}short" />
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
        "error"
    })
    public static class Errors {

        @XmlElement(name = "Error", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelResRS.Errors.Error error;

        /**
         * Gets the value of the error property.
         *
         * @return
         *     possible object is
         *     {@link OTAHotelResRS.Errors.Error }
         *
         */
        public OTAHotelResRS.Errors.Error getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         *
         * @param value
         *     allowed object is
         *     {@link OTAHotelResRS.Errors.Error }
         *
         */
        public void setError(OTAHotelResRS.Errors.Error value) {
            this.error = value;
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
         *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}short" />
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
        public static class Error {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "ShortText")
            protected String shortText;
            @XmlAttribute(name = "Type")
            protected Short type;
            @XmlAttribute(name = "Code")
            protected Short code;

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
             * Gets the value of the shortText property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getShortText() {
                return shortText;
            }

            /**
             * Sets the value of the shortText property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setShortText(String value) {
                this.shortText = value;
            }

            /**
             * Gets the value of the type property.
             *
             * @return
             *     possible object is
             *     {@link Short }
             *
             */
            public Short getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             *
             * @param value
             *     allowed object is
             *     {@link Short }
             *
             */
            public void setType(Short value) {
                this.type = value;
            }

            /**
             * Gets the value of the code property.
             *
             * @return
             *     possible object is
             *     {@link Short }
             *
             */
            public Short getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             *
             * @param value
             *     allowed object is
             *     {@link Short }
             *
             */
            public void setCode(Short value) {
                this.code = value;
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
     *         &lt;element name="HotelReservation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ResGlobalInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="HotelReservationIDs">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
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
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "hotelReservation"
    })
    public static class HotelReservations {

        @XmlElement(name = "HotelReservation", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelResRS.HotelReservations.HotelReservation hotelReservation;

        /**
         * Gets the value of the hotelReservation property.
         *
         * @return
         *     possible object is
         *     {@link OTAHotelResRS.HotelReservations.HotelReservation }
         *
         */
        public OTAHotelResRS.HotelReservations.HotelReservation getHotelReservation() {
            return hotelReservation;
        }

        /**
         * Sets the value of the hotelReservation property.
         *
         * @param value
         *     allowed object is
         *     {@link OTAHotelResRS.HotelReservations.HotelReservation }
         *
         */
        public void setHotelReservation(OTAHotelResRS.HotelReservations.HotelReservation value) {
            this.hotelReservation = value;
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
         *         &lt;element name="ResGlobalInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="HotelReservationIDs">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
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
         *       &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "resGlobalInfo"
        })
        public static class HotelReservation {

            @XmlElement(name = "ResGlobalInfo", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo resGlobalInfo;
            @XmlAttribute(name = "ResStatus")
            protected String resStatus;

            /**
             * Gets the value of the resGlobalInfo property.
             *
             * @return
             *     possible object is
             *     {@link OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo }
             *
             */
            public OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo getResGlobalInfo() {
                return resGlobalInfo;
            }

            /**
             * Sets the value of the resGlobalInfo property.
             *
             * @param value
             *     allowed object is
             *     {@link OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo }
             *
             */
            public void setResGlobalInfo(OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo value) {
                this.resGlobalInfo = value;
            }

            /**
             * Gets the value of the resStatus property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getResStatus() {
                return resStatus;
            }

            /**
             * Sets the value of the resStatus property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setResStatus(String value) {
                this.resStatus = value;
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
             *         &lt;element name="HotelReservationIDs">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                "hotelReservationIDs"
            })
            public static class ResGlobalInfo {

                @XmlElement(name = "HotelReservationIDs", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs hotelReservationIDs;

                /**
                 * Gets the value of the hotelReservationIDs property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs }
                 *
                 */
                public OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs getHotelReservationIDs() {
                    return hotelReservationIDs;
                }

                /**
                 * Sets the value of the hotelReservationIDs property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs }
                 *
                 */
                public void setHotelReservationIDs(OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs value) {
                    this.hotelReservationIDs = value;
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
                 *         &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                    "hotelReservationID"
                })
                public static class HotelReservationIDs {

                    @XmlElement(name = "HotelReservationID", namespace = "http://www.opentravel.org/OTA/2003/05")
                    protected List<OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID> hotelReservationID;

                    /**
                     * Gets the value of the hotelReservationID property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the hotelReservationID property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHotelReservationID().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID }
                     *
                     *
                     */
                    public List<OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID> getHotelReservationID() {
                        if (hotelReservationID == null) {
                            hotelReservationID = new ArrayList<OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID>();
                        }
                        return this.hotelReservationID;
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
                     *       &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                    public static class HotelReservationID {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "ResID_Value")
                        protected String resIDValue;
                        @XmlAttribute(name = "ResID_Type")
                        protected String resIDType;

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
                         * Gets the value of the resIDValue property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getResIDValue() {
                            return resIDValue;
                        }

                        /**
                         * Sets the value of the resIDValue property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setResIDValue(String value) {
                            this.resIDValue = value;
                        }

                        /**
                         * Gets the value of the resIDType property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Short }
                         *
                         */
                        public String getResIDType() {
                            return resIDType;
                        }

                        /**
                         * Sets the value of the resIDType property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Short }
                         *
                         */
                        public void setResIDType(String value) {
                            this.resIDType = value;
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
     *         &lt;element name="Warning">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(name = "Warning", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelResRS.Warnings.Warning warning;

        /**
         * Gets the value of the warning property.
         *
         * @return
         *     possible object is
         *     {@link OTAHotelResRS.Warnings.Warning }
         *
         */
        public OTAHotelResRS.Warnings.Warning getWarning() {
            return warning;
        }

        /**
         * Sets the value of the warning property.
         *
         * @param value
         *     allowed object is
         *     {@link OTAHotelResRS.Warnings.Warning }
         *
         */
        public void setWarning(OTAHotelResRS.Warnings.Warning value) {
            this.warning = value;
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
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
        public static class Warning {

            @XmlValue
            protected String value;

            @XmlAttribute(name = "Type")
            protected Integer type;

            @XmlAttribute(name = "Code")
            protected Integer code;

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
             * Gets the value of the Code property.
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
             * Sets the value of the Code property.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setCode(Integer value) {
                this.code = value;
            }

        }

    }

}
