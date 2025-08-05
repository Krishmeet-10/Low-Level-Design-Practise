public interface Vehicle {
    public default Integer getNumberofWheels(){
        return 4;
    }

    public default boolean hasEnginer(){
        return true;
    }
    
    int x =0;

} 
