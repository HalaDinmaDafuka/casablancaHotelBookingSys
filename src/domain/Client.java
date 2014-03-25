package domain;

public class Client {

    private int client_no;
    private String client_name;
    private String client_surname;
    private String client_address;
    private int client_passport;
    private String client_country;
    private int client_phone;
    private String client_email;
    private String client_agency;

    public Client(int client_no, String client_name, String client_surname, String client_address) {
        this.client_no = client_no;
        this.client_name = client_name;
        this.client_surname = client_surname;
        this.client_address = client_address;
    }

    public Client(int client_no, int client_passport, String client_country, int client_phone, String client_email, String client_agency) {
        this.client_no = client_no;
        this.client_passport = client_passport;
        this.client_country = client_country;
        this.client_phone = client_phone;
        this.client_email = client_email;
        this.client_agency = client_agency;
    }

    public int getClient_no() {
        return client_no;
    }

    public void setClient_no(int client_no) {
        this.client_no = client_no;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_surname() {
        return client_surname;
    }

    public void setClient_surname(String client_surname) {
        this.client_surname = client_surname;
    }

    public String getClient_address() {
        return client_address;
    }

    public void setClient_address(String client_address) {
        this.client_address = client_address;
    }

    public int getClient_passport() {
        return client_passport;
    }

    public void setClient_passport(int client_passport) {
        this.client_passport = client_passport;
    }

    public String getClient_country() {
        return client_country;
    }

    public void setClient_country(String client_country) {
        this.client_country = client_country;
    }

    public int getClient_phone() {
        return client_phone;
    }

    public void setClient_phone(int client_phone) {
        this.client_phone = client_phone;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getClient_agency() {
        return client_agency;
    }

    public void setClient_agency(String client_agency) {
        this.client_agency = client_agency;
    }

    @Override
    public String toString() {
        return "Name: " + client_name + "\n"
                + "Surname: " + client_surname + "\n"
                + "Adress: " + client_address + '}';
    }

    public String toString2() {
        return "Passport: " + client_passport + "\n"
                + "Country: " + client_country + "\n"
                + "Phone: " + client_phone + "\n"
                + "Email: " + client_email + "\n"
                + "Agency: " + client_agency + '}';
    }
}
