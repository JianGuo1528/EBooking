
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
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
 *         &lt;element name="UniqueID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}short" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
 *                             &lt;element name="RoomStays">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RoomStay">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RoomTypes">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RoomType">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RatePlans">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RatePlan">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="RatePlanDescription">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Text">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                                                                   &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                                                   &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RoomRates">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RoomRate">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Rates">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Rate">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="Base">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;simpleContent>
 *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                               &lt;/extension>
 *                                                                                             &lt;/simpleContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                                                       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
 *                                                                   &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                                                   &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                                   &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="BasicPropertyInfo">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                             &lt;element name="ResGuests">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ResGuest">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Profiles">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ProfileInfo">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Profile">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Customer">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="GivenName">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;enumeration value="Clark"/>
 *                                                                                                         &lt;enumeration value="Jerry"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                 &lt;/sequence>
 *                                                                                                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                                                                 &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="ContactPerson">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="PersonName">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;complexContent>
 *                                                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                           &lt;sequence>
 *                                                                                                             &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                             &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                           &lt;/sequence>
 *                                                                                                         &lt;/restriction>
 *                                                                                                       &lt;/complexContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="Telephone">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;simpleContent>
 *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                           &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                                                                                                         &lt;/extension>
 *                                                                                                       &lt;/simpleContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                 &lt;/sequence>
 *                                                                                                 &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                                               &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ResGlobalInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GuestCounts">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="GuestCount" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="AgeQualifyingGroup" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                         &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TimeSpan">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SpecialRequests">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SpecialRequest">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Text">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="Listitem" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Guarantee">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="GuaranteesAccepted">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="GuaranteeAccepted">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PaymentCard">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                             &lt;/sequence>
 *                                                                             &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                                                                             &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                                             &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
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
 *                                               &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DepositPayments">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="GuaranteePayment">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AcceptedPayments">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="AcceptedPayment">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="PaymentCard">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                                                                       &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                                                       &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
 *                                       &lt;element name="Total">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                               &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TPA_Extensions">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="HotelReservationIDs">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                                         &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "uniqueID",
        "hotelReservations"
})
@XmlRootElement(name = "OTA_HotelResRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
public class OTAHotelResRQ {

    @XmlElement(name = "POS", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelResRQ.POS pos;
    @XmlElement(name = "UniqueID", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelResRQ.UniqueID uniqueID;
    @XmlElement(name = "HotelReservations", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
    protected OTAHotelResRQ.HotelReservations hotelReservations;
    @XmlAttribute(name = "Version")
    protected Float version;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "EchoToken")
    protected Long echoToken;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected String retransmissionIndicator;

    /**
     * Gets the value of the pos property.
     *
     * @return
     *     possible object is
     *     {@link OTAHotelResRQ.POS }
     *
     */
    public OTAHotelResRQ.POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     *
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRQ.POS }
     *
     */
    public void setPOS(OTAHotelResRQ.POS value) {
        this.pos = value;
    }

    /**
     * Gets the value of the uniqueID property.
     *
     * @return
     *     possible object is
     *     {@link OTAHotelResRQ.UniqueID }
     *
     */
    public OTAHotelResRQ.UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     *
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRQ.UniqueID }
     *
     */
    public void setUniqueID(OTAHotelResRQ.UniqueID value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the hotelReservations property.
     *
     * @return
     *     possible object is
     *     {@link OTAHotelResRQ.HotelReservations }
     *
     */
    public OTAHotelResRQ.HotelReservations getHotelReservations() {
        return hotelReservations;
    }

    /**
     * Sets the value of the hotelReservations property.
     *
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRQ.HotelReservations }
     *
     */
    public void setHotelReservations(OTAHotelResRQ.HotelReservations value) {
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
     * Gets the value of the echoToken property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getEchoToken() {
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
    public void setEchoToken(Long value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRetransmissionIndicator(String value) {
        this.retransmissionIndicator = value;
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
     *                   &lt;element name="RoomStays">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RoomStay">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RoomTypes">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RoomType">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RatePlans">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RatePlan">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="RatePlanDescription">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Text">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                             &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                             &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                                         &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                         &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RoomRates">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RoomRate">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Rates">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Rate">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Base">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;simpleContent>
     *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                     &lt;/extension>
     *                                                                                   &lt;/simpleContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                                                             &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
     *                                                         &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                         &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="BasicPropertyInfo">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                   &lt;element name="ResGuests">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ResGuest">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Profiles">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ProfileInfo">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Profile">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Customer">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="GivenName">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                               &lt;enumeration value="Clark"/>
     *                                                                                               &lt;enumeration value="Jerry"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                                                       &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="ContactPerson">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="PersonName">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                                 &lt;/sequence>
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="Telephone">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;simpleContent>
     *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
     *                                                                                               &lt;/extension>
     *                                                                                             &lt;/simpleContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                     &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ResGlobalInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GuestCounts">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="GuestCount" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="AgeQualifyingGroup" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                               &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TimeSpan">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SpecialRequests">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecialRequest">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Text">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="Listitem" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
     *                             &lt;element name="Guarantee">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="GuaranteesAccepted">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="GuaranteeAccepted">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PaymentCard">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
     *                                                                   &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                                   &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
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
     *                                     &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DepositPayments">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="GuaranteePayment">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AcceptedPayments">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="AcceptedPayment">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="PaymentCard">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                                             &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                                             &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                             &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
     *                             &lt;element name="Total">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                     &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}short" />
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
     *                             &lt;element name="HotelReservationIDs">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                               &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        protected OTAHotelResRQ.HotelReservations.HotelReservation hotelReservation;

        /**
         * Gets the value of the hotelReservation property.
         *
         * @return
         *     possible object is
         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation }
         *
         */
        public OTAHotelResRQ.HotelReservations.HotelReservation getHotelReservation() {
            return hotelReservation;
        }

        /**
         * Sets the value of the hotelReservation property.
         *
         * @param value
         *     allowed object is
         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation }
         *
         */
        public void setHotelReservation(OTAHotelResRQ.HotelReservations.HotelReservation value) {
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
         *         &lt;element name="RoomStays">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomStay">
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
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
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
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                   &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                                               &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
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
         *                                                                         &lt;simpleContent>
         *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                             &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                             &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                             &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                           &lt;/extension>
         *                                                                         &lt;/simpleContent>
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
         *                                               &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                               &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
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
         *         &lt;element name="ResGuests">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ResGuest">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Profiles">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ProfileInfo">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Profile">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Customer">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="GivenName">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                     &lt;enumeration value="Clark"/>
         *                                                                                     &lt;enumeration value="Jerry"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                               &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                             &lt;/sequence>
         *                                                                             &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                                                             &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                             &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="ContactPerson">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="PersonName">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;complexContent>
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                                       &lt;sequence>
         *                                                                                         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                                         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                                       &lt;/sequence>
         *                                                                                     &lt;/restriction>
         *                                                                                   &lt;/complexContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="Telephone">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;simpleContent>
         *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
         *                                                                                     &lt;/extension>
         *                                                                                   &lt;/simpleContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                             &lt;/sequence>
         *                                                                             &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                           &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ResGlobalInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GuestCounts">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="GuestCount" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="AgeQualifyingGroup" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                     &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TimeSpan">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SpecialRequests">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecialRequest">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Text">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="Listitem" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
         *                   &lt;element name="Guarantee">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="GuaranteesAccepted">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="GuaranteeAccepted">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PaymentCard">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
         *                                                         &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                                         &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
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
         *                           &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DepositPayments">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="GuaranteePayment">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AcceptedPayments">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="AcceptedPayment">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="PaymentCard">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                                                   &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                                                   &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
         *                   &lt;element name="Total">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                           &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}short" />
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
         *                   &lt;element name="HotelReservationIDs">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                     &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "roomStays",
                "resGuests",
                "resGlobalInfo"
        })
        public static class HotelReservation {

            @XmlElement(name = "RoomStays", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays roomStays;
            @XmlElement(name = "ResGuests", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests resGuests;
            @XmlElement(name = "ResGlobalInfo", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
            protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo resGlobalInfo;

            /**
             * Gets the value of the roomStays property.
             *
             * @return
             *     possible object is
             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays }
             *
             */
            public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays getRoomStays() {
                return roomStays;
            }

            /**
             * Sets the value of the roomStays property.
             *
             * @param value
             *     allowed object is
             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays }
             *
             */
            public void setRoomStays(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays value) {
                this.roomStays = value;
            }

            /**
             * Gets the value of the resGuests property.
             *
             * @return
             *     possible object is
             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests }
             *
             */
            public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests getResGuests() {
                return resGuests;
            }

            /**
             * Sets the value of the resGuests property.
             *
             * @param value
             *     allowed object is
             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests }
             *
             */
            public void setResGuests(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests value) {
                this.resGuests = value;
            }

            /**
             * Gets the value of the resGlobalInfo property.
             *
             * @return
             *     possible object is
             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo }
             *
             */
            public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo getResGlobalInfo() {
                return resGlobalInfo;
            }

            /**
             * Sets the value of the resGlobalInfo property.
             *
             * @param value
             *     allowed object is
             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo }
             *
             */
            public void setResGlobalInfo(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo value) {
                this.resGlobalInfo = value;
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
             *                   &lt;element name="GuestCount" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="AgeQualifyingGroup" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TimeSpan">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SpecialRequests">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SpecialRequest">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Text">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="Listitem" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
             *         &lt;element name="Guarantee">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="GuaranteesAccepted">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="GuaranteeAccepted">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PaymentCard">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
             *                                               &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                               &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
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
             *                 &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DepositPayments">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="GuaranteePayment">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AcceptedPayments">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="AcceptedPayment">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="PaymentCard">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                                                         &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                                         &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
             *         &lt;element name="Total">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}short" />
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
             *         &lt;element name="HotelReservationIDs">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                           &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "guestCounts",
                    "timeSpan",
                    "specialRequests",
                    "guarantee",
                    "depositPayments",
                    "total",
                    "tpaExtensions",
                    "hotelReservationIDs"
            })
            public static class ResGlobalInfo {

                @XmlElement(name = "GuestCounts", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts guestCounts;
                @XmlElement(name = "TimeSpan", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TimeSpan timeSpan;
                @XmlElement(name = "SpecialRequests", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests specialRequests;
                @XmlElement(name = "Guarantee", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee guarantee;
                @XmlElement(name = "DepositPayments", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments depositPayments;
                @XmlElement(name = "Total", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Total total;
                @XmlElement(name = "TPA_Extensions", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TPAExtensions tpaExtensions;
                @XmlElement(name = "HotelReservationIDs", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs hotelReservationIDs;

                /**
                 * Gets the value of the guestCounts property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts getGuestCounts() {
                    return guestCounts;
                }

                /**
                 * Sets the value of the guestCounts property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts }
                 *
                 */
                public void setGuestCounts(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts value) {
                    this.guestCounts = value;
                }

                /**
                 * Gets the value of the timeSpan property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TimeSpan }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TimeSpan getTimeSpan() {
                    return timeSpan;
                }

                /**
                 * Sets the value of the timeSpan property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TimeSpan }
                 *
                 */
                public void setTimeSpan(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TimeSpan value) {
                    this.timeSpan = value;
                }

                /**
                 * Gets the value of the specialRequests property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests getSpecialRequests() {
                    return specialRequests;
                }

                /**
                 * Sets the value of the specialRequests property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests }
                 *
                 */
                public void setSpecialRequests(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests value) {
                    this.specialRequests = value;
                }

                /**
                 * Gets the value of the guarantee property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee getGuarantee() {
                    return guarantee;
                }

                /**
                 * Sets the value of the guarantee property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee }
                 *
                 */
                public void setGuarantee(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee value) {
                    this.guarantee = value;
                }

                /**
                 * Gets the value of the depositPayments property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments getDepositPayments() {
                    return depositPayments;
                }

                /**
                 * Sets the value of the depositPayments property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments }
                 *
                 */
                public void setDepositPayments(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments value) {
                    this.depositPayments = value;
                }

                /**
                 * Gets the value of the total property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Total }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Total getTotal() {
                    return total;
                }

                /**
                 * Sets the value of the total property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Total }
                 *
                 */
                public void setTotal(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Total value) {
                    this.total = value;
                }

                /**
                 * Gets the value of the tpaExtensions property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TPAExtensions }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TPAExtensions }
                 *
                 */
                public void setTPAExtensions(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * Gets the value of the hotelReservationIDs property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs getHotelReservationIDs() {
                    return hotelReservationIDs;
                }

                /**
                 * Sets the value of the hotelReservationIDs property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs }
                 *
                 */
                public void setHotelReservationIDs(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs value) {
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
                 *         &lt;element name="GuaranteePayment">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AcceptedPayments">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="AcceptedPayment">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="PaymentCard">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                                               &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                                               &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
                        "guaranteePayment"
                })
                public static class DepositPayments {

                    @XmlElement(name = "GuaranteePayment", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment guaranteePayment;

                    /**
                     * Gets the value of the guaranteePayment property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment getGuaranteePayment() {
                        return guaranteePayment;
                    }

                    /**
                     * Sets the value of the guaranteePayment property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment }
                     *
                     */
                    public void setGuaranteePayment(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment value) {
                        this.guaranteePayment = value;
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
                     *         &lt;element name="AcceptedPayments">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="AcceptedPayment">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="PaymentCard">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                     &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *                                     &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                                     &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
                            "acceptedPayments"
                    })
                    public static class GuaranteePayment {

                        @XmlElement(name = "AcceptedPayments", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments acceptedPayments;

                        /**
                         * Gets the value of the acceptedPayments property.
                         *
                         * @return
                         *     possible object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments }
                         *
                         */
                        public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments getAcceptedPayments() {
                            return acceptedPayments;
                        }

                        /**
                         * Sets the value of the acceptedPayments property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments }
                         *
                         */
                        public void setAcceptedPayments(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments value) {
                            this.acceptedPayments = value;
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
                         *         &lt;element name="AcceptedPayment">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="PaymentCard">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                           &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
                         *                           &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *                           &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
                                "acceptedPayment"
                        })
                        public static class AcceptedPayments {

                            @XmlElement(name = "AcceptedPayment", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment acceptedPayment;

                            /**
                             * Gets the value of the acceptedPayment property.
                             *
                             * @return
                             *     possible object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment }
                             *
                             */
                            public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment getAcceptedPayment() {
                                return acceptedPayment;
                            }

                            /**
                             * Sets the value of the acceptedPayment property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment }
                             *
                             */
                            public void setAcceptedPayment(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment value) {
                                this.acceptedPayment = value;
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
                             *         &lt;element name="PaymentCard">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
                             *                 &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                             *                 &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
                                    "paymentCard"
                            })
                            public static class AcceptedPayment {

                                @XmlElement(name = "PaymentCard", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment.PaymentCard paymentCard;

                                /**
                                 * Gets the value of the paymentCard property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment.PaymentCard }
                                 *
                                 */
                                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment.PaymentCard getPaymentCard() {
                                    return paymentCard;
                                }

                                /**
                                 * Sets the value of the paymentCard property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment.PaymentCard }
                                 *
                                 */
                                public void setPaymentCard(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.DepositPayments.GuaranteePayment.AcceptedPayments.AcceptedPayment.PaymentCard value) {
                                    this.paymentCard = value;
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
                                 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
                                 *       &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                                 *       &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *       &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 *
                                 *
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                        "cardHolderName"
                                })
                                public static class PaymentCard {

                                    @XmlElement(name = "CardHolderName", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                    protected String cardHolderName;
                                    @XmlAttribute(name = "ExpireDate")
                                    protected String expireDate;
                                    @XmlAttribute(name = "CardType")
                                    protected String cardType;
                                    @XmlAttribute(name = "CardCode")
                                    protected String cardCode;
                                    @XmlAttribute(name = "CardNumber")
                                    protected String cardNumber;

                                    /**
                                     * Gets the value of the cardHolderName property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *
                                     */
                                    public String getCardHolderName() {
                                        return cardHolderName;
                                    }

                                    /**
                                     * Sets the value of the cardHolderName property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *
                                     */
                                    public void setCardHolderName(String value) {
                                        this.cardHolderName = value;
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
                                     * Gets the value of the cardType property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *
                                     */
                                    public String getCardType() {
                                        return cardType;
                                    }

                                    /**
                                     * Sets the value of the cardType property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *
                                     */
                                    public void setCardType(String value) {
                                        this.cardType = value;
                                    }

                                    /**
                                     * Gets the value of the cardCode property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *
                                     */
                                    public String getCardCode() {
                                        return cardCode;
                                    }

                                    /**
                                     * Sets the value of the cardCode property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *
                                     */
                                    public void setCardCode(String value) {
                                        this.cardCode = value;
                                    }

                                    /**
                                     * Gets the value of the cardNumber property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *
                                     */
                                    public String getCardNumber() {
                                        return cardNumber;
                                    }

                                    /**
                                     * Sets the value of the cardNumber property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *
                                     */
                                    public void setCardNumber(String value) {
                                        this.cardNumber = value;
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
                 *         &lt;element name="GuaranteesAccepted">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="GuaranteeAccepted">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PaymentCard">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                 *                                     &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                                     &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                 *       &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "guaranteesAccepted"
                })
                public static class Guarantee {

                    @XmlElement(name = "GuaranteesAccepted", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted guaranteesAccepted;
                    @XmlAttribute(name = "GuaranteeCode")
                    protected String guaranteeCode;

                    /**
                     * Gets the value of the guaranteesAccepted property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted getGuaranteesAccepted() {
                        return guaranteesAccepted;
                    }

                    /**
                     * Sets the value of the guaranteesAccepted property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted }
                     *
                     */
                    public void setGuaranteesAccepted(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted value) {
                        this.guaranteesAccepted = value;
                    }

                    /**
                     * Gets the value of the guaranteeCode property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getGuaranteeCode() {
                        return guaranteeCode;
                    }

                    /**
                     * Sets the value of the guaranteeCode property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setGuaranteeCode(String value) {
                        this.guaranteeCode = value;
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
                     *         &lt;element name="GuaranteeAccepted">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PaymentCard">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                     *                           &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                           &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                            "guaranteeAccepted"
                    })
                    public static class GuaranteesAccepted {

                        @XmlElement(name = "GuaranteeAccepted", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted guaranteeAccepted;

                        /**
                         * Gets the value of the guaranteeAccepted property.
                         *
                         * @return
                         *     possible object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted }
                         *
                         */
                        public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted getGuaranteeAccepted() {
                            return guaranteeAccepted;
                        }

                        /**
                         * Sets the value of the guaranteeAccepted property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted }
                         *
                         */
                        public void setGuaranteeAccepted(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted value) {
                            this.guaranteeAccepted = value;
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
                         *         &lt;element name="PaymentCard">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                         *                 &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *                 &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                                "paymentCard"
                        })
                        public static class GuaranteeAccepted {

                            @XmlElement(name = "PaymentCard", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted.PaymentCard paymentCard;

                            /**
                             * Gets the value of the paymentCard property.
                             *
                             * @return
                             *     possible object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted.PaymentCard }
                             *
                             */
                            public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted.PaymentCard getPaymentCard() {
                                return paymentCard;
                            }

                            /**
                             * Sets the value of the paymentCard property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted.PaymentCard }
                             *
                             */
                            public void setPaymentCard(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.Guarantee.GuaranteesAccepted.GuaranteeAccepted.PaymentCard value) {
                                this.paymentCard = value;
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
                             *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *       &lt;/sequence>
                             *       &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                             *       &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                             *       &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}short" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             *
                             *
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                    "cardHolderName"
                            })
                            public static class PaymentCard {

                                @XmlElement(name = "CardHolderName", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                protected String cardHolderName;
                                @XmlAttribute(name = "CardNumber")
                                protected Long cardNumber;
                                @XmlAttribute(name = "CardType")
                                protected Byte cardType;
                                @XmlAttribute(name = "CardCode")
                                protected String cardCode;
                                @XmlAttribute(name = "ExpireDate")
                                protected Short expireDate;

                                /**
                                 * Gets the value of the cardHolderName property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *
                                 */
                                public String getCardHolderName() {
                                    return cardHolderName;
                                }

                                /**
                                 * Sets the value of the cardHolderName property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *
                                 */
                                public void setCardHolderName(String value) {
                                    this.cardHolderName = value;
                                }

                                /**
                                 * Gets the value of the cardNumber property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link Long }
                                 *
                                 */
                                public Long getCardNumber() {
                                    return cardNumber;
                                }

                                /**
                                 * Sets the value of the cardNumber property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link Long }
                                 *
                                 */
                                public void setCardNumber(Long value) {
                                    this.cardNumber = value;
                                }

                                /**
                                 * Gets the value of the cardType property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link Byte }
                                 *
                                 */
                                public Byte getCardType() {
                                    return cardType;
                                }

                                /**
                                 * Sets the value of the cardType property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link Byte }
                                 *
                                 */
                                public void setCardType(Byte value) {
                                    this.cardType = value;
                                }

                                /**
                                 * Gets the value of the cardCode property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *
                                 */
                                public String getCardCode() {
                                    return cardCode;
                                }

                                /**
                                 * Sets the value of the cardCode property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *
                                 */
                                public void setCardCode(String value) {
                                    this.cardCode = value;
                                }

                                /**
                                 * Gets the value of the expireDate property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link Short }
                                 *
                                 */
                                public Short getExpireDate() {
                                    return expireDate;
                                }

                                /**
                                 * Sets the value of the expireDate property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link Short }
                                 *
                                 */
                                public void setExpireDate(Short value) {
                                    this.expireDate = value;
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
                 *         &lt;element name="GuestCount" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="AgeQualifyingGroup" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}byte" />
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

                    @XmlElement(name = "GuestCount", namespace = "http://www.opentravel.org/OTA/2003/05")
                    protected List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts.GuestCount> guestCount;

                    /**
                     * Gets the value of the guestCount property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the guestCount property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getGuestCount().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts.GuestCount }
                     *
                     *
                     */
                    public List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts.GuestCount> getGuestCount() {
                        if (guestCount == null) {
                            guestCount = new ArrayList<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts.GuestCount>();
                        }
                        return this.guestCount;
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
                     *       &lt;attribute name="AgeQualifyingGroup" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                        @XmlAttribute(name = "AgeQualifyingGroup")
                        protected Byte ageQualifyingGroup;
                        @XmlAttribute(name = "Count")
                        protected Byte count;

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
                         * Gets the value of the ageQualifyingGroup property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *
                         */
                        public Byte getAgeQualifyingGroup() {
                            return ageQualifyingGroup;
                        }

                        /**
                         * Sets the value of the ageQualifyingGroup property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *
                         */
                        public void setAgeQualifyingGroup(Byte value) {
                            this.ageQualifyingGroup = value;
                        }

                        /**
                         * Gets the value of the count property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *
                         */
                        public Byte getCount() {
                            return count;
                        }

                        /**
                         * Sets the value of the count property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *
                         */
                        public void setCount(Byte value) {
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
                 *         &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                 &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    protected List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID> hotelReservationID;

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
                     * {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID }
                     *
                     *
                     */
                    public List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID> getHotelReservationID() {
                        if (hotelReservationID == null) {
                            hotelReservationID = new ArrayList<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID>();
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
                     *       &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *       &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        @XmlAttribute(name = "ResID_Type")
                        protected Short resIDType;
                        @XmlAttribute(name = "ResID_Value")
                        protected String resIDValue;

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
                         * Gets the value of the resIDType property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Short }
                         *
                         */
                        public Short getResIDType() {
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
                        public void setResIDType(Short value) {
                            this.resIDType = value;
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
                 *         &lt;element name="SpecialRequest">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Text">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="Listitem" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                        "specialRequest"
                })
                public static class SpecialRequests {

                    @XmlElement(name = "SpecialRequest", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest specialRequest;

                    /**
                     * Gets the value of the specialRequest property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest getSpecialRequest() {
                        return specialRequest;
                    }

                    /**
                     * Sets the value of the specialRequest property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest }
                     *
                     */
                    public void setSpecialRequest(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest value) {
                        this.specialRequest = value;
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
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="ListItem" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="Listitem" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                            "text",
                            "listItem"
                    })
                    public static class SpecialRequest {

                        @XmlElement(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.Text text;
                        @XmlElement(name = "ListItem", namespace = "http://www.opentravel.org/OTA/2003/05")
                        protected List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.ListItem> listItem;

                        /**
                         * Gets the value of the text property.
                         *
                         * @return
                         *     possible object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.Text }
                         *
                         */
                        public OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.Text getText() {
                            return text;
                        }

                        /**
                         * Sets the value of the text property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.Text }
                         *
                         */
                        public void setText(OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.Text value) {
                            this.text = value;
                        }

                        /**
                         * Gets the value of the listItem property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the listItem property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getListItem().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.ListItem }
                         *
                         *
                         */
                        public List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.ListItem> getListItem() {
                            if (listItem == null) {
                                listItem = new ArrayList<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.ListItem>();
                            }
                            return this.listItem;
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
                         *       &lt;attribute name="Listitem" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                        public static class ListItem {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "Listitem")
                            protected Byte listitem;

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
                             * Gets the value of the listitem property.
                             *
                             * @return
                             *     possible object is
                             *     {@link Byte }
                             *
                             */
                            public Byte getListitem() {
                                return listitem;
                            }

                            /**
                             * Sets the value of the listitem property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Byte }
                             *
                             */
                            public void setListitem(Byte value) {
                                this.listitem = value;
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
                         *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        public static class Text {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "Language")
                            protected String language;
                            @XmlAttribute(name = "TextFormat")
                            protected String textFormat;

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
                             * Gets the value of the language property.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getLanguage() {
                                return language;
                            }

                            /**
                             * Sets the value of the language property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setLanguage(String value) {
                                this.language = value;
                            }

                            /**
                             * Gets the value of the textFormat property.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getTextFormat() {
                                return textFormat;
                            }

                            /**
                             * Sets the value of the textFormat property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setTextFormat(String value) {
                                this.textFormat = value;
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
                 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class TimeSpan {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "End")
                    protected String end;
                    @XmlAttribute(name = "Start")
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


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}short" />
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
             *         &lt;element name="ResGuest">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Profiles">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ProfileInfo">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Profile">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Customer">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="GivenName">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                           &lt;enumeration value="Clark"/>
             *                                                                           &lt;enumeration value="Jerry"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                                     &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                   &lt;/sequence>
             *                                                                   &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                                                   &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                   &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="ContactPerson">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="PersonName">
             *                                                                       &lt;complexType>
             *                                                                         &lt;complexContent>
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                             &lt;sequence>
             *                                                                               &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                               &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                             &lt;/sequence>
             *                                                                           &lt;/restriction>
             *                                                                         &lt;/complexContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="Telephone">
             *                                                                       &lt;complexType>
             *                                                                         &lt;simpleContent>
             *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                             &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
             *                                                                           &lt;/extension>
             *                                                                         &lt;/simpleContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                   &lt;/sequence>
             *                                                                   &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                 &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "resGuest"
            })
            public static class ResGuests {

                @XmlElement(name = "ResGuest", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest resGuest;

                /**
                 * Gets the value of the resGuest property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest getResGuest() {
                    return resGuest;
                }

                /**
                 * Sets the value of the resGuest property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest }
                 *
                 */
                public void setResGuest(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest value) {
                    this.resGuest = value;
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
                 *         &lt;element name="Profiles">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ProfileInfo">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Profile">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Customer">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="GivenName">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                                 &lt;enumeration value="Clark"/>
                 *                                                                 &lt;enumeration value="Jerry"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                           &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                         &lt;/sequence>
                 *                                                         &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                                                         &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                         &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="ContactPerson">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="PersonName">
                 *                                                             &lt;complexType>
                 *                                                               &lt;complexContent>
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                                   &lt;sequence>
                 *                                                                     &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                                     &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                                   &lt;/sequence>
                 *                                                                 &lt;/restriction>
                 *                                                               &lt;/complexContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="Telephone">
                 *                                                             &lt;complexType>
                 *                                                               &lt;simpleContent>
                 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                   &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                 *                                                                 &lt;/extension>
                 *                                                               &lt;/simpleContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                         &lt;/sequence>
                 *                                                         &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "profiles"
                })
                public static class ResGuest {

                    @XmlElement(name = "Profiles", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles profiles;
                    @XmlAttribute(name = "ArrivalTime")
                    protected String arrivalTime;

                    /**
                     * Gets the value of the profiles property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles getProfiles() {
                        return profiles;
                    }

                    /**
                     * Sets the value of the profiles property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles }
                     *
                     */
                    public void setProfiles(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles value) {
                        this.profiles = value;
                    }

                    /**
                     * Gets the value of the arrivalTime property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getArrivalTime() {
                        return arrivalTime;
                    }

                    /**
                     * Sets the value of the arrivalTime property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setArrivalTime(String value) {
                        this.arrivalTime = value;
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
                     *         &lt;element name="ProfileInfo">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Profile">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Customer">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="GivenName">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                       &lt;enumeration value="Clark"/>
                     *                                                       &lt;enumeration value="Jerry"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                                 &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                               &lt;/sequence>
                     *                                               &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                                               &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                               &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                       &lt;element name="ContactPerson">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="PersonName">
                     *                                                   &lt;complexType>
                     *                                                     &lt;complexContent>
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                                         &lt;sequence>
                     *                                                           &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                           &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                         &lt;/sequence>
                     *                                                       &lt;/restriction>
                     *                                                     &lt;/complexContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="Telephone">
                     *                                                   &lt;complexType>
                     *                                                     &lt;simpleContent>
                     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                         &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                     *                                                       &lt;/extension>
                     *                                                     &lt;/simpleContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                               &lt;/sequence>
                     *                                               &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "profileInfo"
                    })
                    public static class Profiles {

                        @XmlElement(name = "ProfileInfo", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo profileInfo;

                        /**
                         * Gets the value of the profileInfo property.
                         *
                         * @return
                         *     possible object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo }
                         *
                         */
                        public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo getProfileInfo() {
                            return profileInfo;
                        }

                        /**
                         * Sets the value of the profileInfo property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo }
                         *
                         */
                        public void setProfileInfo(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo value) {
                            this.profileInfo = value;
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
                         *         &lt;element name="Profile">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Customer">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="GivenName">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                             &lt;enumeration value="Clark"/>
                         *                                             &lt;enumeration value="Jerry"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                                       &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                     &lt;/sequence>
                         *                                     &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *                                     &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                     &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                             &lt;element name="ContactPerson">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="PersonName">
                         *                                         &lt;complexType>
                         *                                           &lt;complexContent>
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                               &lt;sequence>
                         *                                                 &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                                 &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                               &lt;/sequence>
                         *                                             &lt;/restriction>
                         *                                           &lt;/complexContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="Telephone">
                         *                                         &lt;complexType>
                         *                                           &lt;simpleContent>
                         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                               &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                         *                                             &lt;/extension>
                         *                                           &lt;/simpleContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                     &lt;/sequence>
                         *                                     &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                "profile"
                        })
                        public static class ProfileInfo {

                            @XmlElement(name = "Profile", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile profile;

                            /**
                             * Gets the value of the profile property.
                             *
                             * @return
                             *     possible object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile }
                             *
                             */
                            public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile getProfile() {
                                return profile;
                            }

                            /**
                             * Sets the value of the profile property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile }
                             *
                             */
                            public void setProfile(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile value) {
                                this.profile = value;
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
                             *         &lt;element name="Customer">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="GivenName">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                   &lt;enumeration value="Clark"/>
                             *                                   &lt;enumeration value="Jerry"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                             &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                             &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                           &lt;/sequence>
                             *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
                             *                           &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                           &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                   &lt;element name="ContactPerson">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="PersonName">
                             *                               &lt;complexType>
                             *                                 &lt;complexContent>
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                                     &lt;sequence>
                             *                                       &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                                       &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                                     &lt;/sequence>
                             *                                   &lt;/restriction>
                             *                                 &lt;/complexContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="Telephone">
                             *                               &lt;complexType>
                             *                                 &lt;simpleContent>
                             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                     &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                             *                                   &lt;/extension>
                             *                                 &lt;/simpleContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                           &lt;/sequence>
                             *                           &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                    "customer"
                            })
                            public static class Profile {

                                @XmlElement(name = "Customer", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer customer;

                                /**
                                 * Gets the value of the customer property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer }
                                 *
                                 */
                                public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer getCustomer() {
                                    return customer;
                                }

                                /**
                                 * Sets the value of the customer property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer }
                                 *
                                 */
                                public void setCustomer(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer value) {
                                    this.customer = value;
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
                                 *         &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="GivenName">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                         &lt;enumeration value="Clark"/>
                                 *                         &lt;enumeration value="Jerry"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                 &lt;/sequence>
                                 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
                                 *                 &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *         &lt;element name="ContactPerson">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="PersonName">
                                 *                     &lt;complexType>
                                 *                       &lt;complexContent>
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                           &lt;sequence>
                                 *                             &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                             &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                           &lt;/sequence>
                                 *                         &lt;/restriction>
                                 *                       &lt;/complexContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="Telephone">
                                 *                     &lt;complexType>
                                 *                       &lt;simpleContent>
                                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                           &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                                 *                         &lt;/extension>
                                 *                       &lt;/simpleContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                 &lt;/sequence>
                                 *                 &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                        "personName",
                                        "contactPerson"
                                })
                                public static class Customer {

                                    @XmlElement(name = "PersonName", namespace = "http://www.opentravel.org/OTA/2003/05")
                                    protected List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName> personName;
                                    @XmlElement(name = "ContactPerson", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                    protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson contactPerson;

                                    /**
                                     * Gets the value of the personName property.
                                     *
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the personName property.
                                     *
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getPersonName().add(newItem);
                                     * </pre>
                                     *
                                     *
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName }
                                     *
                                     *
                                     */
                                    public List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName> getPersonName() {
                                        if (personName == null) {
                                            personName = new ArrayList<OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName>();
                                        }
                                        return this.personName;
                                    }

                                    /**
                                     * Gets the value of the contactPerson property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson }
                                     *
                                     */
                                    public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson getContactPerson() {
                                        return contactPerson;
                                    }

                                    /**
                                     * Sets the value of the contactPerson property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson }
                                     *
                                     */
                                    public void setContactPerson(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson value) {
                                        this.contactPerson = value;
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
                                     *         &lt;element name="PersonName">
                                     *           &lt;complexType>
                                     *             &lt;complexContent>
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *                 &lt;sequence>
                                     *                   &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *                 &lt;/sequence>
                                     *               &lt;/restriction>
                                     *             &lt;/complexContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="Telephone">
                                     *           &lt;complexType>
                                     *             &lt;simpleContent>
                                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
                                     *               &lt;/extension>
                                     *             &lt;/simpleContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *       &lt;/sequence>
                                     *       &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *     &lt;/restriction>
                                     *   &lt;/complexContent>
                                     * &lt;/complexType>
                                     * </pre>
                                     *
                                     *
                                     */
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                            "personName",
                                            "telephone",
                                            "email"
                                    })
                                    public static class ContactPerson {

                                        @XmlElement(name = "PersonName", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                        protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.PersonName personName;
                                        @XmlElement(name = "Telephone", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                        protected OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.Telephone telephone;
                                        @XmlElement(name = "Email", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                        protected String email;
                                        @XmlAttribute(name = "ContactType")
                                        protected String contactType;

                                        /**
                                         * Gets the value of the personName property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.PersonName }
                                         *
                                         */
                                        public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.PersonName getPersonName() {
                                            return personName;
                                        }

                                        /**
                                         * Sets the value of the personName property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.PersonName }
                                         *
                                         */
                                        public void setPersonName(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.PersonName value) {
                                            this.personName = value;
                                        }

                                        /**
                                         * Gets the value of the telephone property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.Telephone }
                                         *
                                         */
                                        public OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.Telephone getTelephone() {
                                            return telephone;
                                        }

                                        /**
                                         * Sets the value of the telephone property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.Telephone }
                                         *
                                         */
                                        public void setTelephone(OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.ContactPerson.Telephone value) {
                                            this.telephone = value;
                                        }

                                        /**
                                         * Gets the value of the email property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *
                                         */
                                        public String getEmail() {
                                            return email;
                                        }

                                        /**
                                         * Sets the value of the email property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *
                                         */
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                        /**
                                         * Gets the value of the contactType property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *
                                         */
                                        public String getContactType() {
                                            return contactType;
                                        }

                                        /**
                                         * Sets the value of the contactType property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *
                                         */
                                        public void setContactType(String value) {
                                            this.contactType = value;
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
                                         *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                         *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                                "givenName",
                                                "surname"
                                        })
                                        public static class PersonName {

                                            @XmlElement(name = "GivenName", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                            protected String givenName;
                                            @XmlElement(name = "Surname", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                            protected String surname;

                                            /**
                                             * Gets the value of the givenName property.
                                             *
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *
                                             */
                                            public String getGivenName() {
                                                return givenName;
                                            }

                                            /**
                                             * Sets the value of the givenName property.
                                             *
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *
                                             */
                                            public void setGivenName(String value) {
                                                this.givenName = value;
                                            }

                                            /**
                                             * Gets the value of the surname property.
                                             *
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *
                                             */
                                            public String getSurname() {
                                                return surname;
                                            }

                                            /**
                                             * Sets the value of the surname property.
                                             *
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *
                                             */
                                            public void setSurname(String value) {
                                                this.surname = value;
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
                                         *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
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
                                        public static class Telephone {

                                            @XmlValue
                                            protected String value;
                                            @XmlAttribute(name = "PhoneNumber")
                                            protected String phoneNumber;

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
                                             * Gets the value of the phoneNumber property.
                                             *
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *
                                             */
                                            public String getPhoneNumber() {
                                                return phoneNumber;
                                            }

                                            /**
                                             * Sets the value of the phoneNumber property.
                                             *
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *
                                             */
                                            public void setPhoneNumber(String value) {
                                                this.phoneNumber = value;
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
                                     *         &lt;element name="GivenName">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *               &lt;enumeration value="Clark"/>
                                     *               &lt;enumeration value="Jerry"/>
                                     *             &lt;/restriction>
                                     *           &lt;/simpleType>
                                     *         &lt;/element>
                                     *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                     *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *       &lt;/sequence>
                                     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}byte" />
                                     *       &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" />
                                     *     &lt;/restriction>
                                     *   &lt;/complexContent>
                                     * &lt;/complexType>
                                     * </pre>
                                     *
                                     *
                                     */
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                            "givenName",
                                            "middleName",
                                            "surname"
                                    })
                                    public static class PersonName {

                                        @XmlElement(name = "GivenName", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                        protected String givenName;
                                        @XmlElement(name = "MiddleName", namespace = "http://www.opentravel.org/OTA/2003/05")
                                        protected String middleName;
                                        @XmlElement(name = "Surname", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                        protected String surname;
                                        @XmlAttribute(name = "AgeQualifyingCode")
                                        protected Byte ageQualifyingCode;
                                        @XmlAttribute(name = "Gender")
                                        protected String gender;
                                        @XmlAttribute(name = "Age")
                                        protected Byte age;

                                        /**
                                         * Gets the value of the givenName property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *
                                         */
                                        public String getGivenName() {
                                            return givenName;
                                        }

                                        /**
                                         * Sets the value of the givenName property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *
                                         */
                                        public void setGivenName(String value) {
                                            this.givenName = value;
                                        }

                                        /**
                                         * Gets the value of the middleName property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *
                                         */
                                        public String getMiddleName() {
                                            return middleName;
                                        }

                                        /**
                                         * Sets the value of the middleName property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *
                                         */
                                        public void setMiddleName(String value) {
                                            this.middleName = value;
                                        }

                                        /**
                                         * Gets the value of the surname property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *
                                         */
                                        public String getSurname() {
                                            return surname;
                                        }

                                        /**
                                         * Sets the value of the surname property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *
                                         */
                                        public void setSurname(String value) {
                                            this.surname = value;
                                        }

                                        /**
                                         * Gets the value of the ageQualifyingCode property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link Byte }
                                         *
                                         */
                                        public Byte getAgeQualifyingCode() {
                                            return ageQualifyingCode;
                                        }

                                        /**
                                         * Sets the value of the ageQualifyingCode property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link Byte }
                                         *
                                         */
                                        public void setAgeQualifyingCode(Byte value) {
                                            this.ageQualifyingCode = value;
                                        }

                                        /**
                                         * Gets the value of the gender property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *
                                         */
                                        public String getGender() {
                                            return gender;
                                        }

                                        /**
                                         * Sets the value of the gender property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *
                                         */
                                        public void setGender(String value) {
                                            this.gender = value;
                                        }

                                        /**
                                         * Gets the value of the age property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link Byte }
                                         *
                                         */
                                        public Byte getAge() {
                                            return age;
                                        }

                                        /**
                                         * Sets the value of the age property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link Byte }
                                         *
                                         */
                                        public void setAge(Byte value) {
                                            this.age = value;
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
             *         &lt;element name="RoomStay">
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
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
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
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                         &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                                     &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
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
             *                                                               &lt;simpleContent>
             *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                   &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                   &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                 &lt;/extension>
             *                                                               &lt;/simpleContent>
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
             *                                     &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                                     &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
                    "roomStay"
            })
            public static class RoomStays {

                @XmlElement(name = "RoomStay", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay roomStay;

                /**
                 * Gets the value of the roomStay property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay }
                 *
                 */
                public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay getRoomStay() {
                    return roomStay;
                }

                /**
                 * Sets the value of the roomStay property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay }
                 *
                 */
                public void setRoomStay(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay value) {
                    this.roomStay = value;
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
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
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
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                               &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *                           &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                 *                                                     &lt;simpleContent>
                 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                         &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                         &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                       &lt;/extension>
                 *                                                     &lt;/simpleContent>
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
                 *                           &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                           &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                        "roomTypes",
                        "ratePlans",
                        "roomRates",
                        "basicPropertyInfo"
                })
                public static class RoomStay {

                    @XmlElement(name = "RoomTypes", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes roomTypes;
                    @XmlElement(name = "RatePlans", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans ratePlans;
                    @XmlElement(name = "RoomRates", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates roomRates;
                    @XmlElement(name = "BasicPropertyInfo", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                    protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.BasicPropertyInfo basicPropertyInfo;

                    /**
                     * Gets the value of the roomTypes property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes getRoomTypes() {
                        return roomTypes;
                    }

                    /**
                     * Sets the value of the roomTypes property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes }
                     *
                     */
                    public void setRoomTypes(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes value) {
                        this.roomTypes = value;
                    }

                    /**
                     * Gets the value of the ratePlans property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans getRatePlans() {
                        return ratePlans;
                    }

                    /**
                     * Sets the value of the ratePlans property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans }
                     *
                     */
                    public void setRatePlans(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans value) {
                        this.ratePlans = value;
                    }

                    /**
                     * Gets the value of the roomRates property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates getRoomRates() {
                        return roomRates;
                    }

                    /**
                     * Sets the value of the roomRates property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates }
                     *
                     */
                    public void setRoomRates(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates value) {
                        this.roomRates = value;
                    }

                    /**
                     * Gets the value of the basicPropertyInfo property.
                     *
                     * @return
                     *     possible object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.BasicPropertyInfo }
                     *
                     */
                    public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.BasicPropertyInfo getBasicPropertyInfo() {
                        return basicPropertyInfo;
                    }

                    /**
                     * Sets the value of the basicPropertyInfo property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.BasicPropertyInfo }
                     *
                     */
                    public void setBasicPropertyInfo(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.BasicPropertyInfo value) {
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
                        protected String hotelCode;
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
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                     &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                     *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                        protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan ratePlan;

                        /**
                         * Gets the value of the ratePlan property.
                         *
                         * @return
                         *     possible object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan }
                         *
                         */
                        public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan getRatePlan() {
                            return ratePlan;
                        }

                        /**
                         * Sets the value of the ratePlan property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan }
                         *
                         */
                        public void setRatePlan(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan value) {
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
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                           &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                         *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                                "ratePlanDescription"
                        })
                        public static class RatePlan {

                            @XmlElement(name = "RatePlanDescription", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                            protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription ratePlanDescription;
                            @XmlAttribute(name = "RatePlanCode")
                            protected String ratePlanCode;
                            @XmlAttribute(name = "PrepaidIndicator")
                            protected String prepaidIndicator;

                            /**
                             * Gets the value of the ratePlanDescription property.
                             *
                             * @return
                             *     possible object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription }
                             *
                             */
                            public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription getRatePlanDescription() {
                                return ratePlanDescription;
                            }

                            /**
                             * Sets the value of the ratePlanDescription property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription }
                             *
                             */
                            public void setRatePlanDescription(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription value) {
                                this.ratePlanDescription = value;
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
                             *         &lt;element name="Text">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                    "text"
                            })
                            public static class RatePlanDescription {

                                @XmlElement(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription.Text text;

                                /**
                                 * Gets the value of the text property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription.Text }
                                 *
                                 */
                                public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription.Text getText() {
                                    return text;
                                }

                                /**
                                 * Sets the value of the text property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription.Text }
                                 *
                                 */
                                public void setText(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RatePlans.RatePlan.RatePlanDescription.Text value) {
                                    this.text = value;
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
                                 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *       &lt;attribute name="TextFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                public static class Text {

                                    @XmlValue
                                    protected String value;
                                    @XmlAttribute(name = "Language")
                                    protected String language;
                                    @XmlAttribute(name = "TextFormat")
                                    protected String textFormat;

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
                                     * Gets the value of the language property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *
                                     */
                                    public String getLanguage() {
                                        return language;
                                    }

                                    /**
                                     * Sets the value of the language property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *
                                     */
                                    public void setLanguage(String value) {
                                        this.language = value;
                                    }

                                    /**
                                     * Gets the value of the textFormat property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *
                                     */
                                    public String getTextFormat() {
                                        return textFormat;
                                    }

                                    /**
                                     * Sets the value of the textFormat property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *
                                     */
                                    public void setTextFormat(String value) {
                                        this.textFormat = value;
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
                     *                                           &lt;simpleContent>
                     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                               &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                               &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                             &lt;/extension>
                     *                                           &lt;/simpleContent>
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
                     *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *                 &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                        protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate roomRate;

                        /**
                         * Gets the value of the roomRate property.
                         *
                         * @return
                         *     possible object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate }
                         *
                         */
                        public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate getRoomRate() {
                            return roomRate;
                        }

                        /**
                         * Sets the value of the roomRate property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate }
                         *
                         */
                        public void setRoomRate(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate value) {
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
                         *                                 &lt;simpleContent>
                         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                     &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                     &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                   &lt;/extension>
                         *                                 &lt;/simpleContent>
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
                         *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}short" />
                         *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                            protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates rates;
                            @XmlAttribute(name = "RatePlanCode")
                            protected String ratePlanCode;
                            @XmlAttribute(name = "RatePlanCategory")
                            protected Byte ratePlanCategory;
                            @XmlAttribute(name = "NumberOfUnits")
                            protected Byte numberOfUnits;

                            /**
                             * Gets the value of the rates property.
                             *
                             * @return
                             *     possible object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates }
                             *
                             */
                            public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates getRates() {
                                return rates;
                            }

                            /**
                             * Sets the value of the rates property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates }
                             *
                             */
                            public void setRates(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates value) {
                                this.rates = value;
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
                             *     {@link Byte }
                             *
                             */
                            public Byte getRatePlanCategory() {
                                return ratePlanCategory;
                            }

                            /**
                             * Sets the value of the ratePlanCategory property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Byte }
                             *
                             */
                            public void setRatePlanCategory(Byte value) {
                                this.ratePlanCategory = value;
                            }

                            /**
                             * Gets the value of the numberOfUnits property.
                             *
                             * @return
                             *     possible object is
                             *     {@link Byte }
                             *
                             */
                            public Byte getNumberOfUnits() {
                                return numberOfUnits;
                            }

                            /**
                             * Sets the value of the numberOfUnits property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Byte }
                             *
                             */
                            public void setNumberOfUnits(Byte value) {
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
                             *         &lt;element name="Rate">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="Base">
                             *                     &lt;complexType>
                             *                       &lt;simpleContent>
                             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                           &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                           &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                         &lt;/extension>
                             *                       &lt;/simpleContent>
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
                                protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate rate;

                                /**
                                 * Gets the value of the rate property.
                                 *
                                 * @return
                                 *     possible object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate }
                                 *
                                 */
                                public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate getRate() {
                                    return rate;
                                }

                                /**
                                 * Sets the value of the rate property.
                                 *
                                 * @param value
                                 *     allowed object is
                                 *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate }
                                 *
                                 */
                                public void setRate(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate value) {
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
                                 *             &lt;simpleContent>
                                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *               &lt;/extension>
                                 *             &lt;/simpleContent>
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
                                        "base"
                                })
                                public static class Rate {

                                    @XmlElement(name = "Base", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                                    protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base base;
                                    @XmlAttribute(name = "EffectiveDate")
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar effectiveDate;
                                    @XmlAttribute(name = "ExpireDate")
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar expireDate;

                                    /**
                                     * Gets the value of the base property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base }
                                     *
                                     */
                                    public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base getBase() {
                                        return base;
                                    }

                                    /**
                                     * Sets the value of the base property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base }
                                     *
                                     */
                                    public void setBase(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base value) {
                                        this.base = value;
                                    }

                                    /**
                                     * Gets the value of the effectiveDate property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link XMLGregorianCalendar }
                                     *
                                     */
                                    public XMLGregorianCalendar getEffectiveDate() {
                                        return effectiveDate;
                                    }

                                    /**
                                     * Sets the value of the effectiveDate property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link XMLGregorianCalendar }
                                     *
                                     */
                                    public void setEffectiveDate(XMLGregorianCalendar value) {
                                        this.effectiveDate = value;
                                    }

                                    /**
                                     * Gets the value of the expireDate property.
                                     *
                                     * @return
                                     *     possible object is
                                     *     {@link XMLGregorianCalendar }
                                     *
                                     */
                                    public XMLGregorianCalendar getExpireDate() {
                                        return expireDate;
                                    }

                                    /**
                                     * Sets the value of the expireDate property.
                                     *
                                     * @param value
                                     *     allowed object is
                                     *     {@link XMLGregorianCalendar }
                                     *
                                     */
                                    public void setExpireDate(XMLGregorianCalendar value) {
                                        this.expireDate = value;
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
                                     *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
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
                                    public static class Base {

                                        @XmlValue
                                        protected String value;
                                        @XmlAttribute(name = "AmountBeforeTax")
                                        protected Float amountBeforeTax;
                                        @XmlAttribute(name = "AmountAfterTax")
                                        protected Float amountAfterTax;
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
                                         *     {@link Float }
                                         *
                                         */
                                        public Float getAmountBeforeTax() {
                                            return amountBeforeTax;
                                        }

                                        /**
                                         * Sets the value of the amountBeforeTax property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link Float }
                                         *
                                         */
                                        public void setAmountBeforeTax(Float value) {
                                            this.amountBeforeTax = value;
                                        }

                                        /**
                                         * Gets the value of the amountAfterTax property.
                                         *
                                         * @return
                                         *     possible object is
                                         *     {@link Float }
                                         *
                                         */
                                        public Float getAmountAfterTax() {
                                            return amountAfterTax;
                                        }

                                        /**
                                         * Sets the value of the amountAfterTax property.
                                         *
                                         * @param value
                                         *     allowed object is
                                         *     {@link Float }
                                         *
                                         */
                                        public void setAmountAfterTax(Float value) {
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
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "roomType"
                    })
                    public static class RoomTypes {

                        @XmlElement(name = "RoomType", namespace = "http://www.opentravel.org/OTA/2003/05", required = true)
                        protected OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType roomType;

                        /**
                         * Gets the value of the roomType property.
                         *
                         * @return
                         *     possible object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType }
                         *
                         */
                        public OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType getRoomType() {
                            return roomType;
                        }

                        /**
                         * Sets the value of the roomType property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType }
                         *
                         */
                        public void setRoomType(OTAHotelResRQ.HotelReservations.HotelReservation.RoomStays.RoomStay.RoomTypes.RoomType value) {
                            this.roomType = value;
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
                         *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        public static class RoomType {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "RoomTypeCode")
                            protected String roomTypeCode;

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
     *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
        protected OTAHotelResRQ.POS.Source source;

        /**
         * Gets the value of the source property.
         *
         * @return
         *     possible object is
         *     {@link OTAHotelResRQ.POS.Source }
         *
         */
        public OTAHotelResRQ.POS.Source getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         *
         * @param value
         *     allowed object is
         *     {@link OTAHotelResRQ.POS.Source }
         *
         */
        public void setSource(OTAHotelResRQ.POS.Source value) {
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
         *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
            protected OTAHotelResRQ.POS.Source.RequestorID requestorID;

            /**
             * Gets the value of the requestorID property.
             *
             * @return
             *     possible object is
             *     {@link OTAHotelResRQ.POS.Source.RequestorID }
             *
             */
            public OTAHotelResRQ.POS.Source.RequestorID getRequestorID() {
                return requestorID;
            }

            /**
             * Sets the value of the requestorID property.
             *
             * @param value
             *     allowed object is
             *     {@link OTAHotelResRQ.POS.Source.RequestorID }
             *
             */
            public void setRequestorID(OTAHotelResRQ.POS.Source.RequestorID value) {
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
             *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                protected OTAHotelResRQ.POS.Source.RequestorID.CompanyName companyName;
                @XmlAttribute(name = "ID")
                protected String id;
                @XmlAttribute(name = "MessagePassword")
                protected String messagePassword;
                @XmlAttribute(name = "Type")
                protected Byte type;

                /**
                 * Gets the value of the companyName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link OTAHotelResRQ.POS.Source.RequestorID.CompanyName }
                 *
                 */
                public OTAHotelResRQ.POS.Source.RequestorID.CompanyName getCompanyName() {
                    return companyName;
                }

                /**
                 * Sets the value of the companyName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelResRQ.POS.Source.RequestorID.CompanyName }
                 *
                 */
                public void setCompanyName(OTAHotelResRQ.POS.Source.RequestorID.CompanyName value) {
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
                 *     {@link Byte }
                 *
                 */
                public Byte getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *
                 */
                public void setType(Byte value) {
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
                    protected Short codeContext;

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
                    public Short getCodeContext() {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}short" />
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
    public static class UniqueID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "Type")
        protected String type;

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
    }
}
