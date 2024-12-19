package com.cuvette.bankapplication.controller;

import com.cuvette.bankapplication.model.Service;
import com.cuvette.bankapplication.model.Branch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {   

    @GetMapping("/branches")
    public String getBranches(Model model) {
        List<Branch> branches =Arrays.asList(
                new Branch("MG Road Branch", "MG Road, Bangalore"),
                new Branch("Whitefield Branch", "Whitefield, Bangalore"),
                new Branch("Koramangala Branch", "Koramangala, Bangalore"),
                new Branch("Indiranagar Branch", "Indiranagar, Bangalore"),
                new Branch("Jayanagar Branch", "Jayanagar, Bangalore"),
                new Branch("Bannerghatta Branch", "Bannerghatta Road, Bangalore"),
                new Branch("Electronic City Branch", "Electronic City, Bangalore"),
                new Branch("HSR Layout Branch", "HSR Layout, Bangalore"),
                new Branch("Hebbal Branch", "Hebbal, Bangalore"),
                new Branch("Yeshwantpur Branch", "Yeshwantpur, Bangalore")
        );
        model.addAttribute("bankName", "MyBank");
        model.addAttribute("branches", branches);
        return "branches";
    }

    @GetMapping("/services")
    public String getServices(Model model) {
        List<Service> services =Arrays.asList(
                new Service("Savings Account", "Open and manage a savings account."),
                new Service("Current Account", "Open and manage a current account."),
                new Service("Fixed Deposits", "Invest in fixed deposit schemes."),
                new Service("Loans", "Various types of loans available."),
                new Service("Internet Banking", "Bank from anywhere with internet banking."),
                new Service("Mobile Banking", "Bank from your smartphone."),
                new Service("Credit Cards", "Get credit cards with exciting benefits."),
                new Service("Debit Cards", "Access your funds with ease."),
                new Service("Insurance", "Wide range of insurance products."),
                new Service("Mutual Funds", "Invest in mutual funds.")
        );
        model.addAttribute("bankName", "MyBank");
        model.addAttribute("services", services);
        return "services";
    }

}
