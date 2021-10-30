package oo;

class Fish{
    int weight;
}
class Lake{
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void eat(int n){
        fish.weight = fish.weight + n;
    }
}
public class FishandLake{
    public static void main(String[] args) {
        Fish niqiu = new Fish();
        System.out.println("泥鳅:"+niqiu.weight);
        Lake taihu  = new Lake();
        taihu.setFish(niqiu);
        taihu.eat(15);
        System.out.println(niqiu.weight);
        System.out.println(taihu.fish.weight);
        Lake huanghe = new Lake();
        huanghe.setFish(niqiu);
        huanghe.eat(220);
        System.out.println("泥鳅："+niqiu.weight);
        System.out.println("huanghe里的泥鳅："+huanghe.fish.weight);
        System.out.println("taihu里的泥鳅："+taihu.fish.weight);
    }
}

