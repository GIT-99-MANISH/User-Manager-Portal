package com.myproj.userManagementSystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.myproj.userManagementSystem.entity.OurUsers;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {
     private int statusCode;
     private String error;
     private String message;
     private String token;
     private String refreshToken;
     private String expirationTime;
     private String name;
     private String city;
     private String role;
     private String email;
     private String password;
     private OurUsers ourUsers;
     private List<OurUsers> ourUsersList;

     public ReqRes() {
     }

     public ReqRes(int statusCode, String error, String message, String token, String refreshToken, String expirationTime, String name, String role, String city, String password, String email, OurUsers ourUsers, List<OurUsers> ourUsersList) {
          this.statusCode = statusCode;
          this.error = error;
          this.message = message;
          this.token = token;
          this.refreshToken = refreshToken;
          this.expirationTime = expirationTime;
          this.name = name;
          this.role = role;
          this.city = city;
          this.password = password;
          this.email = email;
          this.ourUsers = ourUsers;
          this.ourUsersList = ourUsersList;
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

     public String getError() {
          return error;
     }

     public void setError(String error) {
          this.error = error;
     }

     public String getToken() {
          return token;
     }

     public void setToken(String token) {
          this.token = token;
     }

     public String getRefreshToken() {
          return refreshToken;
     }

     public void setRefreshToken(String refreshToken) {
          this.refreshToken = refreshToken;
     }

     public String getExpirationTime() {
          return expirationTime;
     }

     public void setExpirationTime(String expirationTime) {
          this.expirationTime = expirationTime;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getRole() {
          return role;
     }

     public void setRole(String role) {
          this.role = role;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public OurUsers getOurUsers() {
          return ourUsers;
     }

     public void setOurUsers(OurUsers ourUsers) {
          this.ourUsers = ourUsers;
     }

     public List<OurUsers> getOurUsersList() {
          return ourUsersList;
     }

     public void setOurUsersList(List<OurUsers> ourUsersList) {
          this.ourUsersList = ourUsersList;
     }

     @Override
     public String toString() {
          return "ReqRes{" +
                  "statusCode=" + statusCode +
                  ", error='" + error + '\'' +
                  ", message='" + message + '\'' +
                  ", token='" + token + '\'' +
                  ", refreshToken='" + refreshToken + '\'' +
                  ", expirationTime='" + expirationTime + '\'' +
                  ", name='" + name + '\'' +
                  ", city='" + city + '\'' +
                  ", role='" + role + '\'' +
                  ", email='" + email + '\'' +
                  ", password='" + password + '\'' +
                  ", ourUsers=" + ourUsers +
                  ", ourUsersList=" + ourUsersList +
                  '}';
     }










}
