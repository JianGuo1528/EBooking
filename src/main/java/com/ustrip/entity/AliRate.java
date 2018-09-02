package com.ustrip.entity;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AliRate {
    /**
     * out_rid : ABCDE_123
     * rateplan_code : ABCDE_WHL01
     * vendor :
     * lock_start_time :
     * lock_end_time :
     * data : {"use_room_inventory":false,"inventory_price":[{"date":"2013-11-18","quota":1,"price":1000,"status":1},{"date":"2013-11-19","quota":1,"price":1000,"status":0}]}
     */

    private String out_rid;
    private String rateplan_code;
    private String vendor;
    private String lock_start_time;
    private String lock_end_time;
    private DataBean data;

    public String getOut_rid() {
        return out_rid;
    }

    public void setOut_rid(String out_rid) {
        this.out_rid = out_rid;
    }

    public String getRateplan_code() {
        return rateplan_code;
    }

    public void setRateplan_code(String rateplan_code) {
        this.rateplan_code = rateplan_code;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getLock_start_time() {
        return lock_start_time;
    }

    public void setLock_start_time(String lock_start_time) {
        this.lock_start_time = lock_start_time;
    }

    public String getLock_end_time() {
        return lock_end_time;
    }

    public void setLock_end_time(String lock_end_time) {
        this.lock_end_time = lock_end_time;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    public static class DataBean {
        /**
         * use_room_inventory : false
         * inventory_price : [{"date":"2013-11-18","quota":1,"price":1000,"status":1},{"date":"2013-11-19","quota":1,"price":1000,"status":0}]
         */

        private boolean use_room_inventory;
        private List<InventoryPriceBean> inventory_price;

        public boolean isUse_room_inventory() {
            return use_room_inventory;
        }

        public void setUse_room_inventory(boolean use_room_inventory) {
            this.use_room_inventory = use_room_inventory;
        }

        public List<InventoryPriceBean> getInventory_price() {
            return inventory_price;
        }

        public void setInventory_price(List<InventoryPriceBean> inventory_price) {
            this.inventory_price = inventory_price;
        }

        @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
        public static class InventoryPriceBean {
            /**
             * date : 2013-11-18
             * quota : 1
             * price : 1000
             * status : 1
             */

            private String date;
            private int quota;
            private int price;
            private int status;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getQuota() {
                return quota;
            }

            public void setQuota(int quota) {
                this.quota = quota;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }
    }
}
