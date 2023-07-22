public class Address {
        private String province;
        private String commune;
        private String district;
        private String numberApartment;

    public Address() {
    }

    public Address(String province, String commune, String district, String numberApartment) {
        this.province = province;
        this.commune = commune;
        this.district = district;
        this.numberApartment = numberApartment;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNumberApartment() {
        return numberApartment;
    }

    public void setNumberApartment(String numberApartment) {
        this.numberApartment = numberApartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", commune='" + commune + '\'' +
                ", district='" + district + '\'' +
                ", numberApartment='" + numberApartment + '\'' +
                '}';
    }
}