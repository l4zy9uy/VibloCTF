package vn.cmcglobal.coding1;

public class y {

    private int c = 0;
    private String f;

    public void setFlag(String f){
        c +=1;
        if(c < 2){
            this.f = f;
        }
    }
}
