
package com.com470.p4app.model;

import java.util.Objects;


public class Minimo_maximo {
    Integer min;
    Integer max;

    public Minimo_maximo(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.min);
        hash = 73 * hash + Objects.hashCode(this.max);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Minimo_maximo other = (Minimo_maximo) obj;
        if (!Objects.equals(this.min, other.min)) {
            return false;
        }
        if (!Objects.equals(this.max, other.max)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Minimo_maximo{" + "min=" + min + ", max=" + max + '}';
    }

    

    
    
    
}
