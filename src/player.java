public class player {
    String name;
    int id;
    static int playercount = 0;
    player(String name){
        this.name = name;
        id = ++playercount;
    }
    void printDetails(){
        System.out.println(id + " : " + name);
    }
}
