package ru.mirea.trpp_second_5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/** Ответ на healthCheck. */
@Getter
@Setter
@AllArgsConstructor
public class HealthResponse {

    /** Статус работы. */
    private String status;

    public HealthResponse(String status) {
        this.status = status;
    }

}
