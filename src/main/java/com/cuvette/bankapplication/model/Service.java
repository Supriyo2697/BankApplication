package com.cuvette.bankapplication.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Service {

    private String bankName;
    private String description;

    public Service(String bankName, String description) {
        this.bankName = bankName;
        this.description = description;
    }
}
