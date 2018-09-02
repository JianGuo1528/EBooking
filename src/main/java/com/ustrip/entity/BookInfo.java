package com.ustrip.entity;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BookInfo implements Serializable {
    private static final long serialVersionUID = 2411538658351726092L;
    /**
     * roomTypeCode : 1
     * roomNumber : 3
     * checkInStr : 2018-06-12
     * boardCode :
     * roomCode : 102576
     * ratePlanCode : 1
     * paxes : 2AD0CH
     * totalTaxCurrency : USD
     * RateClass : 可取消
     * dayNumber : 5
     * roomType : Standard 2 Queen Beds
     * cancellationDate : 2018-09-17T00:00:00Z
     * checkOutStr : 2018-06-13
     * comments : []
     * roomNo : 176036
     * childrenQty : 0
     * childAge : 6
     * totalCurrency : USD
     * roomReference : b:99d31b89acda44ef88fbe050f710ed30011
     * bedTypeCode : 4
     * hotelName : Universal's Loews Royal Pacific Resort
     * caculatedTotalPrice : 477
     * boardName : Room Only
     * totalAmount : 453.74
     * hotelPid : 164
     * totalTaxAmount : 0
     * adultsQty : 2
     * cancellationPolicy : {"amount":0,"end":"2018-09-17T00:00:00Z"}
     * bedType : Double (Family Plan)
     * planId : 1
     * availability : [{"date":"2018-06-12","countract":{"price":125,"roomNumber":3},"supplement":{"price":120,"roomNumber":2}}]
     */

    private Integer roomTypeCode;
    private Integer roomNumber;
    private String checkInStr;

    private String boardCode;
    private Integer roomCode;
    private Integer ratePlanCode;

    private String paxes;
    private String totalTaxCurrency;
    private String RateClass;

    private Integer dayNumber;
    private String roomType;
    private String cancellationDate;

    private String checkOutStr;
    private Integer roomNo;
    private Integer childrenQty;

    private Integer childAge;
    private String totalCurrency;
    private String roomReference;

    private Integer bedTypeCode;
    private String hotelName;
    private Double caculatedTotalPrice;

    private String boardName;
    private Double totalAmount;
    private Integer hotelPid;

    private Double totalTaxAmount;
    private Integer adultsQty;
    private CancellationPolicyBean cancellationPolicy;

    private String bedType;
    private Integer planId;
    private List<?> comments;
    private List<AvailabilityBean> availability;

    public String getPaxNames() {
        return paxNames;
    }

    public void setPaxNames(String paxNames) {
        this.paxNames = paxNames;
    }

    private String paxNames;

    public Integer getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(Integer roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCheckInStr() {
        return checkInStr;
    }

    public void setCheckInStr(String checkInStr) {
        this.checkInStr = checkInStr;
    }

    public String getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(String boardCode) {
        this.boardCode = boardCode;
    }

    public Integer getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(Integer roomCode) {
        this.roomCode = roomCode;
    }

    public Integer getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(Integer ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    public String getPaxes() {
        return paxes;
    }

    public void setPaxes(String paxes) {
        this.paxes = paxes;
    }

    public String getTotalTaxCurrency() {
        return totalTaxCurrency;
    }

    public void setTotalTaxCurrency(String totalTaxCurrency) {
        this.totalTaxCurrency = totalTaxCurrency;
    }

    public String getRateClass() {
        return RateClass;
    }

    public void setRateClass(String RateClass) {
        this.RateClass = RateClass;
    }

    public Integer getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getCheckOutStr() {
        return checkOutStr;
    }

    public void setCheckOutStr(String checkOutStr) {
        this.checkOutStr = checkOutStr;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public Integer getChildrenQty() {
        return childrenQty;
    }

    public void setChildrenQty(Integer childrenQty) {
        this.childrenQty = childrenQty;
    }

    public Integer getChildAge() {
        return childAge;
    }

    public void setChildAge(Integer childAge) {
        this.childAge = childAge;
    }

    public String getTotalCurrency() {
        return totalCurrency;
    }

    public void setTotalCurrency(String totalCurrency) {
        this.totalCurrency = totalCurrency;
    }

    public String getRoomReference() {
        return roomReference;
    }

    public void setRoomReference(String roomReference) {
        this.roomReference = roomReference;
    }

    public Integer getBedTypeCode() {
        return bedTypeCode;
    }

    public void setBedTypeCode(Integer bedTypeCode) {
        this.bedTypeCode = bedTypeCode;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Double getCaculatedTotalPrice() {
        return caculatedTotalPrice;
    }

    public void setCaculatedTotalPrice(Double caculatedTotalPrice) {
        this.caculatedTotalPrice = caculatedTotalPrice;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getHotelPid() {
        return hotelPid;
    }

    public void setHotelPid(Integer hotelPid) {
        this.hotelPid = hotelPid;
    }

    public Double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(Double totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public Integer getAdultsQty() {
        return adultsQty;
    }

    public void setAdultsQty(Integer adultsQty) {
        this.adultsQty = adultsQty;
    }

    public CancellationPolicyBean getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(CancellationPolicyBean cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public List<?> getComments() {
        return comments;
    }

    public void setComments(List<?> comments) {
        this.comments = comments;
    }

    public List<AvailabilityBean> getAvailability() {
        return availability;
    }

    public void setAvailability(List<AvailabilityBean> availability) {
        this.availability = availability;
    }

    public static class CancellationPolicyBean {
        /**
         * amount : 0
         * end : 2018-09-17T00:00:00Z
         */

        private Integer amount;
        private String end;

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }
    }

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    public static class AvailabilityBean {
        /**
         * date : 2018-06-12
         * contract : {"price":125,"roomNumber":3}
         * supplement : {"price":120,"roomNumber":2}
         */

        private String date;
        private ContractBean contract;
        private SupplementBean supplement;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public ContractBean getContract() {
            return contract;
        }

        public void setContract(ContractBean contract) {
            this.contract = contract;
        }

        public SupplementBean getSupplement() {
            return supplement;
        }

        public void setSupplement(SupplementBean supplement) {
            this.supplement = supplement;
        }

        public static class ContractBean {
            /**
             * price : 125
             * roomNumber : 3
             */

            private Double price;
            private Integer roomNumber;

            public Double getPrice() {
                return price;
            }

            public void setPrice(Double price) {
                this.price = price;
            }

            public Integer getRoomNumber() {
                return roomNumber;
            }

            public void setRoomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
            }
        }

        public static class SupplementBean {
            /**
             * price : 120
             * roomNumber : 2
             */

            private Double price;
            private Integer roomNumber;

            public Double getPrice() {
                return price;
            }

            public void setPrice(Double price) {
                this.price = price;
            }

            public Integer getRoomNumber() {
                return roomNumber;
            }

            public void setRoomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
            }
        }
    }

    public int getKey() {
        return Objects.hash(getRoomNumber(), getCheckInStr(), getRatePlanCode(), getPaxes(), getCheckOutStr(), getPlanId(), getPaxNames());
    }
}
