package tools;
public class Calc{
    int num1;
    int num2;
    Calc(){

    }
    Calc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int add(){
        return this.num1+this.num2;
    }
    public int sub(){
        return this.num1-this.num2;
    }


}