package com.example.newdocument202302.dto;

public class Cabinet {

        //表示柜子中存放的数字
        private int storeNumber;

    public int getStoreNumber() {
            return storeNumber;
        }

        public synchronized void setStoreNumber(int storeNumber) {
            this.storeNumber = storeNumber;
        }

}
