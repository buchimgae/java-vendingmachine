package vendingmachine;

public class VendingMachine {
    private int changes;

    
    public void put(final int changes){
        this.changes = changes;
    }
    public int getChanges(){
        return changes;
    }
}
