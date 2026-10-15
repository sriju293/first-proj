package tools;

public class AdvCalc extends Calc{
    int num1;
    int num2;
    AdvCalc(int num1,int num2){
        super();
        this.num1=num1;
        this.num2=num2;
    }
    public int mul(){
        return this.num1*this.num2;
    }
    public int div(){
        return this.num1/this.num2;
    }
}
