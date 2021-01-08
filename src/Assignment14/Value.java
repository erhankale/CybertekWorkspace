package Assignment14;

public class Value {

    private boolean modified = false;
    public int value;

    public Value(int v){
        this.value = v;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int st){
        this.value =st;
        modified=true;
    }

    public boolean wasModified(){
        return modified;
    }
}
