package com.example.newdocument202302.dto;

public class User {
        // 柜子
        private Cabinet cabinet;

        // 存储的数字
        private int storeNumber;

    public User(Cabinet cabinet, int storeNumber) {
            this.cabinet = cabinet;
            this.storeNumber = storeNumber;

        }
        // 表示使用柜子
        public void useCabinet(){
            cabinet.setStoreNumber(storeNumber);
        }


}
