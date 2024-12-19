package com.cuvette.bankapplication.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Branch {

    private String branchName;
    private String branchAddress;

    public Branch(String branchName, String branchAddress) {
        this.branchName = branchName;
        this.branchAddress = branchAddress;
    }

}
