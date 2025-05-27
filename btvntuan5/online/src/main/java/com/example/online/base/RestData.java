package com.example.online.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestData <T>{
    private RestStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public RestData(T data) {
        this.status = RestStatus.SUCCESS;
        this.data = data;
    }

    public static RestData<?> error(Object message){
        return new RestData(RestStatus.ERROR, message, null);
    }
}
