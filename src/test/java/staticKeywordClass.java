public class staticKeywordClass {
    public static String adress="Dasare";
    public static final String designation="Qualified";
    public String name;
    public String age;
    public staticKeywordClass(String name,String age){
        this.name=name;
        this.age=age;
    }
    public void printData(){
        System.out.println(name+age+adress);
    }
    public static void main(String[] args){
        staticKeywordClass skc = new staticKeywordClass("Praveen","32");;
        staticKeywordClass skc1 = new staticKeywordClass("Atharv","1");
        staticKeywordClass skc2 = new staticKeywordClass("Swaroop","10");
        staticKeywordClass skc3 = new staticKeywordClass("Adarsh","19");
        skc.printData();
        adress="DangerDasare";
        skc1.printData();
        skc2.printData();
        skc3.printData();
    }
}
