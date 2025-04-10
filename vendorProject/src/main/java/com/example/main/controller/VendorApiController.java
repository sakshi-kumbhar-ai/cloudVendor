package com.example.main.controller;

import org.springframework.web.bind.annotation.*;

import com.example.main.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class VendorApiController {

    private CloudVendor cloudvendor;

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        // You can add condition based on vendorId if needed
        return cloudvendor;
    }

    @PostMapping
    public String cloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudvendor = cloudVendor;
        return "Cloud vendor created successfully!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudvendor = cloudVendor;
        return "Cloud vendor updated successfully!";
    }

    @DeleteMapping("/vendordelete/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId) {
        this.cloudvendor = null;
        return "Cloud vendor deleted successfully!";
    }
}
