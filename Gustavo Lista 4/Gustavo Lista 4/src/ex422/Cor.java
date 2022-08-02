package ex422;

public class Cor {
    
    private int r;
    private int g;
    private int b;

    public Cor(int r, int g, int b) {
        if(r < 0){
            this.r = 0;
        } else if(r > 255) {
            this.r = 255;
        } else {
           this.r = r; 
        }
        
        if(g < 0){
            this.g = 0;
        } else if(g > 255) {
            this.g = 255;
        } else {
           this.g = g; 
        }
        
        if(b < 0){
            this.b = 0;
        } else if(b > 255) {
            this.b = 255;
        } else {
           this.b = b; 
        }
    }
    
    public Cor clarear() {
        double rn,gn,bn;
        
        
        if(this.r == 0 && this.g == 0 && this.b == 0) {
            rn = 3;
            gn = 3;
            bn = 3;
        } else {
        
            if(this.r < 3 && this.r > 0) {
                rn = 3 / 0.7;
            } else {
                rn = this.r / 0.7;
                if(rn > 255) {
                    rn = 255;
                }
            }

            if(this.g < 3 && this.g > 0) {
                gn = 3 / 0.7;
            } else {
                gn = this.g / 0.7;
                if(gn > 255) {
                    gn = 255;
                }
            }

            if(this.b < 3 && this.b > 0) {
                bn = 3 / 0.7;
            } else {
                bn = this.b / 0.7;
                if(bn > 255) {
                    bn = 255;
                }
            }
        }
        
        Cor nova = new Cor((int) rn, (int) gn, (int) bn);
        this.r = nova.r;
        this.g = nova.g;
        this.b = nova.b;
        
        return nova;
        
    }
    
    public Cor escurecer() {
        double rn,gn,bn;
        
        
        rn = this.r * 0.7;
        if(rn < 0) {
            rn = 0;
        }

        gn = this.g * 0.7;
        if(gn < 0) {
            gn = 0;
        }


        
        bn = this.b * 0.7;
        if(bn < 0) {
            bn = 0;
        }

        
        
        Cor nova = new Cor((int) rn, (int) gn, (int) bn);
        this.r = nova.r;
        this.g = nova.g;
        this.b = nova.b;
        
        return nova;
        
    }

    public String toString() {
        return "[" + r + ", " + g + ", " + b + "]";
    } 
}
