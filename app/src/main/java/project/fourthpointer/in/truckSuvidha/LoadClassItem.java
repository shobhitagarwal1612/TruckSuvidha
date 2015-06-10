package project.fourthpointer.in.truckSuvidha;


public class LoadClassItem {
    private String postingId;
    private String sourceCity;
    private String destinationCity;
    private String distance;
    private String weight;
    private String scheduleDate;
    private String material;
    private String truckType;
    private String register;
    private String postedBy;

    public void setpostingId(String postingId) {
        this.postingId = postingId;
    }

    public void setSourceCity(String image){

        this.sourceCity=image;
    }
    public void setDestinationCity(String location) {
        this.destinationCity = location;
    }

    public void setDistance(String religion) {
        this.distance=religion;
    }
    public void setWeight(String caste) {
        this.weight = caste;
    }

    public void setScheduleDate(String email) {
        this.scheduleDate=email;
    }
    public void setMaterial(String location) {
        this.material = location;
    }

    public void setTruckType(String religion) {
        this.truckType=religion;
    }
    public void setRegister(String caste) {
        this.register = caste;
    }

    public void setPostedBy(String email) {
        this.postedBy=email;
    }

    public String getPostingId() {
        return this.postingId;
    }

    public String getSourceCity() {
        return this.sourceCity;
    }

    public String getDestinationCity() {
        return this.destinationCity;
    }

    public String getDistance() {
        return this.distance;
    }
    public String getWeight() {
        return this.weight;
    }
    public String getScheduleDate(){
        return this.scheduleDate;
    }
    public String getMaterial() {
        return this.material;
    }

    public String getTruckType() {
        return this.truckType;
    }
    public String getRegister() {
        return this.register;
    }
    public String getPostedBy(){
        return this.postedBy;
    }
}

