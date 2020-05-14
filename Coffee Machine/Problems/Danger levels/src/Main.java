enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int sections;

    DangerLevel(int sections) {
        this.sections = sections;
    }

    public int getLevel(){
        return sections;
    }

//    public static void main(String[] args) {
//
//        DangerLevel high = DangerLevel.HIGH;
//        DangerLevel medium = DangerLevel.MEDIUM;
//
//        System.out.println(high.getLevel() > medium.getLevel());
//    }
}
