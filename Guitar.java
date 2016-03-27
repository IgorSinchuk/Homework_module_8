public class Guitar {
    private String celebrityName;
    private String guitarBrand;
    private String guitarType;

    public Guitar(final String.celebrityName, final String.guitarBrand, final String.guitarType) {
        this.celebrityName = celebrityName;
        this.guitarBrand = guitarBrand;
        this.guitarType = guitarType;


    }

    public String getCelebrityName() {
        return celebrityName;
    }

    public String getGuitarBrand() {
        return guitarBrand;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String toString() {
        return "Guitar{" +
                "celebrityName '" +  celebrityName + '\'' +
                "guitarBrand '" + guitarBrand + '\'' +
                "guitarType'" + guitarType + '\'' +
                '}';
    }
}
