
package com.ustrip.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *         &lt;element name="Statistics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Statistic">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}int" />
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
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pos",
        "statistics"
})
@XmlRootElement(name = "OTA_HotelStatsNotifRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
public class OTAHotelStatsNotifRQ {

    @XmlElement(name = "POS", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelStatsNotifRQ.POS pos;
    @XmlElement(name = "Statistics", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelStatsNotifRQ.Statistics statistics;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "Version")
    protected Float version;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;

    /**
     * Gets the value of the pos property.
     *
     * @return possible object is
     * {@link OTAHotelStatsNotifRQ.POS }
     */
    public OTAHotelStatsNotifRQ.POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     *
     * @param value allowed object is
     *              {@link OTAHotelStatsNotifRQ.POS }
     */
    public void setPOS(OTAHotelStatsNotifRQ.POS value) {
        this.pos = value;
    }

    /**
     * Gets the value of the statistics property.
     *
     * @return possible object is
     * {@link OTAHotelStatsNotifRQ.Statistics }
     */
    public OTAHotelStatsNotifRQ.Statistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     *
     * @param value allowed object is
     *              {@link OTAHotelStatsNotifRQ.Statistics }
     */
    public void setStatistics(OTAHotelStatsNotifRQ.Statistics value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the timeStamp property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is
     * {@link Float }
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is
     *              {@link Float }
     */
    public void setVersion(Float value) {
        this.version = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     *
     * @param value allowed object is
     *              {@link String }
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
     *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "source"
    })
    public static class POS {

        @XmlElement(name = "Source", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelStatsNotifRQ.POS.Source source;

        /**
         * Gets the value of the source property.
         *
         * @return possible object is
         * {@link OTAHotelStatsNotifRQ.POS.Source }
         */
        public OTAHotelStatsNotifRQ.POS.Source getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         *
         * @param value allowed object is
         *              {@link OTAHotelStatsNotifRQ.POS.Source }
         */
        public void setSource(OTAHotelStatsNotifRQ.POS.Source value) {
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
         *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "requestorID"
        })
        public static class Source {

            @XmlElement(name = "RequestorID", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelStatsNotifRQ.POS.Source.RequestorID requestorID;

            /**
             * Gets the value of the requestorID property.
             *
             * @return possible object is
             * {@link OTAHotelStatsNotifRQ.POS.Source.RequestorID }
             */
            public OTAHotelStatsNotifRQ.POS.Source.RequestorID getRequestorID() {
                return requestorID;
            }

            /**
             * Sets the value of the requestorID property.
             *
             * @param value allowed object is
             *              {@link OTAHotelStatsNotifRQ.POS.Source.RequestorID }
             */
            public void setRequestorID(OTAHotelStatsNotifRQ.POS.Source.RequestorID value) {
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
             *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "companyName"
            })
            public static class RequestorID {

                @XmlElement(name = "CompanyName", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelStatsNotifRQ.POS.Source.RequestorID.CompanyName companyName;
                @XmlAttribute(name = "Type")
                protected Byte type;
                @XmlAttribute(name = "ID")
                protected String id;
                @XmlAttribute(name = "MessagePassword")
                protected String messagePassword;

                /**
                 * Gets the value of the companyName property.
                 *
                 * @return possible object is
                 * {@link OTAHotelStatsNotifRQ.POS.Source.RequestorID.CompanyName }
                 */
                public OTAHotelStatsNotifRQ.POS.Source.RequestorID.CompanyName getCompanyName() {
                    return companyName;
                }

                /**
                 * Sets the value of the companyName property.
                 *
                 * @param value allowed object is
                 *              {@link OTAHotelStatsNotifRQ.POS.Source.RequestorID.CompanyName }
                 */
                public void setCompanyName(OTAHotelStatsNotifRQ.POS.Source.RequestorID.CompanyName value) {
                    this.companyName = value;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return possible object is
                 * {@link Byte }
                 */
                public Byte getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value allowed object is
                 *              {@link Byte }
                 */
                public void setType(Byte value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the id property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the messagePassword property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getMessagePassword() {
                    return messagePassword;
                }

                /**
                 * Sets the value of the messagePassword property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setMessagePassword(String value) {
                    this.messagePassword = value;
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
                    protected Short codeContext;

                    /**
                     * Gets the value of the value property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the code property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the codeContext property.
                     *
                     * @return possible object is
                     * {@link Short }
                     */
                    public Short getCodeContext() {
                        return codeContext;
                    }

                    /**
                     * Sets the value of the codeContext property.
                     *
                     * @param value allowed object is
                     *              {@link Short }
                     */
                    public void setCodeContext(Short value) {
                        this.codeContext = value;
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
     *         &lt;element name="Statistic">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "statistic"
    })
    public static class Statistics {

        @XmlElement(name = "Statistic", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
        protected OTAHotelStatsNotifRQ.Statistics.Statistic statistic;

        /**
         * Gets the value of the statistic property.
         *
         * @return possible object is
         * {@link OTAHotelStatsNotifRQ.Statistics.Statistic }
         */
        public OTAHotelStatsNotifRQ.Statistics.Statistic getStatistic() {
            return statistic;
        }

        /**
         * Sets the value of the statistic property.
         *
         * @param value allowed object is
         *              {@link OTAHotelStatsNotifRQ.Statistics.Statistic }
         */
        public void setStatistic(OTAHotelStatsNotifRQ.Statistics.Statistic value) {
            this.statistic = value;
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
         *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Statistic {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "HotelCode")
            protected Integer hotelCode;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the hotelCode property.
             *
             * @return possible object is
             * {@link Integer }
             */
            public Integer getHotelCode() {
                return hotelCode;
            }

            /**
             * Sets the value of the hotelCode property.
             *
             * @param value allowed object is
             *              {@link Integer }
             */
            public void setHotelCode(Integer value) {
                this.hotelCode = value;
            }

        }

    }

}
