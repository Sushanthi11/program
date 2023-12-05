package org.example;

public interface RBI {
    public void withdraw() ;
    public void deposit();
    public void internetbanking();
    public void loan();
    public default void goldloan(){

    }
}
