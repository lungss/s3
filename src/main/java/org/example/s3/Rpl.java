
package org.example.s3;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reqTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rplTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="epfAccount"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="totalBalance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="account1Balance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="account2Balance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="epfProfile"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="epfNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="epfMembershipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="iAkaunMembershipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="iAkaunStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="investment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="totalCurrentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="totalUnrealisedValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fundName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="totalInvestment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="totalUnits" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="unitNav" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="currentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="unrealisedValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="unrealisedValuePercentage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="employeeProfile"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="employeeNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="employmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refId",
    "reqTime",
    "rplTime",
    "epfAccount",
    "epfProfile",
    "investment",
    "employeeProfile"
})
@XmlRootElement(name = "rpl")
public class Rpl {

    @XmlElement(required = true)
    protected String refId;
    @XmlElement(required = true)
    protected String reqTime;
    @XmlElement(required = true)
    protected String rplTime;
    @XmlElement(required = true)
    protected Rpl.EpfAccount epfAccount;
    @XmlElement(required = true)
    protected Rpl.EpfProfile epfProfile;
    @XmlElement(required = true)
    protected Rpl.Investment investment;
    @XmlElement(required = true)
    protected Rpl.EmployeeProfile employeeProfile;

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the reqTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqTime() {
        return reqTime;
    }

    /**
     * Sets the value of the reqTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqTime(String value) {
        this.reqTime = value;
    }

    /**
     * Gets the value of the rplTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRplTime() {
        return rplTime;
    }

    /**
     * Sets the value of the rplTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRplTime(String value) {
        this.rplTime = value;
    }

    /**
     * Gets the value of the epfAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Rpl.EpfAccount }
     *     
     */
    public Rpl.EpfAccount getEpfAccount() {
        return epfAccount;
    }

    /**
     * Sets the value of the epfAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rpl.EpfAccount }
     *     
     */
    public void setEpfAccount(Rpl.EpfAccount value) {
        this.epfAccount = value;
    }

    /**
     * Gets the value of the epfProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Rpl.EpfProfile }
     *     
     */
    public Rpl.EpfProfile getEpfProfile() {
        return epfProfile;
    }

    /**
     * Sets the value of the epfProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rpl.EpfProfile }
     *     
     */
    public void setEpfProfile(Rpl.EpfProfile value) {
        this.epfProfile = value;
    }

    /**
     * Gets the value of the investment property.
     * 
     * @return
     *     possible object is
     *     {@link Rpl.Investment }
     *     
     */
    public Rpl.Investment getInvestment() {
        return investment;
    }

    /**
     * Sets the value of the investment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rpl.Investment }
     *     
     */
    public void setInvestment(Rpl.Investment value) {
        this.investment = value;
    }

    /**
     * Gets the value of the employeeProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Rpl.EmployeeProfile }
     *     
     */
    public Rpl.EmployeeProfile getEmployeeProfile() {
        return employeeProfile;
    }

