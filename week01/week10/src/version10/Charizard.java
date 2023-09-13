package version10;

public class Charizard extends Pokemon{
    public Charizard() {
// private로 되어 있어서 외부에서 접근 x = 오류남       level = 36;
        this.level = 36;
//        this.setLevel(36);
        this.setHp(78);
        this.name = "리자몽";
    }

    @Override
    void attack() {
       // super.attack();
        System.out.println(this.name + "이(가) 광역 화염 공격을 시전합니다");
    }
}
