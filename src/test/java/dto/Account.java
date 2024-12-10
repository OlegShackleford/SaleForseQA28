package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Account {

    private String rating;
    private String accountName;
    private String phone;
    private String fax;
    private String accountNumber;
    private String website;
    private String accountSite;
    private String tickerSymbol;
    private String type;
    private String ownership;
    private String industry;
    private String employees;
    private String annualRevenue;
    private String sicCode;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String state;
    private String billingZip;
    private String billingCountry;
    private String shippingCity;
    private String stateProvince;
    private String shippingZip;
    private String shippingCountry;
    private String customerPriority;
    private String SLA;
    private String numberOfLocations;
    private String active;
    private String SLASerialNumber;
    private String upsellOpportunity;
    private String description;
}
