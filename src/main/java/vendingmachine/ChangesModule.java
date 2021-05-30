package vendingmachine;

public class ChangesModule {
    private int changes;

    public ChangesModule(){
        this(0);
    }

    public ChangesModule(final int changes) {
        this.changes = changes;
    }

    public void put(final int changes){
        this.changes += changes;
    }

    public void withdraw(final int changes){
        final int i = this.changes - changes;
        if(i < 0){
            throw new IllegalStateException();
        }
        this.changes -= changes;
    }

    public int getChanges(){
        return changes;
    }
}
