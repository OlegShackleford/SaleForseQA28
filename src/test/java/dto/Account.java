package dto;

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

    public Account(String rating, String accountName, String phone, String fax, String accountNumber,
                   String website, String accountSite, String tickerSymbol, String type, String ownership,
                   String industry, String employees, String annualRevenue, String sicCode,
                   String billingStreet, String shippingStreet, String billingCity, String state,
                   String billingZip, String billingCountry, String shippingCity, String stateProvince,
                   String shippingZip, String shippingCountry, String customerPriority, String SLA,
                   String numberOfLocations, String active, String SLASerialNumber, String upsellOpportunity,
                   String description) {
        this.rating = rating;
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.accountNumber = accountNumber;
        this.website = website;
        this.accountSite = accountSite;
        this.tickerSymbol = tickerSymbol;
        this.type = type;
        this.ownership = ownership;
        this.industry = industry;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.sicCode = sicCode;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.billingCity = billingCity;
        this.state = state;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.shippingCity = shippingCity;
        this.stateProvince = stateProvince;
        this.shippingZip = shippingZip;
        this.shippingCountry = shippingCountry;
        this.customerPriority = customerPriority;
        this.SLA = SLA;
        this.numberOfLocations = numberOfLocations;
        this.active = active;
        this.SLASerialNumber = SLASerialNumber;
        this.upsellOpportunity = upsellOpportunity;
        this.description = description;

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAccountSite() {
        return accountSite;
    }

    public void setAccountSite(String accountSite) {
        this.accountSite = accountSite;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getCustomerPriority() {
        return customerPriority;
    }

    public void setCustomerPriority(String customerPriority) {
        this.customerPriority = customerPriority;
    }

    public String getSLA() {
        return SLA;
    }

    public void setSLA(String SLA) {
        this.SLA = SLA;
    }

    public String getNumberOfLocations() {
        return numberOfLocations;
    }

    public void setNumberOfLocations(String numberOfLocations) {
        this.numberOfLocations = numberOfLocations;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSLASerialNumber() {
        return SLASerialNumber;
    }

    public void setSLASerialNumber(String SLASerialNumber) {
        this.SLASerialNumber = SLASerialNumber;
    }

    public String getUpsellOpportunity() {
        return upsellOpportunity;
    }

    public void setUpsellOpportunity(String upsellOpportunity) {
        this.upsellOpportunity = upsellOpportunity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
