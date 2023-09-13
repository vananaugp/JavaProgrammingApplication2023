package version10;

public class Squirtle extends Pokemon{

    public Squirtle(){
        //this.setLevel(1);
        this.level = 1;
        this.setHp(44);
        this.name = "꼬북이";

    }

    @Override
    void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 물대포를 시전합니다");
    }
}
