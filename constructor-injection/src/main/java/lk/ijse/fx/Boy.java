package lk.ijse.fx;

public class Boy {
    public void chatWithGirl(){
        Agrement agrement = new Girl();
        agrement.chat();
    }

    Agrement agrement;
    public Boy(Agrement a){
        this.agrement = a;
    }
    public Boy(){

    }
    public void test(){
        Agrement agrement = new Girl();
        agrement.chat();
    }
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
        boy.test();
    }
}
