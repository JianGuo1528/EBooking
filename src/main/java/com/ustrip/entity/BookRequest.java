package com.ustrip.entity;

import java.util.List;

public class BookRequest {
    /**
     * auth : {"username":"arthur.test@gmail.com","password":"gJPZXA2NqMGv7m8CF3Gk5GBfl2DQQvb7"}
     * data : {"ipAddress":"1.1.1.1","rooms":[{"roomReference":"eb:c22d1339ec594ab8bd8a8147db2ab3231","paxes":[{"type":"AD","name":"WANYING","surname":"FU"}]}],"booker":{"firstname":"Liu","lastname":"Vincent","email":"privatetour@ctourholiday.com","phone":"3234970561"},"clientReference":"117 Book"}
     */

    private AuthBean auth;
    private DataBean data;

    public AuthBean getAuth() {
        return auth;
    }

    public void setAuth(AuthBean auth) {
        this.auth = auth;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class AuthBean {
        /**
         * username : arthur.test@gmail.com
         * password : gJPZXA2NqMGv7m8CF3Gk5GBfl2DQQvb7
         */

        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class DataBean {
        /**
         * ipAddress : 1.1.1.1
         * rooms : [{"roomReference":"eb:c22d1339ec594ab8bd8a8147db2ab3231","paxes":[{"type":"AD","name":"WANYING","surname":"FU"}]}]
         * booker : {"firstname":"Liu","lastname":"Vincent","email":"privatetour@ctourholiday.com","phone":"3234970561"}
         * clientReference : 117 Book
         */

        private String ipAddress;
        private BookerBean booker;
        private String clientReference;
        private List<RoomsBean> rooms;

        public String getIpAddress() {
            return ipAddress;
        }

        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        public BookerBean getBooker() {
            return booker;
        }

        public void setBooker(BookerBean booker) {
            this.booker = booker;
        }

        public String getClientReference() {
            return clientReference;
        }

        public void setClientReference(String clientReference) {
            this.clientReference = clientReference;
        }

        public List<RoomsBean> getRooms() {
            return rooms;
        }

        public void setRooms(List<RoomsBean> rooms) {
            this.rooms = rooms;
        }

        public static class BookerBean {
            /**
             * firstname : Liu
             * lastname : Vincent
             * email : privatetour@ctourholiday.com
             * phone : 3234970561
             */

            private String firstname;
            private String lastname;
            private String email;
            private String phone;

            public String getFirstname() {
                return firstname;
            }

            public void setFirstname(String firstname) {
                this.firstname = firstname;
            }

            public String getLastname() {
                return lastname;
            }

            public void setLastname(String lastname) {
                this.lastname = lastname;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }
        }

        public static class RoomsBean {
            /**
             * roomReference : eb:c22d1339ec594ab8bd8a8147db2ab3231
             * paxes : [{"type":"AD","name":"WANYING","surname":"FU"}]
             */

            private String roomReference;
            private List<PaxesBean> paxes;

            public String getRoomReference() {
                return roomReference;
            }

            public void setRoomReference(String roomReference) {
                this.roomReference = roomReference;
            }

            public List<PaxesBean> getPaxes() {
                return paxes;
            }

            public void setPaxes(List<PaxesBean> paxes) {
                this.paxes = paxes;
            }

            public static class PaxesBean {
                /**
                 * type : AD
                 * name : WANYING
                 * surname : FU
                 */

                private String type;
                private String name;
                private String surname;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSurname() {
                    return surname;
                }

                public void setSurname(String surname) {
                    this.surname = surname;
                }
            }
        }
    }
}