    /**
     * Sets the value of the employeeProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rpl.EmployeeProfile }
     *     
     */
    public void setEmployeeProfile(Rpl.EmployeeProfile value) {
        this.employeeProfile = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="employeeNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="employmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "employeeNo",
        "idNo",
        "passportNo",
        "dob",
        "role",
        "employmentDate",
        "employmentStatus"
    })
    public static class EmployeeProfile {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String employeeNo;
        @XmlElement(required = true)
        protected String idNo;
        @XmlElement(required = true)
        protected String passportNo;
        @XmlElement(required = true)
        protected String dob;
        @XmlElement(required = true)
        protected String role;
        @XmlElement(required = true)
        protected String employmentDate;
        @XmlElement(required = true)
        protected String employmentStatus;

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
         * Gets the value of the employeeNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployeeNo() {
            return employeeNo;
        }

        /**
         * Sets the value of the employeeNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployeeNo(String value) {
            this.employeeNo = value;
        }

        /**
         * Gets the value of the idNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdNo() {
            return idNo;
        }

        /**
         * Sets the value of the idNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdNo(String value) {
            this.idNo = value;
        }

        /**
         * Gets the value of the passportNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassportNo() {
            return passportNo;
        }

        /**
         * Sets the value of the passportNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassportNo(String value) {
            this.passportNo = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDob() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDob(String value) {
            this.dob = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the employmentDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentDate() {
            return employmentDate;
        }

        /**
         * Sets the value of the employmentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentDate(String value) {
            this.employmentDate = value;
        }

        /**
         * Gets the value of the employmentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentStatus() {
            return employmentStatus;
        }

        /**
         * Sets the value of the employmentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentStatus(String value) {
            this.employmentStatus = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="totalBalance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="account1Balance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="account2Balance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalBalance",
        "account1Balance",
        "account2Balance"
    })
    public static class EpfAccount {

        @XmlElement(required = true)
        protected String totalBalance;
        @XmlElement(required = true)
        protected String account1Balance;
        @XmlElement(required = true)
        protected String account2Balance;

        /**
         * Gets the value of the totalBalance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalBalance() {
            return totalBalance;
        }

        /**
         * Sets the value of the totalBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalBalance(String value) {
            this.totalBalance = value;
        }

        /**
         * Gets the value of the account1Balance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccount1Balance() {
            return account1Balance;
        }

        /**
         * Sets the value of the account1Balance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccount1Balance(String value) {
            this.account1Balance = value;
        }

        /**
         * Gets the value of the account2Balance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccount2Balance() {
            return account2Balance;
        }

        /**
         * Sets the value of the account2Balance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccount2Balance(String value) {
            this.account2Balance = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="epfNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="epfMembershipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="iAkaunMembershipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="iAkaunStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "epfNo",
        "idNo",
        "passportNo",
        "dob",
        "race",
        "religion",
        "epfMembershipDate",
        "iAkaunMembershipDate",
        "iAkaunStatus"
    })
    public static class EpfProfile {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String epfNo;
        @XmlElement(required = true)
        protected String idNo;
        @XmlElement(required = true)
        protected String passportNo;
        @XmlElement(required = true)
        protected String dob;
        @XmlElement(required = true)
        protected String race;
        @XmlElement(required = true)
        protected String religion;
        @XmlElement(required = true)
        protected String epfMembershipDate;
        @XmlElement(required = true)
        protected String iAkaunMembershipDate;
        @XmlElement(required = true)
        protected String iAkaunStatus;

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
         * Gets the value of the epfNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEpfNo() {
            return epfNo;
        }

        /**
         * Sets the value of the epfNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEpfNo(String value) {
            this.epfNo = value;
        }

        /**
         * Gets the value of the idNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdNo() {
            return idNo;
        }

        /**
         * Sets the value of the idNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdNo(String value) {
            this.idNo = value;
        }

        /**
         * Gets the value of the passportNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassportNo() {
            return passportNo;
        }

        /**
         * Sets the value of the passportNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassportNo(String value) {
            this.passportNo = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDob() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDob(String value) {
            this.dob = value;
        }

        /**
         * Gets the value of the race property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRace() {
            return race;
        }

        /**
         * Sets the value of the race property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRace(String value) {
            this.race = value;
        }

        /**
         * Gets the value of the religion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReligion() {
            return religion;
        }

        /**
         * Sets the value of the religion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReligion(String value) {
            this.religion = value;
        }

        /**
         * Gets the value of the epfMembershipDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEpfMembershipDate() {
            return epfMembershipDate;
        }

        /**
         * Sets the value of the epfMembershipDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEpfMembershipDate(String value) {
            this.epfMembershipDate = value;
        }

        /**
         * Gets the value of the iAkaunMembershipDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIAkaunMembershipDate() {
            return iAkaunMembershipDate;
        }

        /**
         * Sets the value of the iAkaunMembershipDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIAkaunMembershipDate(String value) {
            this.iAkaunMembershipDate = value;
        }

        /**
         * Gets the value of the iAkaunStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIAkaunStatus() {
            return iAkaunStatus;
        }

        /**
         * Sets the value of the iAkaunStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIAkaunStatus(String value) {
            this.iAkaunStatus = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="totalCurrentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="totalUnrealisedValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fundName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="totalInvestment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="totalUnits" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="unitNav" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="currentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="unrealisedValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="unrealisedValuePercentage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalCurrentValue",
        "totalUnrealisedValue",
        "fundName",
        "totalInvestment",
        "totalUnits",
        "unitNav",
        "currentValue",
        "unrealisedValue",
        "unrealisedValuePercentage"
    })
    public static class Investment {

        @XmlElement(required = true)
        protected String totalCurrentValue;
        @XmlElement(required = true)
        protected String totalUnrealisedValue;
        @XmlElement(required = true)
        protected String fundName;
        @XmlElement(required = true)
        protected String totalInvestment;
        @XmlElement(required = true)
        protected String totalUnits;
        @XmlElement(required = true)
        protected String unitNav;
        @XmlElement(required = true)
        protected String currentValue;
        @XmlElement(required = true)
        protected String unrealisedValue;
        @XmlElement(required = true)
        protected String unrealisedValuePercentage;

        /**
         * Gets the value of the totalCurrentValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalCurrentValue() {
            return totalCurrentValue;
        }

        /**
         * Sets the value of the totalCurrentValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalCurrentValue(String value) {
            this.totalCurrentValue = value;
        }

        /**
         * Gets the value of the totalUnrealisedValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalUnrealisedValue() {
            return totalUnrealisedValue;
        }

        /**
         * Sets the value of the totalUnrealisedValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalUnrealisedValue(String value) {
            this.totalUnrealisedValue = value;
        }

        /**
         * Gets the value of the fundName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFundName() {
            return fundName;
        }

        /**
         * Sets the value of the fundName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFundName(String value) {
            this.fundName = value;
        }

        /**
         * Gets the value of the totalInvestment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalInvestment() {
            return totalInvestment;
        }

        /**
         * Sets the value of the totalInvestment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalInvestment(String value) {
            this.totalInvestment = value;
        }

        /**
         * Gets the value of the totalUnits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalUnits() {
            return totalUnits;
        }

        /**
         * Sets the value of the totalUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalUnits(String value) {
            this.totalUnits = value;
        }

        /**
         * Gets the value of the unitNav property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitNav() {
            return unitNav;
        }

        /**
         * Sets the value of the unitNav property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitNav(String value) {
            this.unitNav = value;
        }

        /**
         * Gets the value of the currentValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentValue() {
            return currentValue;
        }

        /**
         * Sets the value of the currentValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentValue(String value) {
            this.currentValue = value;
        }

        /**
         * Gets the value of the unrealisedValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnrealisedValue() {
            return unrealisedValue;
        }

        /**
         * Sets the value of the unrealisedValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnrealisedValue(String value) {
            this.unrealisedValue = value;
        }

        /**
         * Gets the value of the unrealisedValuePercentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnrealisedValuePercentage() {
            return unrealisedValuePercentage;
        }

        /**
         * Sets the value of the unrealisedValuePercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnrealisedValuePercentage(String value) {
            this.unrealisedValuePercentage = value;
        }

    }

}
