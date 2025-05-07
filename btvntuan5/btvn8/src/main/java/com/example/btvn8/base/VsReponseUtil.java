package com.example.btvn8.base;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class VsReponseUtil {
    public static ResponseEntity<RestData<?>> success(Object data){
        return success(HttpStatus.OK, data);
    }
    public static ResponseEntity<RestData<?>> success(HttpStatus status, Object data){
        RestData<?> response = new RestData<>(data);
        return new ResponseEntity<>(response, status);
    }

    public static ResponseEntity<RestData<?>> success(MultiValueMap<String,String> headers, Object data){
        return success(HttpStatus.OK, headers,data);
    }

    public static ResponseEntity<RestData<?>> success(HttpStatus status, MultiValueMap<String, String> header, Object data){
        RestData<?> response = new RestData<>(data);
        HttpHeaders headers = new HttpHeaders();
        headers.addAll(header);
        return ResponseEntity.ok().headers(headers).body(response);
    }

    public static ResponseEntity<RestData<?>> error(HttpStatus status, HttpHeaders headers, Object message){
        RestData<?> response = RestData.error(message);
        return new ResponseEntity<>(response, status);
    }

}
