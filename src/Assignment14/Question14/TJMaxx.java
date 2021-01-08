package Assignment14.Question14;

//represents TJMaxx store class
//http://tjmaxx.com/

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {

    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    public TJMaxx() {
        this.regularItems = new ArrayList<>() ;
        this.onSaleItems = new ArrayList<>();
    }

    public void addRegularItem(Item item){
        regularItems.add(item);
    }

    public void addOnSaleItem(OnSaleItem item){
        onSaleItems.add(item);
    }

    public List<Item> getRegularItems() {
        return regularItems;
    }

    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }

    public int regularItemsCount(){
        return regularItems.size();
    }

    public int onSaleItemsCount(){
        return onSaleItems.size();
    }

    public List<String> getAllItemNames(){
        List<String> namesItems = null;
        for (Item each : regularItems) {
            namesItems.add(each.getName());
        }
        for (OnSaleItem each : onSaleItems) {
            namesItems.add(each.getName());
        }
        return namesItems ;
    }

    public double getItemPrice(int catalogNumber){
        for (Item each : regularItems) {
            if (each.getCatalogNumber() == catalogNumber) {
                return each.getPrice();
            }
        }
        for (OnSaleItem each2 : onSaleItems) {
            if (each2.getCatalogNumber() == catalogNumber) {
                return each2.getPrice();
            }
        }
        return 0.0;
    }

    public OnSaleItem getOnSaleItem(String name){
        for (OnSaleItem each : onSaleItems) {
            if(each.getName().equalsIgnoreCase(name)){
                return each;
            }
        }
        return null;
    }

    public void removeItem(int catalogNumber){
        for (Item each : regularItems) {
            if (each.getCatalogNumber()==catalogNumber){
                regularItems.remove(each);

            }
        }
        for (OnSaleItem each : onSaleItems) {
            if(each.getCatalogNumber()==catalogNumber){
                onSaleItems.remove(each);
            }
        }
    }

    public void buyItem(int catalogNumber){

        for (Item each : regularItems) {
            if (each.getCatalogNumber()==catalogNumber){
                if(regularItems.size()-1==0){
                    removeItem(catalogNumber);
                }
            }
        }
        for (OnSaleItem each : onSaleItems) {
            if(each.getCatalogNumber()==catalogNumber){
                if(onSaleItems.size()-1==0){
                    removeItem(catalogNumber);
                }
            }
        }
    }
}
