package Assignment14;

public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double addition){
        amount += addition;
        if( amount>capacity){
            amount=capacity;
        }
    }

    public void useGas(double used){
        amount -=used;
        if (amount<0){
            amount=0;
        }
    }

    public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (capacity-amount<0.1){
            return true;
        }else{
            return false;
        }
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        double differ = capacity-amount;
        addGas(differ);
        return differ;

    }

    public static void main(String[] args) {
        GasTank gt = new GasTank(100);
        System.out.println(gt.getGasLevel());
        gt.addGas(50);
        System.out.println(gt.getGasLevel());
        System.out.println(gt.isFull());
        System.out.println(gt.fillUp());
        System.out.println(gt.getGasLevel());


    }
}

