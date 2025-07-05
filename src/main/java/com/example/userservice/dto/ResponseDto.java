package com.example.userservice.dto;

import java.time.LocalDateTime;

public class ResponseDto<T> {
        private boolean success;
        private String message;
        private int statusCode;
        private LocalDateTime timestamp;
        private T data;

        public boolean isSuccess() {
                return success;
        }

        public void setSuccess(boolean success) {
                this.success = success;
        }

        public String getMessage() {
                return message;
        }

        public void setMessage(String message) {
                this.message = message;
        }

        public int getStatusCode() {
                return statusCode;
        }

        public void setStatusCode(int statusCode) {
                this.statusCode = statusCode;
        }

        public LocalDateTime getTimestamp() {
                return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
                this.timestamp = timestamp;
        }

        public T getData() {
                return data;
        }

        public void setData(T data) {
                this.data = data;
        }
}
