public class Inventory {
    private int serialNum;
    private String manufactDate;
    private int lotNum;
    
    Inventory(){
        this.serialNum = 0;
        this.manufactDate = "";
        this.lotNum = 0;
    }
    Inventory(int serialNumber, String manufacturerDate, int lotNumber){
        this.serialNum = serialNumber;
        this.manufactDate = manufacturerDate;
        this.lotNum = lotNumber;
    }
    public void setSerialNum(int serialNumber){
        this.serialNum = serialNumber;
    }
    public void setManufacturerDate(String manufacturerDate){
        this.manufactDate = manufacturerDate;
    }
    public void setLotNum(int lotNumber){
        this.lotNum = lotNumber;
    }
    public int getSerialNum(){
        return this.serialNum;
    }
    public String getManufacturerDate(){
        return this.manufactDate;
    }
    public int getLotNum(){
        return this.lotNum;
    }
}
