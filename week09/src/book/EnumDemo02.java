package book;
enum Gender {
    MALE("남성"), FEMALE("여성");

    private String s;

    Gender(String s) {
        this.s = s;
    }

   // public String toString() {
    //    return s;
   // }


   
       public String toString() {
           return "성별>> " + s;

}


    public static void main(String[] args) {
        Gender1 gender = Gender1.FEMALE;
        if (gender == Gender1.MALE)
            System.out.println(Gender.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");

        for(Gender g : Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));
    }
}


